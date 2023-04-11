package com.clasesjava.one;

public class Persona {
	private String nombre;
	private Integer edad;
	private Boolean genero;

	// Si ya existe un constructor, no se genera por default un constructor vacio!
	public Persona() {
	}

	public Persona(String nombre, Integer edad, Boolean genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Boolean getGenero() {
		return genero;
	}

	public void setGenero(Boolean genero) {
		this.genero = genero;
	}

	public String obtenerInformacionPersona() {
		return "Nombre: " + this.getNombre() + "\nEdad: " + this.getEdad() + "\nGenero: " + this.getGenero();
	}

	/*
	 * La sobreescritura es cuando queremos que un metodo heredado se comporte de
	 * manera distinta Para aplicar sobrescritura, requerimos que la firma del
	 * método padre tiene que ser exactamente la misma. Con firma nos referimos que
	 * tenga la misma visibilidad, se llama igual y recibe los mismos argumentos
	 * 
	 * Una manera de saber que estamos aplicando la sobreescritura de manera
	 * correcta es usando la anotacion @Override. Esto le indica al compilador que
	 * nos valide la implementacion sobre el metodo
	 */
	@Override
	public String toString() {
		return "Name: " + this.getNombre() + "\nAge: " + this.getEdad() + "\nGender: " + this.getGenero();
	}
}
