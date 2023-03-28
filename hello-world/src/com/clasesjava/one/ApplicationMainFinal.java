package com.clasesjava.one;

public class ApplicationMainFinal {

	public static void main(String[] args) {
		// Con el constructor vacio le hemos asignado un valor al atributo final
		UsuarioConStatic user = new UsuarioConStatic();
		// Aqui se mostrara que el atributo final tiene el valor "Desconocido"
		printUser(user);

		UsuarioConStatic karime = new UsuarioConStatic("Mariana", "Servin", 35);
		printUser(karime);

		UsuarioConStatic mario = new UsuarioConStatic();
		mario.setNombre("Serrano");
		mario.setEdad(31);
		mario.setDireccion("Tultepec, Estado de Mexico");
		printUser(karime);

		// Finalmente usamos un constructor que permite informar el atributo de
		// cumpleaños
		mario = new UsuarioConStatic("Antonio", "Licea", 25, "Azcapotzalco", "10/02/1995");
		printUser(mario);

	}

	public static void printUser(UsuarioConStatic user) {
		System.out.println(user.obtenerInformacion());
		System.out.println("--------------------------");
	}

}
