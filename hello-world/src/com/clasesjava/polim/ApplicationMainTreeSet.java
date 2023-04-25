package com.clasesjava.polim;

import java.util.TreeSet;
import java.util.Set;

public class ApplicationMainTreeSet {

	public static void main(String[] args) {
		// No permite duplicados y va ordenando los elementos que se vayan incorporando
		// en orden ascendente y teniendo como prioridad la mayúscula porque su valor en
		// ASCII es mayor
		Set<String> treeStrings = new TreeSet<String>();

		// Agregar elementos
		treeStrings.add("Hola");
		treeStrings.add("HOla");
		treeStrings.add("adivina");
		treeStrings.add("como");
		treeStrings.add("me");
		treeStrings.add("va");
		treeStrings.add("con");
		treeStrings.add("java");
		treeStrings.add("adivina"); // Al ser un duplicado, no se agrega al set

		System.out.println(treeStrings);

		// Validar si el elemento existe
		boolean existe = treeStrings.contains("adivina");
		if (existe) {
			System.out.println("El elemento adivina existe");
		} else {
			System.out.println("El elemento adivina no existe");
		}

		// Revisando si el set esta vacio
		boolean estaVacio = treeStrings.isEmpty();
		if (estaVacio) {
			System.out.println("El set esta vacio");
		} else {
			System.out.println("El set no esta vacio");
		}

		// Y como en las listas, podemos eliminar un elemento
		boolean elementoEliminado = treeStrings.remove("adivina");
		if (elementoEliminado) {
			System.out.println("Se elimino el elemento adivina");
		} else {
			System.out.println("No se elimino el elemento adivina");
		}
		System.out.println(treeStrings);

		// Obtener el tamanio del set
		int tamanio = treeStrings.size();
		System.out.println("Tamanio del set: " + tamanio);

		// Y tambien podemos vaciar el set
		treeStrings.clear();
		System.out.println("El TreeSet ahora esta vacio");
		System.out.println(treeStrings);

		// Y podemos usar un tipo especifico como Persona
		Set<Persona> setPersonas = new TreeSet<Persona>();
		Persona estudiante = new Estudiante("Antonio", 35, true, "Computacion", 4);
		Persona estudianteDos = new Estudiante("Pedro", 15, false, "Fisica", 5);
		Persona nino = new Nino("Juan", 5, true);
		Persona profesor = new Profesor("Mario", 25, true, "Ingeniero");

		// Si no tuvieramos la interfaz Comparable implementada, fallara en tiempo de
		// ejecucion porque no sabrá como ordenar los elementos
		setPersonas.add(profesor);
		setPersonas.add(estudiante);
		setPersonas.add(nino);
		setPersonas.add(estudianteDos);

		// Esto imprime primero estudiante, luego nino, luego profesor y al final
		// estudianteDos de acuerdo a la implementacion de compareTo de la clase Persona
		// que hace el ordenamiento de acuerdo al atributo nombre
		System.out.println(setPersonas);

	}

}
