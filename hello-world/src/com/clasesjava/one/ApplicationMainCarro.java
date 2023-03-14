package com.clasesjava.one;

public class ApplicationMainCarro {

	public static void main(String[] args) {
		/*
		 * marchas = 5 marchaActual = 0 kmHr = 0 estaEncendido = false
		 */
		Carro carro = new Carro(6);
		// Segun las condiciones del metodo acelerar, primero hay que encender
		carro.encender();
		// Y despues subir a la primera marcha al menos
		carro.subirMarcha();
		carro.acelerar();
		carro.acelerar();

		carro.bajarMarcha();
		// No sera posible acelerar porque la marcha actual es cero
		// Y esto nos dejara una linea en consola con el aviso
		carro.acelerar();

		carro.subirMarcha();
		// Con un ciclo se puede acelerar el carro sin tener que llamar al metodo
		// tantas veces
		while (carro.kmHr < 30) {
			// En este caso no es necesario incrementar dentro del bucle
			// alguna variable, el mismo método de acelerar ya nos esta
			// incrementando un atributo cada vez que se le llama
			carro.acelerar();
		}

		System.out.println("Carro: carro");
		System.out.println(carro.obtainInformation());

		// Nuevo carro con un limite de velocidad de 300
		Carro carroLimiteVel = new Carro(6, 300);

		carroLimiteVel.encender();
		carroLimiteVel.subirMarcha();
		// Vamos a acelerar el nuevo carro hasta su límite de velocidad
		while (carroLimiteVel.kmHr < carroLimiteVel.limiteVelocidad) {
			carroLimiteVel.acelerar();
		}

		System.out.println("Carro: carro con limite de velocidad especifico");
		System.out.println(carroLimiteVel.obtainInformation());
	}
}
