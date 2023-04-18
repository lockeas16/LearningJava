package com.clasesjava.polim;

public class Nino extends Persona {

	public Nino (String name, Integer age, Boolean gender) {
		super(name, age, gender);
	}
	
	@Override
	public void irAlEscuela() {
		System.out.println("Mis papas me llevan a la escuela");
	}

}
