package com.clasesjava.polim;

public class ApplicatioMainAbstract {

	public static void main(String[] args) {
		/* No es posible instanciar un objeto de una clase abstracta, solo se puede usar
		 * para definir tipos. Lo siguiente genera un error de compilación
		 * 
		 * Persona unaPersona = new Persona("Persona", 40, false);
		 */
		Persona unEstudiante = new Estudiante("Antonio", 31, true, "Computation", 6);
		// Aqui podemos ver que el metodo irAlEscuela es particular para el Estudiante
		printPerson(unEstudiante);
		
		Persona unProfesor = new Profesor("Mario",25, true,"Maestria");
		// Y en este caso el metodo irAlEscuela tiene la implementacion particular del tipo Profesor
		printPerson(unProfesor);
	}
	
	public static void printPerson(Persona person) {
		System.out.println(person);
		person.irAlEscuela();
		System.out.println("--------------------------------------");
	}

}
