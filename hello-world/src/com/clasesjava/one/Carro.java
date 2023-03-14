package com.clasesjava.one;

public class Carro {
	int limiteVelocidad; // Limite de velocidad del carro
	int marchas; // Las velocidades totales de la caja
	int marchaActual; // La velocidad actual de la caja
	int kmHr; // A cuantos km/Hr va el carro
	boolean estaEncendido; // Nos ayuda a sabet si esta encendido o no

	// Constructor con un argumento
	public Carro(int marchas) {
		this.marchas = marchas;
		this.kmHr = 0;
		this.marchaActual = 0;
		this.estaEncendido = false;
		this.limiteVelocidad = 200; //Supongamos un límite de 200 por defecto
	}
	
	// Constructor con dos argumentos 
	public Carro(int marchas, int limiteVelocidad) {
		this.marchas = marchas;
		this.kmHr = 0;
		this.marchaActual = 0;
		this.estaEncendido = false;
		this.limiteVelocidad = limiteVelocidad;
	}

	public void encender() {
		if (!estaEncendido) {
			this.estaEncendido = true;
		} else {
			System.out.println("El carro ya esta encendido");
		}
	}

	public void apagar() {
		if (estaEncendido) {
			this.estaEncendido = false;
		} else {
			System.out.println("El carro ya esta apagado");
		}
	}

	public void acelerar() {
		if (estaEncendido && marchaActual > 0) {
			this.kmHr = this.kmHr + 5;
		} else {
			System.out.println("Primero necesitas encender el carro y meter primera marcha");
		}
	}

	public void frenar() {
		if (kmHr > 0) {
			this.kmHr = this.kmHr - 5;
		} else {
			System.out.println("Ya no se puede frenar más");
		}
	}
	
	public void subirMarcha() {
		if (this.marchaActual < this.marchas) {
			this.marchaActual++;
		}else {
			System.out.println("Llegaste al límite de marchas del auto");			
		}
	}
	
	public void bajarMarcha() {
		if (marchaActual >0) {
			this.marchaActual--;
		} else {
			System.out.println("Ya no puedes bajar más marchas");
		}
	}
	
	public String obtainInformation() {
		return "Marcha Actual: " + marchaActual + "\nKm/Hr: " + kmHr + "\nEsta encendido: " + estaEncendido; 
	}

}
