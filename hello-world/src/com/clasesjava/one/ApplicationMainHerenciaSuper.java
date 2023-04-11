package com.clasesjava.one;

public class ApplicationMainHerenciaSuper {

	public static void main(String[] args) {
		Persona unaPersona =  new Persona("Mario", 31, false);
		System.out.println(unaPersona.obtenerInformacionPersona());
		System.out.println("--------------------------------------");
		
		Estudiante unEstudiante = new Estudiante("Antonio",31,true,"Computation",6);
		System.out.println(unEstudiante.obtenerInformacionEstudiante());
		System.out.println("--------------------------------------");
		
		Profesor unProfesor =  new Profesor("Maestria");
		unProfesor.setNombre("Mario Antonio");
		unProfesor.setEdad(31);
		unProfesor.setGenero(true);
		// Podemos usar el metodo de la clase padre
		System.out.println(unProfesor.obtenerInformacionPersona());
		// Y aparte el de la propia clase
		System.out.println(unProfesor.obtenerInformacionProfesor());
		System.out.println("--------------------------------------");
	}
}
