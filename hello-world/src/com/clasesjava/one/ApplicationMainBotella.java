package com.clasesjava.one;

public class ApplicationMainBotella {

	public static void main(String[] args) {
		Botella miBotella = new Botella(2000);
		System.out.println(miBotella.obtenerInformacion());
		System.out.println("-------------------------------");
		// Esto imprime un mensaje indicando que no es posible vaciar la botella si esta
		// cerrada
		miBotella.vaciar(100);
		// Esto imprime un mensaje indicando que no es posible llenar la botella si esta
		// cerrada
		miBotella.llenar(500);
		// Probamos vaciar 100 ml
		miBotella.destapar();
		miBotella.vaciar(100);
		System.out.println("-------------------------------");
		System.out.println("- Despues de vaciar 100 ml    -");
		System.out.println(miBotella.obtenerInformacion());
		System.out.println("-------------------------------");
		
		// Probamos vaciar 2000 ml
		// Se muestra mensaje de que no podemos vaciar tanto liquido
		miBotella.vaciar(2000);
		System.out.println("---------------------------------------");
		System.out.println("- Despues de intentar vaciar 2000 ml  -");
		System.out.println(miBotella.obtenerInformacion());
		System.out.println("---------------------------------------");
		
		// Probamos vaciar 1900 ml
		miBotella.vaciar(1900);
		System.out.println("------------------------------");
		System.out.println("- Despues de vaciar 1900 ml  -");
		System.out.println(miBotella.obtenerInformacion());
		System.out.println("------------------------------");
		
		// Probamos intentar vaciar mas liquido de una botella vacias
		// Esto nos deja un mensaje de que no se pudo vaciar mas liquido
		miBotella.vaciar(50);
		
		miBotella.llenar(300);
		System.out.println("-----------------------------");
		System.out.println("- Despues de llenar 300 ml  -");
		System.out.println(miBotella.obtenerInformacion());
		System.out.println("-----------------------------");
		
		// La intentamos llenar a más de su capacidad
		miBotella.llenar(5000);
		System.out.println("-----------------------------------------");
		System.out.println("- Despues de intentar llenarla 5000 ml  -");
		System.out.println(miBotella.obtenerInformacion());
		System.out.println("-----------------------------------------");
		
		// Llenamos la botella por completo
		miBotella.llenar(1700);
		System.out.println("-----------------------------");
		System.out.println("- Despues de llenar 1700 ml -");
		System.out.println(miBotella.obtenerInformacion());
		System.out.println("-----------------------------");
	}
}