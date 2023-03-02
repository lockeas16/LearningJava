
public class TiposDatos {
	/*
	*	Tipo de datos primitivos
	*	Todos los datos primitivos se guardan en su representación binaria como tal
	*/
	//	numeros enteros
	byte a = 56; // 8 bits -128 a 127 
	short b = 15; // 16 bits -32768 a 32767
	int c = 9999; // 32 bits -2^31 a (2^31) - 1
	//	Se debe asignar el valor con L o l para que nos tome que es un long
	long d = 9999l; // 64 bites -2^63 a (2^63) - 1
	
	//	numeros reales, punto decimal
	float e = 4.0f; // 32 bits | Se debe asignar el valor con f o F para que nos tome que es float
	double f = 8.234567; // 64 bits | Ya nos toma que el valor asignado es double por default
	
	//	otro tipo de datos
	//  siempre se usan comillas sencillas	
	char g = 'a'; // 16 bits | Y solo se puede almacenar un caracter, su valor va contra ASCII
	
	boolean h; // 1 bit Valor booleano (true o false)
	
	// Referencia
	
	// Wrapper que acaban siendo clases que estan dentro de las APIs base
	Byte i;
	Short j;
	Integer k;
	Long l;
	Float m;
	Double n;
	Character o;
	Boolean p;
	
	
	// Otros
	String q = "Hola Mundo Java";
	
	//	Arreglos
	//	Java es cero indexado, el primer índice es el 0
	int[] arreglo;
	String[] cadenas;
	char[] caracteres;
}
