package com.clasesjava.polim;

class Estudiante extends Persona {
	private String carrera;
	private Integer semestre;

	// Es obligatorio que los métodos abstractos se implementen en las clases hijas
	@Override
	public void irAlEscuela() {
		// Esto nos permite darle un comportamiento particular al metodo para cada tipo
		System.out.println("Yo voy a la escuela en autobus");
	}
	
	public Estudiante() {
		super(); // Siempre es necesario primero llamar el constructor de la clase padre!
	}

	public Estudiante(String carrera) {
		this.carrera = carrera;
		this.semestre = 1;
	}

	public Estudiante(String carrera, Integer semestre) {
		this.carrera = carrera;
		this.semestre = semestre;
	}

	public Estudiante(String nombre, Integer edad, Boolean genero, String carrera, Integer semestre) {
		super(nombre, edad, genero);
		this.carrera = carrera;
		this.semestre = semestre;
	}

	public String obtenerInformacionEstudiante() {
		return this.obtenerInformacionPersona() + "\nCarrera: " + this.carrera + "\nSemestre: " + this.semestre;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public void setCarrera(Integer numeroCarrera) {
		switch (numeroCarrera) {
		case 1:
			this.carrera = "Computation";
			break;
		case 2:
			this.carrera = "Chemistry";
			break;
		case 3:
			this.carrera = "Physical";
			break;
		default:
			this.carrera = "Computation";
			break;
		}
	}

	public String getCarrera() {
		return this.carrera;
	}

	@Override
	public String toString() {
		return "Name: " + this.nombre + "\nAge: " + this.edad + "\nGender: " + this.genero + "\nCareer: " + this.carrera
				+ "\nSemester: " + this.semestre;
	}
}