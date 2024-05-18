package com.zamora.curso.service;

import org.springframework.stereotype.Service; 

import com.co.zamora.commons.service.CommonService;
import com.co.zamora.commons.service.CommonServiceImpl;
import com.zamora.common.usuario.models.entity.Curso;
import com.zamora.curso.repository.CursoRepository;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CommonService<Curso>{
	
}
