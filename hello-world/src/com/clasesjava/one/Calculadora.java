package com.clasesjava.one;

public class Calculadora {
	private int primerOperador;
	private int segundoOperador;

	public Calculadora(int primerOperador, int segundoOperador) {
		this.primerOperador = primerOperador;
		this.segundoOperador = segundoOperador;
	}

	public Calculadora() {
		this.primerOperador = 0;
		this.segundoOperador = 0;
	}

	public int obtenerPrimerOperador() {
		return this.primerOperador;
	}

	public int obtenerSegundoOperador() {
		return this.segundoOperador;
	}
	
	public void asignarPrimerOperador(int numero) {
		this.primerOperador = numero;
	}
	
	public void asignarSegundoOperador(int numero) {
		this.segundoOperador = numero;
	}

	public int suma() {
		return this.primerOperador + this.segundoOperador;
	}

	public int resta() {
		return this.primerOperador - this.segundoOperador;
	}

	public int multiplica() {
		return this.primerOperador * this.segundoOperador;
	}

	public int divide() {
		return this.primerOperador / this.segundoOperador;
	}

	public int modulo() {
		return this.primerOperador % this.segundoOperador;
	}

	// La operacion potencia devuelve un double
	public double potencia() {
		return Math.pow(this.primerOperador, this.segundoOperador);
	}
}