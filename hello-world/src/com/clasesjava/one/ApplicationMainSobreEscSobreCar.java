package com.clasesjava.one;

public class ApplicationMainSobreEscSobreCar {

	public static void main(String[] args) {
		Persona unaPersona = new Persona("Mario", 31, false);
		// Aqui estamos mandando a llamar un metodo con sobreescritura, usando nuestra
		// implementacion. De otra manera usaría el de la clase padre (que sería el
		// toString de Object)
		System.out.println(unaPersona.toString());
		System.out.println("--------------------------------------");

		Estudiante unEstudiante = new Estudiante("Antonio", 31, true, "Computation", 6);
		// Observamos que el estudiante tiene la materia Computation
		System.out.println("ESTUDIANTE unEstudiante");
		System.out.println("Carrera: " + unEstudiante.getCarrera());
		// Aqui usamos la implementacion del metodo que recibe como argumente un Integer
		unEstudiante.setCarrera(2);
		// Y observamos que ya hemos actualizado su valor
		System.out.println("Nueva Carrera: " + unEstudiante.getCarrera());
		// Ahora usamos la otra implementación del método setCarrera que puede recibir
		// un String
		unEstudiante.setCarrera("Matematicas");
		System.out.println("Otra nueva Carrera: " + unEstudiante.getCarrera());

		/*
		 * Podemos observar como podemos hacer la sobreescritura de un metodo ya
		 * sobrescrito de una clase padre. Aqui toma precedencia la implementacion de la
		 * propia clase. En este caso se usara el toString de la clase Estudiante en
		 * lugar del toString de la Clase Persona
		 * 
		 * Si imprimimos directamente el objeto, se usa por defecto su metodo toString
		 */
		System.out.println(unEstudiante);
	}
}
