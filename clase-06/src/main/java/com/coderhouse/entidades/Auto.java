package com.coderhouse.entidades;

import com.coderhouse.abstractas.Vehiculo;

public class Auto extends Vehiculo {

	@Override
	protected void encender() {

	}

	@Override
	protected void apagar() {

	}

	@Override
	protected void mover() {

	}

	@Override
	public String toString() {
		return "Auto [Marca: " + getMarca() + " Modelo: "+ getModelo() + " Color: " + getColor() + " Ruedas: " + getRuedas() + " ] ";
	}
	
	

}
