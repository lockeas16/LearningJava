package com.clasesjava.one;

public class ApplicationMainCar {

	public static void main(String[] args) {
		Car car;
		car = new Car();
		
		// Asignamos un atributo y usamos un método
		car.color = "Cafe";
		System.out.println(car.obtainColor());
		
		// Llamamos el otro metodo de la clase
		car.advance();
		System.out.println("Otra cosa");
	}

}
