package com.clasesjava.one;

public class ApplicationMainPolimorf {

	public static void main(String[] args) {
		// Creamos un objeto tipo Persona que se comporta como Persona
		Persona unaPersona = new Persona("Persona", 40, false);
		// Aqui podemos ver que el toString que se usa es el de la clase Persona porque
		// fue el constructor que se usó
		System.out.println("--------------------------------------");
		System.out.println("toString de implementación Persona");
		System.out.println(unaPersona);
		System.out.println("--------------------------------------");

		/*
		 * Creamos un objeto de tipo Persona (unEstudiante) pero que se comporta como un
		 * Estudiante ya que estamos usando un constructor de la clase Estudiante
		 * 
		 * Esto es posible porque Estudiante hereda de la clase Persona
		 */
		Persona unEstudiante = new Estudiante("Antonio", 31, true, "Computation", 6);
		// En este caso se usa la implementación del tipo Estudiante porque se construyó
		// de esa manera
		System.out.println("toString de implementación Estudiante");
		// Es posible usar el método toString del tipo Estudiante porque sí se encuentra
		// implementado y esta sobreescribiendo al de la clase Padre
		System.out.println(unEstudiante);
		System.out.println("--------------------------------------");

		// Y ahora estamos creando un objeto de tipo Persona (unProfesor) que se
		// comporta como Profesor
		Persona unProfesor = new Profesor("Maestria");
		// Y finalmente aqui se usa la implementación del tipo Profesor
		System.out.println("toString de implementación Profesor");
		System.out.println(unProfesor);
		System.out.println("--------------------------------------");

		imprimirPersona(unaPersona);
		imprimirPersona(unEstudiante);
		imprimirPersona(unProfesor);

		/*
		 * Una limitante en el polimorfismo, es que sólo podemos usar los métodos del
		 * tipo declarado. Por ejemplo, unEstudiante esta declarado como Persona, se
		 * comporta como Estudiante, pero no podemos usar un método de dicho tipo porque
		 * esta declarado como Persona. Lo siguiente no es posible
		 * 
		 * unEstudiante.obtenerInformacionEstudiante();
		 * 
		 * Aunque unEstudiante se comporte como Estudiante, esta declarado como Persona
		 * y sólo se pueden usar los métodos implementados dentro de la clase padre
		 * Persona
		 * 
		 */
	}

	/*
	 * En este método, se aprovecha el polimorfismo al permitirnos darle un
	 * tratamiento genérico a todos los objetos sin tener que preocuparnos por sus
	 * comportamientos particulares. Así podemos dar un mismo tratamiento a todos
	 * los objetos de tipo Persona sin preocuparnos si se comportan como Estudiante
	 * o como Profesor
	 */
	public static void imprimirPersona(Persona unaPersona) {
		System.out.println(unaPersona);
		System.out.println("--------------------------------------");
	}
}
