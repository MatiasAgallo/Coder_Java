package com.coderhouse.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.models.Alumno;
import com.coderhouse.service.AlumnoService;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	
	
	@GetMapping
	public ResponseEntity<List<Alumno>> getAllAlumnos(){
		try {
			List<Alumno> alumnos = alumnoService.getAllAlumnos();
			return ResponseEntity.ok(alumnos);	
			} catch(Exception e){
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();	
			}
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Alumno> getAlumnoById(@PathVariable Long id){
		try {
			Alumno alumno = alumnoService.findById(id);
			return ResponseEntity.ok(alumno);
		}catch(IllegalArgumentException e){
			return ResponseEntity.notFound().build();
			
		} catch(Exception e){
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PostMapping
	public ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumno) {
		try {
			Alumno alumnoCreado = alumnoService.saveAlumno(alumno);
			return ResponseEntity.status(HttpStatus.CREATED).body(alumnoCreado);
			
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Alumno> updateAlumnoById(@PathVariable Long id, @RequestBody Alumno alumnoModificado) {
		try {
			Alumno updateAlumno = alumnoService.updateAlumnoById(id, alumnoModificado);
			return ResponseEntity.ok(updateAlumno);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build(); // 404
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 500
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteAlumnoById(@PathVariable Long id) {
		try {
			alumnoService.deleteAlumnoById(id);
			return ResponseEntity.noContent().build(); // 204

		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build(); // 404

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 500
		}
	}

}
