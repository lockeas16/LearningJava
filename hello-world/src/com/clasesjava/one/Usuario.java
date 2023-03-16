package com.clasesjava.one;

// La visibilidad de la clase es independiente a la visibilidad de los atributos
// El default es que la visibilidad sea dentro del mismo paquete si no se especifica visibilidad
// Si la visibilidad es public, se puede usar en cualquier otro paquete mientras se le importe
public class Usuario {
	/*
	 * Sintaxis de visibilidad
	 * 
	 * Visibilidad tipoDato identificador
	 * 
	 * Siendo public, se le puede acceder de manera directa
	 * Siendo private, sólo se le puede acceder dentro de la misma clase
	 */
	private String nombre;
	private String apellido;
	private int edad;
	private String direccion;

	/*
	 * La visibilidad por defecto es que sólo se usa dentro del mismo paquete
	 * 
	 * Al igual que los atributos, podemos indicar la visibilidad al inicio
	 * y podemos usar la default, public o private
	 */
	public Usuario() {
		this.nombre = "Desconocido";
		this.apellido = "Desconocido";
		this.edad = 0;
		this.direccion = "Desconocido";
	}
	
	/*
	 * Este constructor es privado y no puede ser usado salvo dentro de la misma
	 * clase
	 */
	private Usuario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Usuario(String nombre) {
		this.nombre = nombre;
		this.apellido = "Apellido generico";
		this.edad = 10;
		this.direccion = "Direccion Generica";
	}

	public Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Usuario(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		// Podemos invocar un método propio para asignar el atributo
		asignarEdad(edad);
	}

	public Usuario(String nombre, String apellido, int edad, String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
	}
	
	// Y como los constructores, los métodos tambien manejan la misma visibilidad
	private String obtenerNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}

	public String obtenerInformacion() {
		String information = "Nombre: " + obtenerNombreCompleto() + "\n" + "Edad: " + edad + "\n" + "Direccion: "
				+ direccion;
		return information;
	}

	/*
	 * Al tener atributos privados, es necesario generar un metodo que nos permita
	 * asignarle valores.
	 */
	public void asignarNombre(String nombre) {
		this.nombre = nombre;
	}

	public void asignarApellido(String apellido) {
		this.apellido = apellido;
	}

	/*
	 * Tambien esto nos permite introducir lógica para no permitir valores
	 * inválidos, como ejemplo
	 */
	public void asignarEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
		} else {
			System.out.println("La edad es inválida");
		}
	}

	public void asignarDireccion(String direccion) {
		this.direccion = direccion;
	}

	/*
	 * Y como contraparte, así como se tienen metodos para asignar valores, también
	 * necesitamos metodos para recuperar los atributos si fuese necesario
	 */
	public String obtenerNombre() {
		// Podemos hacer alguna transformacion del atributo
		return this.nombre.toUpperCase();
	}

	public String obtenerApellido() {
		return this.apellido;
	}

	public int obtenerEdad() {
		return this.edad;
	}

	public String obtenerDireccion() {
		return this.direccion;
	}

}
