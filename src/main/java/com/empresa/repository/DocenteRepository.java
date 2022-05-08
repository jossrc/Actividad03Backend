package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.empresa.entity.Docente;

public interface DocenteRepository extends JpaRepository<Docente, Integer> {

	@Query("select d from Docente d where (?1 is '' or d.nombre like ?1) and (?2 is '' or d.dni = ?2) and (?3 is -1 or d.ubigeo.idUbigeo = ?3)")
	public List<Docente> listaDocente(String nombre, String dni, int idUbigeo );
	
}


