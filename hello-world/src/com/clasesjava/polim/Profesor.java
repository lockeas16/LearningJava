package com.clasesjava.polim;

class Profesor extends Persona implements Responsabilidades {
	private final String grado;
	private String[] materias;
	private int indiceMaterias;

	// La interfaz permite que las clases proporcionen su propia implementación de
	// los métodos de la interfaz
	@Override
	public void atenderClase() {
		System.out.println("Dar la clase");
		System.out.println("Resolver dudas");
	}

	@Override
	public void prepararClase() {
		System.out.println("Revisar el tema");
		System.out.println("Revisar ejercicios");
	}

	@Override
	public void presentarExamen() {
		System.out.println("Revisar que no hagan trampa los alumnos");
	}

	// Es obligatorio que los métodos abstractos se implementen en las clases hijas
	@Override
	public void irAlEscuela() {
		// Esto nos permite darle un comportamiento particular al metodo para cada tipo
		System.out.println("Yo voy a la escuela en mi auto");
	}

	public Profesor() {
		super();
		this.grado = "Licenciatura";
	}

	public Profesor(String nombre, Integer edad, Boolean genero) {
		super(nombre, edad, genero);
		this.materias = new String[5];
		this.grado = "Licenciatura";
	}

	public Profesor(String nombre, Integer edad, Boolean genero, String grado) {
		super(nombre, edad, genero);
		this.materias = new String[5];
		this.grado = grado;
	}

	public Profesor(String grado) {
		super();
		this.grado = grado;
		this.materias = new String[5];
		this.indiceMaterias = 0;
	}

	public Profesor(Persona person) {
		super(person.getNombre(), person.getEdad(), person.getGenero());
		this.grado = "Licenciatura";
	}

	public String getGrado() {
		return grado;
	}

	public void agregarMateria(String materia) {
		if (this.indiceMaterias < 5) {
			this.materias[this.indiceMaterias] = materia;
			this.indiceMaterias++;
		} else {
			System.out.println("Este profesor ya no puede impartir más materias");
		}
	}

	public void agregarMateria(String[] materias) {
		this.materias = materias;
	}

	@Override
	public String toString() {
		String materias = "";
		for (int i = 0; i < this.materias.length; i++) {
			if (this.materias[i] == null) {
				break;
			}
			materias += "\n\t" + this.materias[i];
		}
		return super.toString() + "\nGrado: " + this.grado + "\nMaterias: " + materias;
	}

	public String obtenerInformacionProfesor() {
		String materias = "";
		for (int i = 0; i < this.materias.length; i++) {
			if (this.materias[i] == null) {
				break;
			}
			materias += "\n\t" + this.materias[i];
		}

		return this.obtenerInformacionPersona() + "\nMaterias: " + materias;
	}
}
