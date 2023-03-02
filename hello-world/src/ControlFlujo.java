
public class ControlFlujo {

	public static void main(String[] args) {
		boolean value = true;
		
		/* Instruccion if
		 * if (expresion booleana){
		 * 		//Toda instruccion que queremos que se ejecute si la instruccion se cumple
		 * }
		 * 
		 */
		if (value) {
			System.out.println("Entro al bloque de instruccion if");
		}
		
		// ! como operador de negacion,
		if (!value) {
			System.out.println("Entro al bloque de instruccion if");
		}
		
		System.out.println("Continuamos la ejecucion");
		
		/* Instruccion if else
		 * if (expresion booleana){
		 * 		//Toda instruccion que queremos que se ejecute si la instruccion se cumple
		 * }
		 * 
		 */
		int age = 18;
		if (age >= 18) {
			System.out.println("Es mayor de edad");			
			System.out.println("otra linea");
			age = -7;
			System.out.println("Nueva edad: " + age);						
		} else {
			System.out.println("No es mayor de edad");			
		}
		System.out.println("################");
		
		// Otro ejemplo de uso de if else combinando expresiones con &&
		int edad = 30;
		boolean single = true;
		
		if (edad >= 18 && single) {
			System.out.println("Vivir la vida loca");
		} else {
			System.out.println("Hay que respetar la vida");
		}
		
		// Otro ejemplo de uso de if else combinando expresiones con ||
		int days = 1;
		boolean dirty = true;
		if (dirty || days > 2) {
			System.out.println("Me doy un baño");
		} else {
			System.out.println("No me toca baño");
		}
		
		// Instruccion switch
		/*
		 * switch (valor a comparar){
		 * 	  case (valorParaLaComparacion) :
		 *       // Bloque de instrucciones
		 *       [break;] // Para indicar que corta con la evaluación de cases, con [] se especifica que es opcional
		 * 	  case (valor2ParaLaComparacion) :
		 *       // Bloque de instrucciones
		 *       [break;]
		 * 	  default: // En caso de que no haya entrado en ninguno de los casos, y el break puede estar al inicio aunque es comun dejarlo al final
		 *       // Bloque de instrucciones
		 *       [break;]
		 * }
		 * 
		 */
		
		int valorSwitch = 1;

		switch (valorSwitch) {
		case 1:
			System.out.println("Entró al case 1");
			break;
		case 2:
			System.out.println("Entró al case 2");
			break;
		case 3:
			System.out.println("Entró al case 3");
			break;
		case 4:
			System.out.println("Entró al case 4");
			break;

		default:
			System.out.println("Entró al default");
			break;
		}
		
		// Manejo de break
		int valorSwitchBr = 2;
		
		switch (valorSwitchBr) {
		case 1:
			System.out.println("Entró al case 1");
			break;
		case 2: // En caso de caer en el case 2, terminaria ejecutando todos los cases hasta encontrar un break
			System.out.println("Entró al case 2");
		case 3:
			System.out.println("Entró al case 3");
		case 4:
			System.out.println("Entró al case 4");
			break;
			
		default:
			System.out.println("Entró al default");
			break;
		}
		// El flujo anterior imprimiria lo siguiente 
		// Entró al case 2
		// Entró al case 3
		// Entró al case 4
		
		// Otro ejemplo de trabajo con switch para entender funcionamiento de break
		
		String valueString = "valor2";
		
		switch (valueString) {
		case "valor1":
			System.out.println("Entró al valor1");
			break;
		case "valor2":
			System.out.println("Entró al valor2");
		case "valor3":
			System.out.println("Entró al valor3");
		case "valor4":
			System.out.println("Entró al valor4");
			break;
		}
		System.out.println("fin");
		
		// Ifs anidados
		boolean married = true;
		int total = 10;
		if (married) {
			if (total == 10 || total > 5) {
				System.out.println("Entro al if anidado");
			} else {
				System.out.println("Entro al else anidado");
				// Se pueden ir anidando mas if's si se necesitan evaluar mas condiciones
				/*
				 * if (expresion) {
				 *    // Sentencias
				 * } else {
				 *    // Sentencias
				 * }
				 */
			}
		} else {			
			System.out.println("Entro al else del primer if");
		}
	}
}