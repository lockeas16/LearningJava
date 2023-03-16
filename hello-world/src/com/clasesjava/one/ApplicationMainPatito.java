package com.clasesjava.one;

/* Con la sentencia import, podemos traer clases de otro 
 * paquete siempre y cuando sean públicas
 */
import com.clasesjava.publicClasses.Patito;

public class ApplicationMainPatito {

	public static void main(String[] args) {
		// Aqui es posible usar la clase Patito aún siendo de otro package porque es
		// public
		Patito unPatito = new Patito();

	}

}
