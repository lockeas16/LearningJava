package com.clasesjava.one;

public class ApplicationMainHerencia {

	public static void main(String[] args) {
		// Objeto de tipo Estudiante
		Estudiante unEstudiante = new Estudiante();
		System.out.println("ESTUDIANTE unEstudiante");
		System.out.println("Nombre: " + unEstudiante.getNombre());
		System.out.println("Edad: " + unEstudiante.getEdad());
		System.out.println("Genero: " + unEstudiante.getGenero());
		System.out.println("--------------------------------------");
		// Objeto de tipo Persona
		Persona persona = new Persona("Pedro", 36, true);
		// Objeto de tipo Profesor
		Profesor unProfesor = new Profesor();
		// Aqui podriamos setear un atributo del objeto Profesor
		unProfesor.setNombre(persona.getNombre());
		// Y también podemos setear sus atributos usando el setter de la clase padre
		unProfesor.setEdad(27);
		System.out.println("PROFESOR unProfesor");
		System.out.println("Nombre: " + unProfesor.getNombre());
		System.out.println("Edad: " + unProfesor.getEdad());
		System.out.println("Genero: " + unProfesor.getGenero());
		System.out.println("--------------------------------------");

		// Todas las clases heredan de la clase Object por defecto
		Persona person = new Persona("Mario", 31, true);
		System.out.println("PERSONA person");
		System.out.println("Nombre: " + person.getNombre());
		System.out.println("Edad: " + person.getEdad());
		System.out.println("Genero: " + person.getGenero());
		// Metodos heredados de la clase Object
		System.out.println("hashCode: " + person.hashCode());
		System.out.println("toString: " + person.toString());
		System.out.println("--------------------------------------");
		// Y estos mismo métodos se pueden usar en la clase Estudiante, porque fueron
		// heredados primero por Persona y luego se propagaron a la clase Estudiante
		System.out.println("hashCode unEstudiante: " + person.hashCode());
		System.out.println("toString unEstudiante: " + person.toString());
		System.out.println("--------------------------------------");

		/*
		 * Generamos un estudiante con uno de sus constructores Este constructor no esta
		 * inicializando los atributos que hereda de Persona por lo que seran nulos
		 * hasta que se asignen con algun setter
		 */
		Estudiante student = new Estudiante("Computation");
		student.setNombre("Antonio");
		student.setEdad(25);
		student.setGenero(true);
		System.out.println("ESTUDIANTE student");
		System.out.println(student.obtenerInformacionEstudiante());
		System.out.println("--------------------------------------");

		/*
		 * Generamos un profesor con uno de sus constructores y mandamos a llamar
		 * metodos propios de esa clase hija
		 */
		Profesor otroProfesor = new Profesor("Maestro");
		otroProfesor.setNombre("Mario");
		otroProfesor.setEdad(31);
		otroProfesor.setGenero(true);
		// Agregamos un par de materias con uno de sus métodos
		otroProfesor.agregarMateria("Redes");
		otroProfesor.agregarMateria("Quimica");
		System.out.println("PROFESOR otroProfesor");
		System.out.println(otroProfesor.obtenerInformacionPersona());
		System.out.println(otroProfesor.obtenerInformacionProfesor());
		System.out.println("--------------------------------------");
	}
}
