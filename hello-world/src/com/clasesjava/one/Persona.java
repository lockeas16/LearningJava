package com.clasesjava.one;

public class Persona {
	private String nombre;
	private Integer edad;
	private Boolean genero;
	
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
}
