package com.clasesjava.polim;

/* Una clase abstracta no esta obligada a implementar los metodos abstractos de la 
 * clase asbtracta que hereda. Pero esto también implica que no podrán instanciarse 
 * objetos de esta otra clase asbtracta
 * 
 * Aun cuando se trate de una clase abstracta, también puede implementar una interfaz 
 * sin que sea obligatorio implementarla
 */
public abstract class Empleado extends Persona implements Responsabilidades {

	public Empleado(String nombre, Integer edad, Boolean genero) {
		super(nombre, edad, genero);
	}
}
