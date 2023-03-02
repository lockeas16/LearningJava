package com.clasesjava.one;

public class ApplicationMainUser {

	public static void main(String[] args) {
		// Declaracion de un objeto de tipo User
		User user;

		// Asignacion de un espacio de memoria para el objeto User
		user = new User();

		// Uso del metodo obtainInformation del objeto user de tipo User
		String userInformation = user.obtainInformation();
		// Imprime null para aquellos atributos que son de tipo Object y los tipos de
		// datos primitivos se inicializan a un valor default dependiendo de su tipo
		System.out.println(userInformation);
		System.out.println("------------------------------------------------");

		// Asignacion de valores a los atributos
		user.name = "Mario";
		user.lastName = "Serrano";
		user.age = 31;
		user.address = "Tultepec, Estado de Mexico";

		String userFullName = user.obtainFullName();
		System.out.println(userFullName);
		System.out.println("------------------------------------------------");
		//
		System.out.println("User Full Name: " + userFullName);
		System.out.println("------------------------------------------------");

		// Es de notar que JAva es sensible al caso, esto es que con solo variar una
		// letra por mayúscula, ya estariamos hablando de variables distintas
		/*
		 * Ejemplo
		 * 
		 * String userInformation; String userInformatioN; userInformation es distinto
		 * de userInformatioN
		 */
		userInformation = user.obtainInformation();
		System.out.println(userInformation);

		// Podemos definir cuantos User queramos
		User pedro = new User();
		// Podemos usar directamente el retorno de un metodo si su tipo coincide con el
		// argumento de otro metodo que lo reciba
		// En este caso el metodo println espera cmo argumento un String
		System.out.println(pedro.obtainInformation());
	}

}
