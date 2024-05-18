package com.zamora.respuesta.service;

import org.springframework.stereotype.Service;

import com.co.zamora.commons.service.CommonService;
import com.co.zamora.commons.service.CommonServiceImpl;
import com.zamora.common.usuario.models.entity.Examen;
import com.zamora.respuesta.repository.ExamenRepository;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen,ExamenRepository> implements CommonService<Examen>{

}