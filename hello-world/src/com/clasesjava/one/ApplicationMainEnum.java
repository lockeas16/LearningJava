package com.clasesjava.one;

public class ApplicationMainEnum {

	public static void main(String[] args) {
		// Definimos los enum de manera similar a los objetos
		// Aqui definimos un objeto enum de tipo DiasSemana con valor LUNES
		DiasSemana unDiaSemana = DiasSemana.LUNES;

		switch (unDiaSemana) {
		case LUNES:
		case MARTES:
		case MIERCOLES:
		case JUEVES:
		case VIERNES:
			System.out.println("Hora de ir a trabajar");
			break;
		case SABADO:
		case DOMINGO:
			System.out.println("Hora de descansar");
			break;
		/*
		 * El usar un enum nos permite restringir los valores sobre los} que se pueden
		 * evaluar, lo siguiente nos generara un error case "hola": break;
		 */
		default:
			System.out.println("El día que elegiste no lo conozco");
			break;
		}

		// Otra manera de definir un enum, es usando el metodo heredado valueOf
		DiasSemana otroDia;
		otroDia = DiasSemana.valueOf("MIERCOLES");
		/*
		 * Si usaramos un valor como argumento que no este dentro del enum provocara un
		 * error en tiempo de ejecucion. La sentencia es sintácticamente válida y por
		 * eso no se marca como error de compilación
		 * 
		 * otroDia = DiasSemana.valueOf("otro");
		 */

		// Recordar que java es index zero, por lo que la posición 0 sería la primera posición
		System.out.println("otroDia vale: " + otroDia.name() + " y su posicion en el enum es: " + otroDia.ordinal());
		System.out.println("FIN");
	}
}
