package com.clasesjava.one;

public class ApplicationMainVisib {

	public static void main(String[] args) {
		Usuario unUsuario = new Usuario("Pedro", "Aviles");
		/* Esto ya no es posible si el atributo es privado
		 *   unUsuario.nombre = "Pedro";
		 */
		// Solo mediante un metodo sera posible asignar un valor
		unUsuario.asignarNombre("Pedro");
		
		// Esto, por ejemplo, no permitira asignar un valor negativo
		unUsuario.asignarEdad(-2);
		
		/* Esto no es posible porque el constructor es privado
		 *  Usuario usuarioPrivado = new Usuario("Privado", edad);
		 */
		
		/* Esto tampoco es posible porque el metodo es privado
		 *  System.out.println(unUsuario.obtenerNombreCompleto());
		 */
		
		System.out.println(unUsuario.obtenerInformacion());
		// Esto imprime un valor en mayúsculas porque el método lo convierte
		System.out.println(unUsuario.obtenerNombre());
		// Pero el atributo no se vio afectado
		System.out.println("Despues de obtener nombre");
		System.out.println(unUsuario.obtenerInformacion());
		
	}

}
