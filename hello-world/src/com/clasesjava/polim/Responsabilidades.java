package com.clasesjava.polim;

/*
 * Una interfaz solo nos va a decir los métodos que 
 * se pueden implementar en otras clases
 */
public interface Responsabilidades {
	// La interfaz sólo tiene "firmas" de métodos sin implementación
	void atenderClase();

	// Los metodos de una interfaz por defecto tienen visibilidad pública
	void prepararClase();

	void presentarExamen();
}
