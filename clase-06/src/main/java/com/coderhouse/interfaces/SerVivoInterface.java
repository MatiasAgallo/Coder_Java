package com.coderhouse.interfaces;

public interface SerVivoInterface {
	//las interfaces no necesita definicion, en la interface son metodos que si o si tienen que estar
	String UBICACION = "Planeta Tierra";
	
	void emitirSonido();
	
	void moverse();
	
	void comer();

	boolean estaVivo();
	
}
