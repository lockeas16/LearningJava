
public class Ejercicios20Feb {

	public static void main(String[] args) {
	    /*
	    1) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
	    */
	    int numeroInt1 = 40;
	    short numeroShort1 = 3;
	    System.out.println("El resultado de " + numeroInt1 + " + " + numeroShort1 + " es: " + (numeroInt1 + numeroShort1));
	    System.out.println("El resultado de " + numeroInt1 + " - " + numeroShort1 + " es: " + (numeroInt1 - numeroShort1));
	    System.out.println("El resultado de " + numeroInt1 + " * " + numeroShort1 + " es: " + (numeroInt1 * numeroShort1));
	    System.out.println("El resultado de " + numeroInt1 + " / " + numeroShort1 + " es: " + (numeroInt1 / numeroShort1));
	    System.out.println("El resultado de " + numeroInt1 + " % " + numeroShort1 + " es: " + (numeroInt1 % numeroShort1));
	    /*
	    2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
	    */
	    byte numByte1 = 34, numByte2 = -23;
	    if (numByte1 > numByte2){
	      System.out.println(numByte1 + " es mayor a " + numByte2);
	    } else {
	      System.out.println(numByte1 + " es menor a " + numByte2);
	    }
	    /*
	    3) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».
	    */
	    String miNombre = "Pedro";
	    System.out.println("Bienvenido " + miNombre);
	    /*
	    4) Haz una aplicación que calcule el área de un círculo(pi * radio al cuadrado). Declara dos variables, una para el valor de pi y otra para el radio, usando literales para esto, mostrar el resultado por consola.
	    */
	    float pi = 3.14159f;
	    int radio = 20;
	    System.out.println("El area de un circulo con radio " + radio + " es: " + (pi * (radio * radio)));
	    /*
	    5) Usando el operador modulo (%) declarar una variable entera e indicar usando un if si el valor es par o impar.
	    */
	    short numeroEntero = 30;
	    if (numeroEntero % 2 == 0){
	      System.out.println("El numero " + numeroEntero + " es par");
	    } else {
	      System.out.println("El numero " + numeroEntero + " es impar");
	    }
	    /*
	    6) declara una variable double y comprueba si este numero es mayor o igual que cero e imprime por consola si el numero es o no es mayor a cero.
	    */
	    double numeroGrande = 344112395921.2309;
	    if (numeroGrande >= 0){
	      System.out.println("El numero " + numeroGrande + " es mayor o igual a cero");
	    } else {
	      System.out.println("El numero " + numeroGrande + " es menor a cero");
	    }
	    /*
	    7) declara una variable de tipo String para almacenar un dia de la semana , usala para que el programa nos diga si es un dia laboral o no. Usa un switch para ello
	    */
	    String diaSemana = "Lunes";
	    switch (diaSemana) {
	      case "Lunes":
	        System.out.println(diaSemana + " es un dia laboral");
	        break;
	      case "Martes":
	        System.out.println(diaSemana + " es un dia laboral");
	        break;
	      case "Miercoles":
	        System.out.println(diaSemana + " es un dia laboral");
	        break;
	      case "Jueves":
	        System.out.println(diaSemana + " es un dia laboral");
	        break;
	      case "Viernes":
	        System.out.println(diaSemana + " es un dia laboral");
	        break;
	      case "Sabado":
	        System.out.println(diaSemana + " no es un dia laboral");
	        break;
	      case "Domingo":
	        System.out.println(diaSemana + " no es un dia laboral");
	        break;
	      default:
	        System.out.println(diaSemana + " no es un dia de la semana");
	        break;
	    }
	}

}
