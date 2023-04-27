package com.clasesjava.one;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMainErrors {

	public static void main(String[] args) {
		// Lo siguiente genera una excepcion, que esta siendo "atrapada" dentro de un
		// try catch

		try {
			// Dentro del try se mete el codigo que pudiera generar una excepcion
			System.out.println(4 / 0);
			// Y dentro del catch indicamos el tipo de excepción que podria generarse
		} catch (ArithmeticException arithmeticException) {
			System.out.println("No se puede dividir entre cero");
		}

		// Esto otro tambien genera una excepcion
		List<Integer> lista = new ArrayList<Integer>();

		try {
			lista.get(3);
		} catch (IndexOutOfBoundsException indexOutOfBoundsException) {
			System.out.println("Indice invalido");
			// La siguiente linea nos imprime la cadena de excepcion
			// indexOutOfBoundsException.printStackTrace();
		}

		// Una excepcion impide que el flujo del programa continue, por lo que la
		// siguiente instruccion nunca se ejecutara si se presenta una excepcion antes
		// que no este siendo controlada
		System.out.println("Fin");
	}
}
