
public class ApplicationMain {

	public static void main(String[] args) {
		Gato gato; // Declaracion de variable tipo Gato
		// En la creacion del objeto se esta reservando memoria y se registra en el Heap
		gato = new Gato(); // Creación de un objeto tipo Gato

		gato.nombre = "Michi";
		gato.peso = 3.5f;
		gato.color = "Blanco";
		gato.raza = "Siames";

		System.out.println(gato.nombre);
		// Podemos recuperar el valor del atributo de nuestro objeto y asignarlo a una
		// variable para hacer algo con ello
		float pesoGato = gato.peso;
		System.out.println(pesoGato);

		// Y podemos usar alguno de los métodos, especificando parentesis que, en este
		// caso, no tiene argumentos
		gato.correr(); // Ejecuta lo que tiene el metodo, que es imprimir una linea
	}
}