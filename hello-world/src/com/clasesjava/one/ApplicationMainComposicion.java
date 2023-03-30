package com.clasesjava.one;

public class ApplicationMainComposicion {

	public static void main(String[] args) {
		UsuarioCompuesto mario = new UsuarioCompuesto();
		mario.setApellido("Serrano");
		mario.setEdad(31);
		// Aqui solo veremos cambios en apellido y edad
		printUser(mario);

		// Aqui podriamos generar un nuevo objeto Direccion para asignarselo al atributo
		// Direccion del usuario, sin embargo esto aparta memoria para crear un nuevo
		// objeto que realmente no es necesario
		Direccion direccionMario = new Direccion("Mexico", "54985", 302, 21);
		mario.setDireccion(direccionMario);
		// Aqui veremos cambios en la direccion
		printUser(mario);

		// Tambien podriamos modificar directamente el objeto Direccion de la clase
		// Usuario usando sus métodos

		// Aqui recuperamos el atributo de tipo Direccion
		direccionMario = mario.getDireccion();
		// Y podemos usar su propio metodo para setear el codigo postal por ejemplo
		direccionMario.setCodigoPostal("54980");
		// Y esto afectara directamente los atributos del atributo direccion del objeto
		// mario
		printUser(mario);

		// Y finalmente tambien podríamos acceder directamente al metodo usando el
		// operador punto pero esto no es recomendable por patrones de diseño.
		// No es muy recomendable encadenar metodos
		mario.getDireccion().setNumeroExterno(244);
		printUser(mario);

		// Aqui usamos el segundo constructor del usuario para asignarle atributos de
		// dirección y fecha distintos
		Direccion otraDireccion = new Direccion();
		Fecha cumpleaniosMario = new Fecha(1996, 6, 19);
		mario = new UsuarioCompuesto("Antonio", "Licea", 25, otraDireccion, cumpleaniosMario);
		printUser(mario);

	}

	public static void printUser(UsuarioCompuesto user) {
		System.out.println(user.obtainInformation());
		System.out.println("--------------------------------");
	}

}
