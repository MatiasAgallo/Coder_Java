package com.coderhouse.mascotas;

import com.coderhouse.PerroException;

public class Mascotas {
	
	private static final int EDAD_MAXIMA = 16;
	
	String nombre;
	
	String color;
	
	String tamanio;
	
	Integer edad;
	
	String mensajeDeError = "La mascota no vive mas de " + " anios ";
	
	public void comer() {
		System.out.println("La mascota esta comiendo");
	}
	
	public void caminar() {
		System.out.println("La mascota esta caminando");
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamanio() {
		return this.tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public void setEdad(Integer edad) throws PerroException{ 
		if (edad > EDAD_MAXIMA) {
			throw new PerroException (mensajeDeError);
		}
		
			this.edad = edad;
		
	}

	@Override
	public String toString() {
		return "Mascotas [nombre=" + nombre + ", color="
				+ color + ", tamanio=" + tamanio + ", edad=" + edad + "]";
	}

		
	
	
	
	
	}

	


