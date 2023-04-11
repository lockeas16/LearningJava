package com.clasesjava.one;


/*
 * La herencia solo aplica de abajo hacia arriba, los hijos acceden a lo que
 * hereda de la clase padre pero la clase padre no puede acceder a lo definido
 * en sus clases hijas
 */
public class Profesor extends Persona {
	/*
	 * La clase Profesor tendrá acceso a todos los atributos y métodos que asi se
	 * definan en la visibilidad (esto es todo menos lo private). Esto serán los
	 * constructores más métodos getters y setters
	 */
	
	private final String grado;
	private String[] materias;
	private int indiceMaterias;
	
	public Profesor() {
		super();
		// Asignamos un grado por default
		this.grado = "Licenciatura";
	}
	
	public Profesor(String nombre, Integer edad, Boolean genero) {
		super(nombre, edad, genero);
		// Asignamos un grado por default
		this.grado = "Licenciatura";
	}
	
	public Profesor(String nombre, Integer edad, Boolean genero, String grado) {
		super(nombre, edad, genero);
		this.grado = grado;
	}	
		
	public Profesor(String grado) {
		// Usamos el constructor vacio
		super();
		this.grado = grado;
		this.materias = new String[5];
		this.indiceMaterias = 0;
	}

	// Podriamos definir un constructor que reciba un objeto Persona
	public Profesor(Persona person) {
		super(person.getNombre(), person.getEdad(), person.getGenero());
		// Asignamos un grado por default
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
	
	public String obtenerInformacionProfesor() {
		String materias="";
		for (int i = 0; i < this.materias.length; i++) {
			if (this.materias[i] == null) {
				break;
			} 
			// El \t inserta un tabulador
			materias +="\n\t" + this.materias[i];
		}
		 
		return this.obtenerInformacionPersona() + "\nMaterias: " + materias;
	}
	
}
