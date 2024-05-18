package com.zamora.curso.repository;

import org.springframework.data.repository.CrudRepository;

import com.zamora.common.usuario.models.entity.Curso; 

public interface CursoRepository extends CrudRepository<Curso, Long>{

}
