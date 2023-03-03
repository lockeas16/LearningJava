package com.clasesjava.one;

public class Pelicula {
	String tipo;
	float duracion;
	String clasificacion;
	String reseña;
	
	//Metodos
	String obtenerInformacion () {
		return "Tipo: " + tipo + " | Duración: " + duracion + " | Clasificación: " + clasificacion + "\n" + "Reseña: " + reseña;
	}
	
	void imprimirReseña() {
		System.out.println("\"" + reseña + "\"");
	}
}
