package com.zamora.common.usuario.models.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="cursos")
public class Curso {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	@Column(name="create_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
	@OneToMany(fetch = FetchType.LAZY)
    private List<Alumno> listaAlumno;
    public Long getid() {
        return id;
    }
	@PrePersist
	private void prePresist() {
		this.createAt = new Date();
	}
	
	public Curso(Long id, String nombre, Date createAt) {
		this.listaAlumno = new ArrayList<>();
		this.id = id;
		this.nombre = nombre;
		this.createAt = createAt;
	}
	

	public Curso() {
		
	}
	
	public String ToString() {
		return this.id + this.nombre + this.createAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public List<Alumno> getListaAlumno() {
        return listaAlumno;
    }
    public void setListaAlumno(List<Alumno> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }
    public void addAlumnos(Alumno alumno) {
        this.listaAlumno.add(alumno);
    }
    public void removeAlumnos(Alumno alumno) {
        this.listaAlumno.remove(alumno);
    }
}
