public class CicloFor {

	public static void main(String[] args) {
		// Ciclo for
		int i;
		/* for (valor de inicio; condicion de paro; incremento o decremento){
		 *    // Bloque de instrucciones
		 *    // Cada ejecución del ciclo es una iteracion
		 * }
		 */
		// La condición se verifica antes de iniciar el bucle y el ciclo se ejecuta hasta que la condición de paro sea false
		// Imprime de 0 a 10 porque inicia en cero y la condición se cumple mientras sea igual o menor a 10
		System.out.println("Ciclo de 0 a 10");
		for (i = 0; i <= 10; i++) {
			System.out.println("Valor de la variable i [" + i + "]");
		}
		
		// Imprime de 0 a 9 porque inicia en cero y la condición se cumple mientras sea igual a 10
		System.out.println("Ciclo de 0 a 9");
		for (i = 0; i < 10; i++) {
			System.out.println("Valor de la variable i [" + i + "]");
		}
		
		System.out.println("Ciclo con iterador definido dentor del for, con incrementos de dos en dos");
		// Es posible declarar la variable a iterar dentro del mismo for y la variable sólo es posible usarla dentro del for
		for (int j = 0; j <= 10; j = j + 2) {
			System.out.println("Valor de la variable j [" + j + "]");
		}
		
		// Dentro del bucle for se pueden codificar distintas sentencias, como un switch
		for (int j = 0; j <= 10; j++) {
			System.out.println("Valor de la variable j [" + j + "]");
			switch (j) {
			case 3:
				System.out.println("case 3");				
				break;
			case 5:
				System.out.println("case 5");				
				break;
			case 8:
				System.out.println("case 8");				
				break;
			default:
				System.out.println("case default");				
				break;
			}
		}
		
		// Ejercicio: usando las instrucciones for e if, imprimir los numeros pares del 0 al 100
		for (int k = 0; k <= 100; k++) {
			if (k % 2 == 0) {				
				System.out.println("Numero par: " + k);							
			}
		}
		
		// Si no indicamos llaves, el bucle del for sólo puede tener una sentencia
		for (int k = 0; k <= 5; k++) 
			System.out.println("Esta sentencia se ejecuto " + k + " veces");
		System.out.println("Esta sentencia se ejecuto al final del ciclo");
	}
}
