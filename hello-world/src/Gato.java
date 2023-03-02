// Una clase es una defnición, de un plano para construir gatos
public class Gato {
	// Atributos de la clase
	/*
	 * Los atributos son aquellas características que definen a la clase
	 */
	String nombre;
	float peso;
	String color;
	String raza;
	
	// Sintaxis para el metodo
	/*
	 * visibilidad tipoRetorno nombreMetodo ([argumentosOpcionales]){
	 *    // Cuerpo del metodo
	 * }
	 */
	// Tipo de retorno void es que no devuelve nada
	public void correr() {
		System.out.println("El gato esta corriendo");
	}
	
	public void vomitar() {
		System.out.println("El gato vomitó la cena");
	}
}
