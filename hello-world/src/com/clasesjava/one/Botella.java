package com.clasesjava.one;

public class Botella {
	boolean estaTapada;
	int mililitrosActuales;
	int mililitrosTotales;

	Botella(int mililitrosTotales) {
		this.mililitrosTotales = mililitrosTotales;
		this.mililitrosActuales = mililitrosTotales;
		// Se genera como una botella tapada
		this.estaTapada = true;
	}

	void destapar() {
		if (estaTapada) {
			this.estaTapada = false;
		} else {
			System.out.println("La botella ya esta destapada");
		}
	}

	void tapar() {
		if (!estaTapada) {
			this.estaTapada = true;
		} else {
			System.out.println("La botella ya esta tapada");
		}
	}
	
	void vaciar(int mililitros) {
		// No podemos vaciar la botella si esta tapada
		if (estaTapada) {
			System.out.println("Primero destapar la botella");
			return;
		} 
		// No podemos vaciar más líquido del que tiene la botella
		if (mililitrosActuales < mililitros) {
			System.out.println("La botella no tiene tanto líquido por vaciar o ya se encuentra vacía");
			return;
		} 
		// Si la botella aun tiene liquido
		if (mililitrosActuales > 0) {
			mililitrosActuales = mililitrosActuales - mililitros;
		}
	}
	
	void llenar(int mililitros) {
		// No podemos llenar la botella si esta tapada
		if (estaTapada) {
			System.out.println("Primero destapar la botella");
			return;
		} 
		// Si aun le queda espacio a la botella
		if (mililitrosActuales + mililitros <= mililitrosTotales) {
			mililitrosActuales = mililitrosActuales + mililitros;
		} else {
			System.out.println("A la botella ya no le caben " + mililitros + " mililitros");
		}
	}
	
	String obtenerInformacion() {
		return "La botella esta tapada: " + estaTapada + "\nMililitros Totales:" + mililitrosTotales + "\nMilitros Actuales: " + mililitrosActuales;
	}
}
