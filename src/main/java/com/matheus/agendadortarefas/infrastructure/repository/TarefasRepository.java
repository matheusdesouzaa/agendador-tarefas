package com.matheus.agendadortarefas.infrastructure.repository;

import com.matheus.agendadortarefas.business.dto.TarefasDTO;
import com.matheus.agendadortarefas.infrastructure.entity.TarefasEntity;
import com.matheus.agendadortarefas.infrastructure.enums.StatusNotificacaoEnum;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TarefasRepository extends MongoRepository<TarefasEntity, String> {

    List<TarefasEntity> findByDataEventoBetweenAndStatusNotificacaoEnum(LocalDateTime dataInicial,
                                                                        LocalDateTime dataFinal,
                                                                        StatusNotificacaoEnum status);

    List<TarefasEntity> findByEmailUsuario(String token);
}
