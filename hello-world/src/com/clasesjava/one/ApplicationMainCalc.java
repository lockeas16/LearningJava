package com.clasesjava.one;

public class ApplicationMainCalc {

	public static void main(String[] args) {
		Calculadora miCalc = new Calculadora (9,2);
		System.out.println(miCalc.obtenerPrimerOperador() + " + " + miCalc.obtenerSegundoOperador() + " = " + miCalc.suma());
		System.out.println(miCalc.obtenerPrimerOperador() + " - " + miCalc.obtenerSegundoOperador() + " = " + miCalc.resta());
		System.out.println(miCalc.obtenerPrimerOperador() + " * " + miCalc.obtenerSegundoOperador() + " = " + miCalc.multiplica());
		System.out.println(miCalc.obtenerPrimerOperador() + " / " + miCalc.obtenerSegundoOperador() + " = " + miCalc.divide());
		System.out.println(miCalc.obtenerPrimerOperador() + " % " + miCalc.obtenerSegundoOperador() + " = " + miCalc.modulo());
		System.out.println(miCalc.obtenerPrimerOperador() + " ^ " + miCalc.obtenerSegundoOperador() + " = " + miCalc.potencia());
		// Ahora le asignamos otros numeros para probar calculos con diferentes numeros
		miCalc.asignarPrimerOperador(300);
		miCalc.asignarSegundoOperador(60);
		System.out.println(miCalc.obtenerPrimerOperador() + " + " + miCalc.obtenerSegundoOperador() + " = " + miCalc.suma());
		System.out.println(miCalc.obtenerPrimerOperador() + " - " + miCalc.obtenerSegundoOperador() + " = " + miCalc.resta());
		System.out.println(miCalc.obtenerPrimerOperador() + " * " + miCalc.obtenerSegundoOperador() + " = " + miCalc.multiplica());
		System.out.println(miCalc.obtenerPrimerOperador() + " / " + miCalc.obtenerSegundoOperador() + " = " + miCalc.divide());
		System.out.println(miCalc.obtenerPrimerOperador() + " % " + miCalc.obtenerSegundoOperador() + " = " + miCalc.modulo());
		System.out.println(miCalc.obtenerPrimerOperador() + " ^ " + miCalc.obtenerSegundoOperador() + " = " + miCalc.potencia());
	}
}
