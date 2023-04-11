package com.clasesjava.one;

public class Estudiante extends Persona {
	/*
	 * La clase Estudiante tendrá acceso a todos los atributos y métodos que asi se
	 * definan en la visibilidad (esto es todo menos lo private). Esto serán los
	 * constructores más métodos getters y setters
	 */
	// Podemos definir atributos propios en la clase hija
	private String carrera;
	private Integer semestre;

	/*
	 * Al definir un constructor, ya no se genera por "default" un constructor vacio
	 * por lo que nos corresponderá definirlo de manera explícita
	 */
	public Estudiante() {
		// Con la palabra reservada super, mandamos a llamar el constructor de la clase
		// padre. En este caso mandamos a llamar al constructor vacio
		super();
	}

	public Estudiante(String carrera) {
		this.carrera = carrera;
		this.semestre = 1;
	}

	public Estudiante(String carrera, Integer semestre) {
		this.carrera = carrera;
		this.semestre = semestre;
	}

	// Dentro de un método de la clase hija podemos mandar a llamar métodos de la
	// clase padre, que en este caso usaremos un metodo para concatenar la cadena devuelta
	public String obtenerInformacionEstudiante() {
		return this.obtenerInformacionPersona() + "\nCarrera: " + this.carrera + "\nSemestre: " + this.semestre;
	}
}
