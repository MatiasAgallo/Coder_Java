package com.coderhouse.abstractas;

public abstract class Vehiculo {
	//Metodos y atributos que quiero que tenga todos los hijos
	protected String marca;
	
	protected String modelo;
	
	protected String color;
	
	protected Integer ruedas;
	
	
	protected abstract void encender();
	
	protected abstract void apagar();
	
	protected abstract void mover();
	
	public void mostarCantidadDeRuedas() {
		System.out.println("Mi vehiculo marca " + getMarca() + " tiene " + getRuedas() + " ruedas.");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getRuedas() {
		return ruedas;
	}

	public void setRuedas(Integer ruedas) {
		this.ruedas = ruedas;
	}
	
	
	

}
