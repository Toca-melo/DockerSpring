package com.zamora.respuesta.repository;

import org.springframework.data.repository.CrudRepository;

import com.zamora.common.usuario.models.entity.Examen;

public interface ExamenRepository extends CrudRepository<Examen, Long> {

}