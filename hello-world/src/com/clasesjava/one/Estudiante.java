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
		/*
		 * Con la palabra reservada super, mandamos a llamar el constructor de la clase
		 * padre. En este caso mandamos a llamar al constructor vacio que lo
		 * identificamos de esa manera porque no tiene argumentos
		 */
		super(); // Siempre es necesario primero llamar el constructor de la clase padre!
	}

	public Estudiante(String carrera) {
		// Aunque no se declar un constructor de la clase padre, se asume el constructor
		// vacio de la clase padre. Si este no existe, se genera un error de compilacion
		this.carrera = carrera;
		this.semestre = 1;
	}

	public Estudiante(String carrera, Integer semestre) {
		this.carrera = carrera;
		this.semestre = semestre;
	}

	public Estudiante(String nombre, Integer edad, Boolean genero, String carrera, Integer semestre) {
		// Mandamos a llamar otro constructor de la clase padre, el que se acomoda mejor
		// a los argumentos que tenemos
		super(nombre, edad, genero);
		this.carrera = carrera;
		this.semestre = semestre;
	}

	// Dentro de un método de la clase hija podemos mandar a llamar métodos de la
	// clase padre, que en este caso usaremos un metodo para concatenar la cadena
	// devuelta
	public String obtenerInformacionEstudiante() {
		/*
		 * Con super también podemos usar métodos de la clase Padre, por ejemplo
		 * super.obtenerInformacionPersona();
		 */
		return this.obtenerInformacionPersona() + "\nCarrera: " + this.carrera + "\nSemestre: " + this.semestre;
	}

	// La sobrecarga es cuando tenemos implementacion del mismo nombre de metodo
	// pero reciben distintos argumentos, como en este caso que tenemos el metodo
	// setCarrera haciendo dos cosas distintas
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
		return super.toString() + "\nCareer: " + this.carrera + "\nSemester: " + this.semestre;
	}
}