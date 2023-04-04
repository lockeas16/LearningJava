package com.clasesjava.one;

import java.util.Scanner;

public class ApplicationMainInput {

	public static void main(String[] args) {
		/*
		 * Esta clase Scanner nos ayuda a recibir entrada Le estamos diciendo que el
		 * flujo de la informacion es System.in, que es la entrada estandar del sistema
		 * que es el teclado
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el nombre: ");
		// Y este método nos devuelve lo que se acaba de capturar hasta dar un Enter
		String name = scanner.nextLine();

		System.out.print("Ingrese el apellido: ");
		String lastName = scanner.nextLine();

		System.out.print("Ingrese la edad: ");
		// Va a esperar hasta que se capture un entero y si no se recibe un entero,
		// genera una excepcion
		int age = scanner.nextInt();
		// Es necesario ejecutar un nextLine porque no toma la siguiente linea de
		// entrada
		scanner.nextLine();

		System.out.print("Ingrese la dirección: ");
		String address = scanner.nextLine();

		Usuario userTwo = new Usuario(name, lastName, age, address);

		System.out.println("Datos de la persona ingresada");
		System.out.println(userTwo.obtenerInformacion());

		// Ejemplo de como usar la entrada para ejecutar un ciclo un número de veces
		System.out.print("Ingresa el numero de repeticiones: ");
		int number = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Ejecutaremos un ciclo " + number + " veces");
		for (int i = 0; i < number; i++) {
			System.out.println("i: " + i);
		}

		// Ejemplo de como usar la entrada para generar un menu sencillo
		int resultado = -1;
		do {
			System.out.println("Menu.");
			System.out.println("1.- agregar un numero");
			System.out.println("0.- salir");
			System.out.print("Selecciona una opcion: ");
			resultado = scanner.nextInt();
			
			switch (resultado) {
			case 1:
				System.out.print("Ingresar un número: ");
				scanner.nextInt();
				break;
			default:
				System.out.println("La Opción " + resultado +  " es inválida, ingresa una opción del menú");
				break;
			}
			System.out.println();
		} while (resultado != 0);
		System.out.println("FIN");
	}
}
