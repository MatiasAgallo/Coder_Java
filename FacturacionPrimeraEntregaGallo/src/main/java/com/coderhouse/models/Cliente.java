package com.coderhouse.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = " Clientes ")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Nombre")
	private String nombre;
	
	
	private String apellido;
	
	@Column(unique = true, nullable = false)
	private int dni;
	
	@Column(unique = true, nullable = false)
	private String mail;
	
	private LocalDateTime createdAt;
	
	@ManyToMany(mappedBy = "clientes" , fetch = FetchType.EAGER)
	private List<Producto> productos = new ArrayList<>();

	public Cliente() {
		super();
	}

	public Cliente(String nombre, String apellido, int dni, String mail) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.mail = mail;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", mail=" + mail + "]";
	}
	
	
	
	
	
	
	
}
