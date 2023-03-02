
public class PlayingVars {

	public static void main(String[] args) {
		//	Es posible definir más de una variable en una sola declaración
		int numero, variable;
		/*
		 * Esto provoca un error de compilación
		int *var;
		 * Esto provoca tambien error de compilacion
		int 1var;
		 * No es posible volver a definir la misma variable con su mismo tipo o uno nuevo, esto provoca error si variable ya estaba definido
		double variable;
		 * No es posible usar palabras reservadas (como int) para nombre de variable, esto generar error
		float int;
		 * No es posible asignar directamente valores de tipos de variables incompatibles como char y numero
		*/
		Character caracter = '2';
		System.out.println("Caracter wrapper: " + caracter);
	}

}
