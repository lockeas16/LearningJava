package com.clasesjava.polim;
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
		
		System.out.println("metodo get ------------------------");
		// Obtener un elemento de la lista, el del índice que le indiquemos
		Integer valor = listaNumerica.get(3);
		System.out.println(valor);
		
		// Obtenemos el indice de la primera ocurrencia del valor que le indiquemos
		System.out.println("metodo indexOf ------------------------");
		int indice = listaNumerica.indexOf(2);
		System.out.println(indice);
		
		// Asi podemos saber si una lista esta vacia
		boolean estaVacia = listaNumerica.isEmpty();
		if (estaVacia) {
			System.out.println("La lista esta vacia");
		} else {
			System.out.println("La lista no esta vacia");
		}
		
		// Para obtener el tamanio de una lista
		int tamanio = listaNumerica.size();
		System.out.println("La lista tiene un tamanio de: " + tamanio);
		
		// Así vaciamos la lista
		listaNumerica.clear();
		imprimirLista(listaNumerica);

		// Podemos manejar listas de tipos que generamos nosotros
		List <Persona> listaPersonas= new ArrayList<Persona> ();
		Persona estudiante = new Estudiante("Antonio", 35, true, "Computacion", 4);
		Persona profesor = new Profesor("Mario", 25, true, "Ingeniero");
		Persona nino = new Nino("Mayito", 5, true);
		
		listaPersonas.add(estudiante);
		listaPersonas.add(profesor);
		listaPersonas.add(nino);
		
		// Y sin importar que tenemos un tipo especifico para la lista, podemos seguir usando los metodos de la clase List
		listaPersonas.remove(1);
		
		// Utilizamos ahora el metodo get para recuperar todos los elementos de la lista
		for (int i = 0; i < listaPersonas.size(); i++) {
			Persona persona = listaPersonas.get(i);
			System.out.println(persona);
			System.out.println("-----------------------------------");
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
