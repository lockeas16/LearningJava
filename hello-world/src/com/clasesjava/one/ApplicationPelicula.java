package com.clasesjava.one;

public class ApplicationPelicula {

	public static void main(String[] args) {
		Pelicula peliculita = new Pelicula(), peliculon = new Pelicula();
		// Asignacion de atributos de los objetos
		// Objeto peliculita
		peliculita.tipo = "Terror";
		peliculita.clasificacion = "C";
		peliculita.duracion = 1.33f;
		peliculita.reseña = "Una pelicula de terror más del montón, con sustos baratos y sin esfuerzo alguno de ofrecer una experiencia memorable";
		// Objeto peliculon
		peliculon.tipo = "Comedia";
		peliculon.clasificacion = "B";
		peliculon.duracion = 1.28f;
		peliculon.reseña = "No paré de reir toda la pelicula, nunca creí que la actuación de animales provocaría tanta risa";
		// Llamamos el metodo obtenerInformacion de ambos objetos
		System.out.println(peliculita.obtenerInformacion());
		System.out.println(peliculon.obtenerInformacion());
		// Llamamos el metodo imprimirReseña de ambos objetos
		peliculita.imprimirReseña();
		peliculon.imprimirReseña();
	}

}
