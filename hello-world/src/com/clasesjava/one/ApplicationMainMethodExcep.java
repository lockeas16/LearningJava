package com.clasesjava.one;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMainMethodExcep {

	public static void main(String[] args) {
		// Al usar el metodo, lo englobamos dentro de un try catch para manejar la
		// excepcion
		try {
			operation(4, 0);
		} catch (ArithmeticException arithmeticException) {
			// Y una vez atrapemos la excepcion, le damos un manejo
			System.out.println(arithmeticException.getMessage());
			System.out.println("No se puede dividir entre cero");
		}

		try {
			List<Integer> lista = new ArrayList<Integer>();
			obtenerElemento(lista, 2);
		} catch (IndexOutOfBoundsException boundsException) {
			// Dejamos que el invocador decida el flujo cuando se presenta una excepcion
			System.out.println(boundsException.getMessage());
			System.out.println("Indice invalido");
		}
	}

	// Con la palabra reservada throws indicamos que un metodo puede generar una
	// excepcion
	public static int operation(int a, int b) throws ArithmeticException {
		int result = 0;
		try {
			result = a / b;
		} catch (ArithmeticException arithmeticException) {
			// Y para el caso de un metodo, se propaga la excepcion para que sea el
			// invocador quien maneje la excepcion
			throw arithmeticException;
		}
		return result;
	}

	// Otro ejemplo de como un metodo puede lanzar una excepcion
	public static Integer obtenerElemento(List<Integer> lista, int indice) throws IndexOutOfBoundsException {
		Integer result = -1;
		try {
			result = lista.get(indice);
		} catch (IndexOutOfBoundsException boundsException) {
			throw boundsException;
		}
		return result;
	}
}
