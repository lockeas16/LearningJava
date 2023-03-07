package com.clasesjava.one;

public class ApplicationConstructores {

	public static void main(String[] args) {
		// Generamos un objeto de nuestra aplicacion main para usar su metodo de impresion
		ApplicationConstructores applicationConstructores = new ApplicationConstructores();
		
		// Dado que ya tenemos un constructor, los atributos String ya tendrán los
		// valores que nosotros inicializamos en el constructor, por lo que deberán
		// tener un valor distinto a null
		UserConstructor userTwo = new UserConstructor();
		// Los atributos de tipo String tendrán un valor "Unknown" en lugar de null
		System.out.println(userTwo.obtainInformation());

		// Por defecto, cualquier clase que no tenga definido un constructor, java le
		// implementa uno por defecto vacío. Algo como esto:
		/*
		 * User(){
		 * 
		 * }
		 */
		User usuario = new User(); // Usa constructor por defecto de Java

		System.out.println("################################");
		UserConstructor userDos = new UserConstructor("Mario");
		UserConstructor karime = new UserConstructor();
		// Ejemplo de como quedan inicializados los atributos para distintos
		// constructores
		System.out.println(userDos.obtainInformation());
		System.out.println(karime.obtainInformation());

		System.out.println("################################ Constructor de un solo argumento");
		// En este caso se usa el constructor que recibe un argumento de tipo String
		UserConstructor userTres = new UserConstructor("Mario");
		applicationConstructores.printUserTwo(userTres);

		System.out.println("################################ Constructor de dos argumentos");
		// Constructor con dos Strings
		UserConstructor userCuatro = new UserConstructor("Mario", "Serrano");
		applicationConstructores.printUserTwo(userCuatro);

		System.out.println("################################ Constructor de tres argumentos");
		// Constructor con dos Strings y un entero
		UserConstructor userCinco = new UserConstructor("Mario", "Serrano", 31);
		applicationConstructores.printUserTwo(userCinco);
		
		System.out.println("################################ Constructor de cuatro argumentos");
		// Constructor con dos String, un entero y un String más
		UserConstructor userSeis = new UserConstructor("Mario", "Serrano", 31, "Tultepec, Estado de Mexico");
		applicationConstructores.printUserTwo(userSeis);		
	}

	// A pesar de tener un metodo main, tambien puede llevar implementaciones de
	// metodos
	void printUserTwo(UserConstructor userTwo) {
		System.out.println(userTwo.obtainInformation());
		System.out.println("------------------------------------");
	}

}
