package com.zamora.respuesta.repository;

import org.springframework.data.repository.CrudRepository;
import com.zamora.common.usuario.models.entity.Pregunta; 

public interface PreguntaRepository extends CrudRepository<Pregunta, Long>{

}