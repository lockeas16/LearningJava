package com.clasesjava.polim;

abstract class Persona {
	protected String nombre;
	protected Integer edad;
	protected Boolean genero;

	public Persona() {
	}

	// Sólo es posible definir un metodo abstracto dentro de una clase abstracta!
	// Los metodos abstractos no tienen implementacion dentro de la clase abstracta
	public abstract void irAlEscuela();

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

	@Override
	public String toString() {
		return "Name: " + this.getNombre() + "\nAge: " + this.getEdad() + "\nGender: " + this.getGenero();
	}
}
