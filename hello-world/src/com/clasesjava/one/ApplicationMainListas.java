package com.clasesjava.one;

// List y ArrayList vienen de los siguientes paquetes
import java.util.ArrayList;
// List permite agregar elementos a esta lista y va creciendo dinámicamente
import java.util.List;

public class ApplicationMainListas {

	public static void main(String[] args) {
		// Las listas son conjunto de datos del mismo tipo, en este caso con el <> le
		// indicamos al compilador de que tipo es la lista que queremos generar
		List<Integer> listaNumerica = new ArrayList<Integer>();

		// Otra caracteríctica de los List es que sólo pueden usarse con objetos y no
		// con datos primitivos. Lo siguiente generar un error de compilacion
		// List<float> listaFloatInvalida = new ArrayList<float>();

		// Agregamos elementos con el método add que ya esta implementado y se van
		// agregando en el orden en el que se vayan agregando
		listaNumerica.add(5);
		listaNumerica.add(3);
		listaNumerica.add(45);
		listaNumerica.add(5);
		listaNumerica.add(3);
		listaNumerica.add(2);
		listaNumerica.add(19);

		imprimirLista(listaNumerica);

		// Con el metodo remove podemos eliminar el elemento con el indice que le
		// indiquemos. En este caso eliminará el 45
		listaNumerica.remove(2);
		imprimirLista(listaNumerica);
		
		// Validar si la lista tiene un elemento
		boolean existe = listaNumerica.contains(450);
		if (existe) {
			System.out.println("El numero 450 existe en la lista");
		} else {
			System.out.println("El numero 450 no existe en la lista");
		}

	}

	public static void imprimirLista(List<Integer> lista) {
		// List tiene un metodo size que nos devuelve el tamaño de la lista
		// Y su indice tambien empieza en cero para el primer item de la lista
		for (int i = 0; i < lista.size(); i++) {
			// Y tenemos el metodo get que nos devuelve el item que le indiquemos como
			// argumento
			System.out.println(lista.get(i));
		}
		System.out.println("------------------------");
	}

}
