package com.zamora.respuesta.service;

import org.springframework.stereotype.Service; 

import com.co.zamora.commons.service.CommonService;
import com.co.zamora.commons.service.CommonServiceImpl;
import com.zamora.common.usuario.models.entity.Pregunta;
import com.zamora.respuesta.repository.PreguntaRepository;


@Service
public class PreguntaServiceImpl extends CommonServiceImpl<Pregunta, PreguntaRepository> implements CommonService<Pregunta>{
	
}
