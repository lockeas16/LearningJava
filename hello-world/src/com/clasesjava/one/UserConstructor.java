package com.clasesjava.one;

public class UserConstructor {
	// Al no tener un valor especifico, todos los tipos de datos Object se
	// inicializan a nulo
	String name;
	String lastName;
	// Los tipos primitivos de datos se inicializan a un valor default
	int age;
	String address;

	// Sintaxis de Constructor, el nombre del constructor tiene que llamarse
	// exactamente igual que la clase. No tiene tipo de retorno ni tiene return
	// El constructor que no recibe argumentos se le suele llamar el constructor
	// vacio
	UserConstructor() {
		// Bloque de instrucciones para el constructor que por convención es para
		// inicializar todos los atributos de nuestra clase al momento de instanciarla
		name = "Unknown";
		lastName = "Unknown";
		age = 0;
		address = "Unknown";
	}

	// Se pueden definir varios constructores ya usando argumentos para hacer
	// distintos tipos de inicializaciones. La diferencia vendrá por los argumentos
	// que recibe el constructor
	UserConstructor(String userName) {
		// Asigna el valor recibido como argumento
		name = userName;
		// Y podemos inicializar el resto de atributos con valores por defecto
		lastName = "Apellido generico";
		age = 10;
		address = "Direccion Generica";
	}

	UserConstructor(String userName, String userLastName) {
		name = userName;
		lastName = userLastName;
	}

	UserConstructor(String userName, String userLastName, int userAge) {
		name = userName;
		lastName = userLastName;
		age = userAge;
	}

	/*
	 * Con la palabra this, nos referimos al objeto recien instanciado y para poder
	 * diferencias el nombre del atributo de la clase del nombre del argumento ya
	 * que se llaman igual
	 * 
	 * Como convencion para los constructores, los argumentos siempre se van a llamar 
	 * de la misma manera que el nombre de los atributos
	 */
	UserConstructor(String name, String lastName, int age, String address) {
		// Al objeto de tipo UserConstructor
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		/*
		 * De tener algo así
		 * 
		 * name = name;
		 * 
		 * No se puede distinguir si se hace referencia al atributo o al parametro ya
		 * que tienen el mismo nombre. De ahi que necesitamos la palabra reservada this
		 * que hace referencia al objeto en el cual se esta usando. 
		 * 
		 * this.name = name;
		 * 
		 * Al ser una referencia
		 * a una misma clase, se puede usar el operador punto. Esto tambien permitiria
		 * usar los mismos metodos del objeto, similar a esto
		 * 
		 * this.obtainInformation(); -> invocaría el método obtainInformation
		 */
	}

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
