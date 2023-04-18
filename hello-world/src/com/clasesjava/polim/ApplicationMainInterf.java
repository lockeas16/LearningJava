package com.clasesjava.polim;

public class ApplicationMainInterf {

	public static void main(String[] args) {
		Persona estudiante = new Estudiante("Antonio", 31, true, "Computation", 6);
		Persona profesor = new Profesor("Mario", 31, true, "Master");

		imprimirPersona(profesor);
		imprimirPersona(estudiante);

		// Podemos usar el tipo Responsabilidades para definir un objeto de ese tipo,
		// sin embargo es necesario el constructor de una clase no abstracta
		Responsabilidades estudianteConResp = new Estudiante("Mario", 31, false, "Redes", 5);
		// Aqui podemos usar los metodos de la interfaz porque estudianteConResp los
		// conoce
		System.out.println("--- Metodos de interfaz comportandose como Estudiante ---");
		estudianteConResp.atenderClase();
		estudianteConResp.prepararClase();
		estudianteConResp.presentarExamen();

		// Y podemos apreciar como cambiando el tipo de Objeto, los metodos se comportan
		// distinto
		Responsabilidades profesorConResp = new Profesor("Mario", 31, false, "Redes");
		// Aqui podemos usar los metodos de la interfaz porque estudianteConResp los
		// conoce
		System.out.println("--- Metodos de interfaz comportandose como Profesor ---");
		profesorConResp.atenderClase();
		profesorConResp.prepararClase();
		profesorConResp.presentarExamen();

		// unNino que es de tipo Persona se comportara como Nino
		Persona unNino = new Nino("mayito", 5, false);
		System.out.println("---imprimirPersona unNino comportandose como Nino ---");
		imprimirPersona(unNino);

		// Y gracias al polimorfismo, podemos usar la misma variable unNino para
		// asignarle un nuevo Objeto pero que es de tipo Estudiante
		unNino = new Estudiante("Mario", 25, true, "Fisica", 4);
		// y que se comporta como Estudiante
		System.out.println("---imprimirPersona unNino comportandose como Estudiante ---");
		imprimirPersona(unNino);
	}

	public static void imprimirPersona(Persona persona) {
		System.out.println(persona);
		persona.irAlEscuela();
		/*
		 * El siguiente método no se puede usar porque la Clase Persona no conoce este
		 * método 
		 * 
		 * persona.atenderClase();
		 * 
		 */
		System.out.println("------------------------");
	}

	public static void imprimirEstudiante(Estudiante estudiante) {
		System.out.println(estudiante);
		estudiante.irAlEscuela();
		System.out.println("------------------------");
	}

}
