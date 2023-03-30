package com.clasesjava.one;

public class Direccion {
	private String pais;
	private String codigoPostal;
	private int numeroIntero;
	private int numeroExterno;
	
	public Direccion() {
		this.pais = "Desconocido";
		this.codigoPostal = "Desconocido";
		this.numeroIntero = 0;
		this.numeroExterno = 0;
	}
	
	public Direccion(String pais, String codigoPostal, int numeroIntero, int numeroExterno) {
		this.pais = pais;
		this.codigoPostal = codigoPostal;
		this.numeroIntero = numeroIntero;
		this.numeroExterno = numeroExterno;
	}

	public String getDireccionCompleta() {
		return "Pais: " + this.pais + ", Codigo Postal: " + this.codigoPostal + ", Numero interno: " + this.numeroIntero + ", Numero externo: " + this.numeroExterno;
	}

	// Inicio de Getters y Setters
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public int getNumeroIntero() {
		return numeroIntero;
	}

	public void setNumeroIntero(int numeroIntero) {
		this.numeroIntero = numeroIntero;
	}

	public int getNumeroExterno() {
		return numeroExterno;
	}

	public void setNumeroExterno(int numeroExterno) {
		this.numeroExterno = numeroExterno;
	}
	// Fin de Getters y Setters	
}
