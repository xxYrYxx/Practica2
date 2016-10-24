import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int aux;
		int numero = 0;
		double media;
		int contador = 0;
		Scanner teclado = new Scanner(System.in);

		//Saco la primera iteración del bucle
		System.out.print("Introduce un número: ");
		aux = teclado.nextInt();
		
		// Se piden números hasta que se introduce un 0
		while (aux != 0) {
			numero += aux; // Se va acumulando la suma
			contador++;
			System.out.print("Introduce otro número: ");
			aux = teclado.nextInt();
		}

		// Se calcula la media
		media = ((double) numero) / contador;

		System.out.println("La suma de los números introducidos es " + numero);
		System.out.println("La media aritmética de los números introducidos es "
						+ media);

	}

}
