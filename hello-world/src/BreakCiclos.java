
public class BreakCiclos {

	public static void main(String[] args) {
		// La isntruccion break se puede usar para "romper" un ciclo
		for (int i = 0; i <= 10; i++) {
			System.out.println("Valor de i [" + i + "] dentro de for");
			if (i == 6) {
				// Al cumplirse esta condición, se rompe el ciclo y se ejecuta lo que esta
				// enseguida del for
				break;
			}
		}
		System.out.println("Despues del ciclo for");

		// la misma aplicación de un break pero dentro de un while
		int j = 0;
		while (j <= 10) {
			System.out.println("Valor de j [" + j + "] dentro de while");
			if (j == 6) {
				break;
			}
			j++;
		}
		System.out.println("Despues del ciclo while");

		// Instrucción continue en un for
		for (int i = 0; i <= 10; i++) {
			if (i == 3 || i == 7) {
				// Termina la iteracion actual
				continue;
			}
			System.out.println("Valor de i [" + i + "] dentro de for");
		}

		// Instrucción continue en un while
		int k = 0;
		while (k <= 10) {
			if (k == 3 || k == 7) {
				// Incrementamos, porque de otra manera, el ciclo nunca terminaria porque
				// siempre se vuelve a cumplir que k = 3 ya que no se volvio a incrementar k
				k++;
				// Termina la iteracion actual
				continue;
			}
			System.out.println("Valor de k [" + k + "] dentro de while");
			k++;
		}
	}

}
