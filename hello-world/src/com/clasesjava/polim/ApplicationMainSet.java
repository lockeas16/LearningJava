package com.clasesjava.polim;

import java.util.HashSet;
import java.util.Set;

public class ApplicationMainSet {

	public static void main(String[] args) {
		// No permite duplicados y no mantiene el orden en el que vayamos agregando los
		// elementos
		Set<String> setStrings = new HashSet<String>();

		// Agregar elementos
		setStrings.add("Hola");
		setStrings.add("adivina");
		setStrings.add("como");
		setStrings.add("me");
		setStrings.add("va");
		setStrings.add("con");
		setStrings.add("java");
		setStrings.add("adivina"); // Al ser un duplicado, no se agrega al set

		System.out.println(setStrings);

		// Validar si el elemento existe
		boolean existe = setStrings.contains("adivina");
		if (existe) {
			System.out.println("El elemento adivina existe");
		} else {
			System.out.println("El elemento adivina no existe");
		}

		// Revisando si el set esta vacio
		boolean estaVacio = setStrings.isEmpty();
		if (estaVacio) {
			System.out.println("El set esta vacio");
		} else {
			System.out.println("El set no esta vacio");
		}

		// Y como en las listas, podemos eliminar un elemento
		boolean elementoEliminado = setStrings.remove("adivina");
		if (elementoEliminado) {
			System.out.println("Se elimino el elemento adivina");
		} else {
			System.out.println("No se elimino el elemento adivina");
		}
		System.out.println(setStrings);

		// Obtener el tamanio del set
		int tamanio = setStrings.size();
		System.out.println("Tamanio del set: " + tamanio);

		// Y tambien podemos vaciar el set
		setStrings.clear();
		System.out.println("El HashSet ahora esta vacio");
		System.out.println(setStrings);

		// Y podemos usar un tipo especifico como Persona
		Set<Persona> setPersonas = new HashSet<Persona>();
		Persona estudiante = new Estudiante("Antonio", 35, true, "Computacion", 4);
		Persona profesor = new Profesor("Mario", 25, true, "Ingeniero");
		Persona nino = new Nino("Mayito", 5, true);

		setPersonas.add(estudiante);
		setPersonas.add(profesor);
		setPersonas.add(nino);

		// Como ya existen estos objetos en el Set, se consideran duplicados y no se
		// agregan al set dos veces
		setPersonas.add(profesor);
		setPersonas.add(nino);

		System.out.println(setPersonas);
		
		// Para recorrer elementos de un Set se requiere de un Iterator
	}

}
