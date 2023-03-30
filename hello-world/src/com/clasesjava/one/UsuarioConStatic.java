package com.clasesjava.one;

public class UsuarioConStatic {
	/*
	 * Este atributo static no es propio de cada objeto, si no que será compartido a
	 * nivel de la clase
	 */
	private static int contadorUsuarios = 0;

	/*
	 * La palabra reservada final nos permite declarar como constante el valor de un
	 * atributo y una vez asignado, no puede ser cambiado
	 * 
	 * Este atributo se debe asignar al momento de creación del objeto, esto es,
	 * usando un constructor
	 */
	private final String cumpleanios;

	// Metodos estaticos para manejar el atributo estático
	public static int getContadorUsuarios() {
		return contadorUsuarios;
	}

	// Metodo no estatico para demostrar la inconsistencia de usar un metodo no
	// estático
	// dentro de un contexto estático
	public int getContadorUsuariosNoStatic() {
		return contadorUsuarios;
	}

	public static void setContadorUsuarios(int contadorUsuarios) {
		UsuarioConStatic.contadorUsuarios = contadorUsuarios;
	}

	private String nombre;
	private String apellido;
	private int edad;
	

	private String direccion;

	public UsuarioConStatic() {
		this.nombre = "Desconocido";
		this.apellido = "Desconocido";
		this.edad = 0;
		this.direccion = "Desconocido";
		// Al momento de instanciar un objeto, se incrementa el
		// atributo estático
		contadorUsuarios++;
		// Es forzoso asignar valor a los atributos final al momento de creacion
		// y de no asignarse, el IDE marcará un error
		this.cumpleanios = "Desconocido";
	}

	public UsuarioConStatic(String nombre) {
		// Aqui estamos usando el constructor vacío dentro de otro constructor
		// El constructor vacio esta inicilizando el atributo final y por tanto no
		// genera error
		this();
		this.nombre = nombre;
	}

	public UsuarioConStatic(String nombre, String apellido) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public UsuarioConStatic(String nombre, String apellido, int edad) {
		// Podemos usar otros constructores, por ejemplo:
		this(nombre, apellido);
		/*
		 * Y aspi evitamos las siguientes instrucciones
		 * 
		   this();
		   this.nombre = nombre;
		   this.apellido = apellido;
		 *
		 * porque hacen exactamente lo mismo
		 */		
		// Podemos invocar un método propio para asignar el atributo
		setEdad(edad);
	}

	public UsuarioConStatic(String nombre, String apellido, int edad, String direccion) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
	}
	
	public UsuarioConStatic(String nombre, String apellido, int edad, String direccion, String cumpleanios) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
		this.cumpleanios = cumpleanios;
	}

	// Recordar que para nombrar metodos siempre empieza con minúscula y luego las
	// siguientes con mayúsculas
	private String getNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}

	// Por convencion, todo metodo usado para obtener un valor a un atributo privado
	// se nombrara como set+nombreAtributo
	// Estos serian los "setters"
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
		} else {
			System.out.println("La edad es inválida");
		}
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	// Por convencion, todo metodo usado para asignar un valor a un atributo privado
	// se nombrara como get+nombreAtributo
	// Estos serian los "getters"
	public String getNombre() {
		return this.nombre.toUpperCase();
	}

	public String getApellido() {
		return this.apellido;
	}

	public int getEdad() {
		return this.edad;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public String getCumpleanios() {
		return cumpleanios;
	}
	
	/* No podemos declarar un metodo setter para un atributo final
	 * porque el modificador ya esta declarando que su valor no puede
	 * ser modificado, por lo siguiente, este método genera un error
	 * 
	   public void setCumpleanios(String cumpleanios) {
		   this.cumpleanios = cumpleanios;
	   }
	 */
	
	public String obtenerInformacion() {
		String information = "Nombre: " + getNombreCompleto() + "\n" + "Edad: " + edad + "\n" + "Direccion: "
				+ direccion + "\nCumpleaños: " + cumpleanios + "\nTotal de usuarios: " + contadorUsuarios;
		return information;
	}
}
