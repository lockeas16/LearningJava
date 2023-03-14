package com.clasesjava.one;

import java.util.Iterator;

public class Arreglos {

	public static void main(String[] args) {
		/*
		 * Los arreglos siempre manejan un mismo tipo de dato y no podemos mezclar
		 * distintos tipos de datos para un mismo arreglo.
		 * 
		 * Los arreglos son considerados un tipo de Objeto
		 * 
		 * Sintaxis: tipoDato[] identificador;
		 * 
		 * Para instanciar/inicializar un arreglo siempre se indica el tamaño
		 * identificador = new tipoDato[<tamañoArreglo>]
		 */

		/*
		 * Declaracion de una variable de tipo arreglo que contendrá Strings
		 */
		String[] cadenas;

		cadenas = new String[5]; // Asignacion del arreglo en memoria

		/*
		 * Para acceder a los elementos del arreglo:
		 * 
		 * identificador[i] -> donde i
		 * 
		 * corresponde a la posicion del arreglo al que queremos acceder.
		 * 
		 * En el caso de Java, la primera posición se indica con cero
		 * 
		 * cadenas[0] = "Esta es la posicion 1";
		 * 
		 */

		// Al no haber inicializado ningun valor, todo esto imprimira null
		System.out.println("Valor del arreglo en la posicion 0: " + cadenas[0]);
		System.out.println("Valor del arreglo en la posicion 1: " + cadenas[1]);
		System.out.println("Valor del arreglo en la posicion 2: " + cadenas[2]);
		System.out.println("Valor del arreglo en la posicion 3: " + cadenas[3]);
		System.out.println("Valor del arreglo en la posicion 4: " + cadenas[4]);
		/*
		 * Si intentasemos acceder a una posición superior a la del límite, nos
		 * generaría una excepción (!) como la siguiente:
		 * 
		 * Asumiendo que cadenas es un arreglo de sólo 5 ocurrencias
		 * System.out.println("Valor del arreglo en la posicion 5: " + cadenas[5]);
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5
		 * out of bounds for length 5 at
		 * com.clasesjava.one.Arreglos.main(Arreglos.java:42)
		 * 
		 */

		/*
		 * Para asignar un valor a los elementos del arreglo
		 * 
		 * identificador[i] = valoraAsignar; donde i = indice del arreglo
		 */
		cadenas[0] = "hello";
		cadenas[1] = "world";
		// Podemos asignar valores en el orden que deseemos
		cadenas[3] = "java";
		cadenas[2] = "of";
		cadenas[4] = ":)";

		System.out.println("Despues de haber asignado valores");
		System.out.println("Valor del arreglo en la posicion 0: " + cadenas[0]);
		System.out.println("Valor del arreglo en la posicion 1: " + cadenas[1]);
		System.out.println("Valor del arreglo en la posicion 2: " + cadenas[2]);
		System.out.println("Valor del arreglo en la posicion 3: " + cadenas[3]);
		System.out.println("Valor del arreglo en la posicion 4: " + cadenas[4]);

		// Podemos usar un ciclo while para hacer la impresion recorriendo el arreglo
		int index = 0;
		while (index < 5) {
			System.out.println("Dentro de while | Valor del arreglo en la posicion " + index + ":" + cadenas[index]);
			index++;
		}

		// Podemos usar un ciclo for para hacer la impresion recorriendo el arreglo
		// Es de notar que los arreglos tienen un atributo length que almacena el tamaño
		// del arreglo
		for (int i = 0; i < cadenas.length; i++) {
			System.out.println("Dentro de for | Valor del arreglo en la posicion " + i + ":" + cadenas[i]);
		}

		// Podemos declarar arreglos de datos primitivos, Wrappers e incluso de Clases
		// que estamos creando

		// Aqui estamos generando un arreglo con Objetos de tipo Carro
		Carro[] portaCoches;
		portaCoches = new Carro[5];

		// Instanciamos un Objeto del tipo Carro
		Carro carroDeOscar;
		carroDeOscar = new Carro(5);

		// Y posteriormente podemos asignar el objeto carroDeOscar a una posición del
		// arreglo que es de tipo Carro
		portaCoches[0] = carroDeOscar;

		// Y despues podemos acceder a dicho objeto, con todos sus atributos y metodos
		// En este caso estamos accediendo al objeto carroDeOscar pero desde el arreglo
		System.out.println(portaCoches[0].obtainInformation());
		
		// Y podemos usar un ciclo para llenar un arreglo grande
		Carro[] unGranPortaCoches = new Carro[100];
		
		for (int i = 0; i < 100; i++) {
			unGranPortaCoches[i] = new Carro(i);
			System.out.println("Carro con " + unGranPortaCoches[i].marchas + " marchas");
		}
	}
}
