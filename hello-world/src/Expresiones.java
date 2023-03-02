
public class Expresiones {

	public static void main(String[] args) {
		//	Una expresion es el resultado de usar una o mas literales y/o variables con un operador
		//	Operadores aritmeticos
		System.out.println("Operadores aritmeticos");
		System.out.println("1 + 2 = " + (1 + 2)); // a + b Suma 
		// El operador + actua como suma para literales numericas y expresiones entre parentesis, mientras que opera como concatenacion para cadenas
		System.out.println("2 + 1 = " + (2 - 1)); // a - b Resta
		System.out.println("2 * 1 = " + (2 * 2)); // a * b Multiplicación
		System.out.println("4 / 2 = " + (4 / 2)); // a / b Division
		System.out.println("9 % 2 = " + (9 % 2)); // a % b Modulo -
		System.out.println("####################");
		
		//	Podemos usar mas de dos literales o mas de dos variables en una expresion
		int c = 1 + 2 + 3 + 4 + 5;
		System.out.println(c); // 15
		
		//	Se tiene el operador ampersand && (AND) para evaluar booleanos 
		// El && deja de evaluar si encuentra un false, porque ya no importa la siguiente expresión, siempre será false al final
		boolean valorBooleano = (2 > 4) && (3 == 5); // <- Lo marca como codigo muerto porque ya no tiene caso evaluarlo
		System.out.println(valorBooleano); // F && F = false
		
		//	Tabla de verdad para && AND
		//	A B Resultado
		//	T T T    <- Solo es true para cuando ambas partes son true
		//	F F F
		//	T F F
		//	F T F
		
		//	Se tiene el operador pipe || (OR) para evaluar booleanos 
		// El && deja de evaluar si encuentra un true, porque ya no importa la siguiente expresión, siempre será true al final
		boolean valorBooleano2 = (1 < 2) || (3 == 3) || (5 != 6); // <- Lo marca como codigo muerto porque ya no tiene caso evaluarlo
		System.out.println(valorBooleano2); // T && F = true
		
		//	Tabla de verdad para || OR
		//	A B Resultado
		//	T T T
		//	F F F     <-Solo es false cuando ambos son false
		//	T F T
		//	F T T
		
		//	Se pueden usar parentesis para agrupar expresiones
		boolean valorBooleano3 = true || (true && false);
		//						  T   ||    (T && F) 
		//						  T   ||    F 
		//						  T 
		
		//	Operadores de asignación (el igual =)
		System.out.println("Operadores de asignación");
		int a = 2; // = asignación, se lee: lo de la derecha se le asigna a lo de la izquierda
		System.out.println("a = " + a);
		
		a += 3; // += Suma y asignación (a = a + 3)
		System.out.println("a = " + a); // 5
		
		a -= 3; // += Resta y asignación (a = a - 3)
		System.out.println("a = " + a); // 2
		
		a *= 3; // += Multiplicacion y asignación (a = a * 3)
		System.out.println("a = " + a); // 6
		
		a /= 3; // += Division y asignación (a = a / 3)
		System.out.println("a = " + a); // 2
		
		a %= 2; // += Modulo y asignación (a = a % 2)
		System.out.println("a = " + a); // 0
		System.out.println("####################");
		
		//	Operadores relacionales | Devuelven un true o false siempre porque hacen preguntas para comparar
		int a2 = 1;
		int b = 2;
		System.out.println("Operadores relacionales");
		System.out.println(a2 + " != " + b + " " + (a2 != b)); // Distinto | 1 != 2 true
		System.out.println(a2 + " == " + b + " " + (a2 == b)); // Igualdad | 1 == 2 false
		System.out.println(a2 + " < " + b + " " + (a2 < b)); // Menor que | 1 < 2 true
		System.out.println(a2 + " > " + b + " " + (a2 > b)); // Mayor que | 1 > 2 false
		System.out.println(a2 + " <= " + b + " " + (a2 <= b)); // Menor igual que | 1 <= 2 true
		System.out.println(a2 + " >= " + b + " " + (a2 >= b)); // Mayor igual que | 1 >= 2 false
		System.out.println("####################");
		
		//	Operadores especiales
		System.out.println("Operadores especiales");
		int a3 = 1;
		a3++; //Incremento -> a3 = a3 + 1
		System.out.println(a3); // a3 = 2
		
		a3--; //Decremento -> a3 = a3 - 1
		System.out.println(a3); // a3 = 1
		System.out.println("####################");
	}

}
