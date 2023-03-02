
public class CicloWhile {

	public static void main(String[] args) {
		// while se usaría para cuando no sabemos cuantas iteraciones vamos a hacer
		/* Instruccion while */
		/*
		 * while (condicion de paro){
		 *    // Bloque de instrucciones
		 * }
		 */
		int inicio = 1;
		
		while (inicio < 10) {
			System.out.println("Dentro del while, inicio = [" + inicio + "]");
			inicio++;
		} // <----- Notese que no es necesario finalizar el bucle con ;
		
		
		int otro = 0;
		boolean salir = false;
		
		System.out.println("Otro ejemplo de un ciclo while con un booleano para condicion de paro");
		while (!salir) {
			System.out.println("Dentro del while, salir = [" + salir+ "], otro[" + otro + "]");
			otro++;
			if (otro >= 13) {
				salir = true;
			}
		}
		
		/* Instruccion do while */
		/*
		 * while (condicion de paro){
		 *    // Bloque de instrucciones
		 * }
		 */
		int numero = 1;
		
		// Ejecuta al menos una vez el bloque de instrucciones
		// numero ya vale 1 pero aun asi se ejecuta el do while
		do {
			System.out.println("Dentro del do while, numero = [" + numero + "]");
		} while (numero == 0);
		
		// Ejercicio: Mostrar los numeros pares del 1 al 100 usando un while
		System.out.println("Imprimir numeros pares del 1 al 100 usando un while");
		int otroNumero = 1;
		while (otroNumero <= 100) {
			if (otroNumero % 2 == 0) {
				System.out.println("Numero par: " + otroNumero);
			}
			
		}
	}

}
