package com.zamora.usuario.service;

import com.co.zamora.commons.service.CommonService;
import com.zamora.common.usuario.models.entity.Alumno; 



public interface AlumnoService extends CommonService<Alumno>{
	
	public Alumno save(Alumno alumno);
	public void deleteByid (Long id);
}
