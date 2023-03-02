
public class Ejercicios22Feb {

	public static void main(String[] args) {
		/*
	    1) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
	    */
	    int index = 0;
	    while(index <= 100){
	       System.out.println("En while: Numero [" + index++ + "]");
	    }
	    /*
	    2) Haz el mismo ejercicio anterior con un bucle for.
	    */

	    for (int i = 0; i <= 100; i++){
	      System.out.println("En for: Numero [" + i + "]");
	    }

	    /*
	    3) Muestra los números del 1 al 100 (ambos incluidos) que sean divisibles entre 2 y 3(que el ismo numero sea divisible entre 2 y entre 3, residuo cero). Utiliza el bucle que desees.
	    */
	    for (int i = 0; i <= 100; i++){
	      if (i % 2 == 0 && i % 3 == 0){
	        System.out.println("Numero divisible por 2 y por 3 [" + i + "]");
	      }
	    } 
	    /*
	    4) Realizar la suma del 1 al 1000. Usa un bucle for  y despues un bucle while
	    */
	    for (int ind = 0, suma = 0; ind <= 1000; ind++, suma = suma + ind){
	       System.out.println("Numero a sumar:" + ind + " Suma acumulada es: " + suma);
	    }
	    /*
	    5) Realizar la suma de numeros pares que se encuentren entre el 1 y el 1000. Usa un bucle for  y despues un bucle while
	    */
	    for (int ind = 0, suma = 0; ind <= 1000; ind++){
	      if (ind % 2 == 0) {
	        suma = suma + ind;
	        System.out.println("Numero par a sumar en for:" + ind + " Suma acumulada es: " + suma);
	      }
	    }
	    //Ejercicio anterior pero con bucle while
	    boolean terminar = false;
	    int sumaPares = 0, cuenta = 0;
	    while (!terminar){
	      if (cuenta % 2 == 0){
	        sumaPares = sumaPares + cuenta;
	        System.out.println("Numero par a sumar en while:" + cuenta + " Suma acumulada es: " + sumaPares);
	      }
	      if (cuenta >= 1000){
	        terminar = true;
	      } else {
	        cuenta++;
	      }
	    }
	}
}
