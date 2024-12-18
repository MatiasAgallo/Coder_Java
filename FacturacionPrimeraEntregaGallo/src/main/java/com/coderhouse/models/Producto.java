package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "Productos")
public class Producto {
	
	@Id//Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String marca;
	
	private String nombre;
	
	private int anio;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name =" cliente_producto ", 
	joinColumns = @JoinColumn(name = "producto_id"),
	inverseJoinColumns = @JoinColumn (name = "cliente_id"))
	private List<Cliente> clientes = new ArrayList<>();
	

	public Producto() {
		super();
	}
	
	
	
	public Producto(String marca, String nombre, int anio) {
		super();
		this.marca = marca;
		this.nombre = nombre;
		this.anio = anio;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
	
	
	
	
	
}
