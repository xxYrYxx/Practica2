import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		Scanner tecladoNum = new Scanner(System.in);

		Scanner tecladoLetra = new Scanner(System.in);
		char letra = 's';

		while (letra == 's') {
			System.out.print("Introduce el lado 'a' del triángulo: ");
			a = tecladoNum.nextDouble();
			System.out.print("Introduce el lado 'b' del triángulo: ");
			b = tecladoNum.nextDouble();
			System.out.print("Introduce el lado 'c' del triángulo: ");
			c = tecladoNum.nextDouble();

			if (!((a + b > c) && (a + c > b) && (b + c > a))) {
				System.out.println("ERROR: No es posible "
						+ "construir un triángulo con esas medidas.");
				System.out.print("¿Quieres volver a intentarlo?(s/n) ");
				letra=tecladoLetra.next().charAt(0);
				continue;
			}

			if (a == b || a == c || b == c) {
				if (a == b && a == c) {
					System.out.println("Es un triángulo rectángulo.");
					System.out.print("¿Quieres volver a intentarlo?(s/n) ");
					letra=tecladoLetra.next().charAt(0);
					continue;
				}
				System.out.println("Es un triángulo isósceles.");
				System.out.print("¿Quieres volver a intentarlo?(s/n) ");
				letra=tecladoLetra.next().charAt(0);
				continue;
			}
			System.out.println("Es un triángulo escaleno.");
			System.out.print("¿Quieres volver a intentarlo?(s/n) ");
			letra=tecladoLetra.next().charAt(0);
		}
	}

}
