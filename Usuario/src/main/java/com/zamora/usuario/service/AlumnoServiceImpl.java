package com.zamora.usuario.service;

import java.util.Optional; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zamora.common.usuario.models.entity.Alumno;
import com.zamora.usuario.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	@Autowired
	AlumnoRepository dao;
	
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Alumno> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Alumno> findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	@Transactional
	public Alumno save(Alumno alumno) {
		// TODO Auto-generated method stub
		return dao.save(alumno);
	}

	@Override
	@Transactional
	public void deleteByid(Long id) {
		dao.deleteById(id);
		
	}
}	
