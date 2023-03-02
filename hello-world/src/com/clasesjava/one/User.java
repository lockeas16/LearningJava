package com.clasesjava.one;

public class User {
	// Al no tener un valor especifico, todos los tipos de datos Object se
	// inicializan a nulo
	String name;
	String lastName;
	// Los tipos primitivos de datos se inicializan a un valor default
	int age;
	String address;

	// tipoRetorno nombreMetodo ([argumentos]){
	// Bloque de instrucciones
	// }
	String obtainFullName() {
		String fullName = name + " " + lastName;
		// Debe devolverse un tipo de dato coherente al tipo de retorno declarado
		return fullName;
	}

	String obtainInformation() {
		String information = "Name: " + name + " " + lastName + "\n" + "Age: " + age + "\n" + "Address:" + address;
		return information;
	}
}
