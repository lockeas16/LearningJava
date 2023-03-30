package com.clasesjava.one;

public class UsuarioCompuesto {
	private static int contadorUsuarios = 0;

	public static int getContadorUsuarios() {
		return contadorUsuarios;
	}

	public static void setContadorUsuarios(int contadorUsuarios) {
		UsuarioCompuesto.contadorUsuarios = contadorUsuarios;
	}

	private String nombre;
	private String apellido;
	private int edad;

	// Aqui estamos "componiendo" nuestra clase Usuario con otras dos Clases
	private Direccion direccion;
	private final Fecha cumpleanios;

	public UsuarioCompuesto() {
		this.nombre = "Desconocido";
		this.apellido = "Desconocido";
		this.edad = 0;
		this.direccion = new Direccion();
		contadorUsuarios++;
		this.cumpleanios = new Fecha(0, 0, 0);
	}

	public UsuarioCompuesto(String nombre) {
		this();
		this.nombre = nombre;
	}

	public UsuarioCompuesto(String nombre, String apellido) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public UsuarioCompuesto(String nombre, String apellido, int edad) {
		this(nombre, apellido);
		setEdad(edad);
	}

	public UsuarioCompuesto(String nombre, String apellido, int edad, Direccion direccion) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
	}

	public UsuarioCompuesto(String nombre, String apellido, int edad, Direccion direccion, Fecha cumpleanios) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
		this.cumpleanios = cumpleanios;
	}

	// Inicio de Getters y Setters
	public String getApellido() {
		return this.apellido;
	}

	public int getContadorUsuariosNoStatic() {
		return contadorUsuarios;
	}

	public Fecha getCumpleanios() {
		return cumpleanios;
	}

	public Direccion getDireccion() {
		return this.direccion;
	}

	public int getEdad() {
		return this.edad;
	}

	public String getNombre() {
		return this.nombre.toUpperCase();
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
		} else {
			System.out.println("La edad es inválida");
		}
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// Fin de Getters y Setters

	private String getNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}

	public String obtainInformation() {
		String information = "Nombre: " + getNombreCompleto() + "\n" + "Edad: " + this.edad + "\n" + "Direccion: "
		// Aqui usamos el metodo del atributo direeccion que nos devuelve la fecha,
		// porque es realmente responsabilidad de la clase de Direccion. Esto es separación de responsabilidades
				+ this.direccion.getDireccionCompleta() + "\nCumpleaños: " + this.cumpleanios.getFechaCompleta()
				+ "\nTotal de usuarios: " + contadorUsuarios;
		return information;
	}
}
