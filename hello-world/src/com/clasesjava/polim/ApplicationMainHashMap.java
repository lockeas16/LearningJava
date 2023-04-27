package com.clasesjava.polim;

import java.util.Map;
import java.util.HashMap;

public class ApplicationMainHashMap {

	public static void main(String[] args) {
		// Un Map es una colección que guarda un par de valores, uno como la llave
		// y el segundo como valor
		Map<String, Integer> mapa = new HashMap<String, Integer>();

		// La llave aqui es String pero puede ser otro tipo de dato
		mapa.put("One", 1);
		mapa.put("Five", 5);
		mapa.put("Seven", 7);
		// La llave "One" ahora va a tener el valor asociado 10, sobreescribiendo el 1
		mapa.put("One", 10);
		mapa.put("Dos", 234);

		System.out.println(mapa);

		// Con este metodo podemos indagar si un mapa tiene cierta llave
		boolean contieneLlave = mapa.containsKey("Seven");
		if (contieneLlave) {
			System.out.println("Contiene la llave");
		} else {
			System.out.println("No contiene la llave");
		}

		// y tambien podemos saber si el mapa tiene cierto valor sin importar si el
		// valor esta relacionado a una o más llaves
		boolean contieneValor = mapa.containsValue(10);
		if (contieneValor) {
			System.out.println("Contiene el valor");
		} else {
			System.out.println("No contiene el valor");
		}

		// Para recuperar el valor relacionado a cierta llave, usamos el metodo get
		int valor = mapa.get("Dos");
		System.out.println("Valor asociado a llave Dos: " + valor);

		// Si informamos una llave que no existe, se genera una excepcion, un
		// nullPointerException
		// int valorQueNoExiste = mapa.get("Otra");

		// Podemos saber si un mapa esta vacio
		boolean estaVacio = mapa.isEmpty();
		if (estaVacio) {
			System.out.println("El mapa esta vacio");
		} else {
			System.out.println("El mapa no esta vacio");
		}

		// Eliminar una llave, que esto sería a traves de la llave
		mapa.remove("Dos");
		System.out.println("mapa despues de remove");
		System.out.println(mapa);

		// Obtener el tamanio del mapa
		int tamanio = mapa.size();
		System.out.println("Tamanio del mapa: " + tamanio);
		
		// Y como otras colecciones, tiene su metodo clear para vaciar el mapa
		mapa.clear();
		System.out.println("mapa despues de clear");
		System.out.println(mapa);

	}

}
