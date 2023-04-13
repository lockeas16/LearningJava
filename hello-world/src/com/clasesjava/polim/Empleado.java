package com.clasesjava.polim;

/* Una clase abstracta no esta obligada a implementar los metodos abstractos de la 
 * clase asbtracta que hereda. Pero esto también implica que no podrán instanciarse 
 * objetos de esta otra clase asbtracta
 */
public abstract class Empleado extends Persona {

	public Empleado(String nombre, Integer edad, Boolean genero) {
		super(nombre, edad, genero);
	}
}
