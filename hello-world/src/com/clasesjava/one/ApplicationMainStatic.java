package com.clasesjava.one;

public class ApplicationMainStatic {

	public static void main(String[] args) {
		/*
		 * No es necesario crear un objeto en memoria para conocer el valor de una
		 * variable estática. Esto nos estará imprimiendo un cero
		 */
		System.out.println("Contador de Usuarios: " + UsuarioConStatic.getContadorUsuarios());

		// El constructor vacío, aumenta el contador de usuarios
		UsuarioConStatic mario = new UsuarioConStatic();
		UsuarioConStatic antonio = new UsuarioConStatic();

		/*
		 * Ejemplo de uso de los "setters" para asignar valores a atributos privados
		 * 
		 * Estos metodos sólo pueden ser invocados con un objeto en memoria porque no
		 * son static
		 */
		mario.setNombre("Mario");
		mario.setApellido("Serrano");
		mario.setEdad(31);
		mario.setDireccion("Tultepec, Estado de Mexico");

		ApplicationMainStatic appMainStatic = new ApplicationMainStatic();
		/*
		 * Al imprimir la información, veremos como el contador de usuarios se ha
		 * incrementado en dos
		 */
		appMainStatic.printUsuario(mario);
		appMainStatic.printUsuario(antonio);
		
		/*
		 * Esto causa conflicto porque dentro de un metodo estatico no es posible
		 * usar un metodo que no sea estatico porque dicho metodo requiere un objeto
		 * en memoria para poder ser usado
		 * 
		 * Esto es, la ejecución se esta haciendo dentro de un metodo que no ha creado
		 * objeto en memoria lo cual contradice el uso de un método no estático porque
		 * este último sí requiere memoria
		 * 
		 * En otras palabras, no es posible usar un método no estático dentro de un 
		 * método estático porque el primero requiere memoria dentro de un contexto 
		 * donde no hay memoria
		 * 
		 * Por todo esto, lo siguiente causa un error
		 *    System.out.println(UsuarioConStatic.getContadorUsuariosNoStatic());
		 *    
		 * Para poder usarlo, necesitamos usarlo en el contexto de un objeto ya existente
		 *    System.out.println(mario.getContadorUsuariosNoStatic());
		 */

	}

	private void printUsuario(UsuarioConStatic usuario) {
		System.out.println(usuario.obtenerInformacion());
		System.out.println("---------------------------");
	}
}
