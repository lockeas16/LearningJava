package com.clasesjava.one;

public class Fecha {
	private Integer anio;
	private Integer mes;
	private Integer dia;
	
	
	public Fecha(Integer anio, Integer mes, Integer dia) {
		this.anio = anio;
		this.mes = mes;
		this.dia = dia;
	}
	
	public String getFechaCompleta() {
		return anio + "/" + mes + "/" + dia;
	}
	
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	public Integer getDia() {
		return dia;
	}
	public void setDia(Integer dia) {
		this.dia = dia;
	}
	
}
