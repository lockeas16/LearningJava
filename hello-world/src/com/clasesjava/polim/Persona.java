package com.clasesjava.polim;

//La interfaz Comparable nos permite integrarle el metodo compareTo para que pueda ser usado, por ejemplo, el TreeSet
abstract class Persona implements Comparable<Persona> {
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

	@Override
	public int compareTo(Persona persona) {
		// Del objeto actual comparamos el atributo String con el del argumento de
		// entrada

		// Esto indica que si el nombre actual es menor al comparado
		if (this.nombre.compareTo(persona.getNombre()) < 0) {
			return -1;
		}
		// Si los nombres son iguales, el compareTo regresara cero
		if (this.nombre.compareTo(persona.getNombre()) == 0) {
			return 0;
		} else { // Y finalmente, el otro caso es que el nombre actual es mayor alfabeticamente al del argumento
			return 1;
		}
	}
}
