import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		int a;
		int b;

		while (true) {
			System.out.println("¿Qué quieres hacer?\n");
			System.out.println("1.Sumar.");
			System.out.println("2.Restar.");
			System.out.println("3.Multiplicar.");
			System.out.println("4.Dividir.");
			System.out.println("5.Salir del programa.");

			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:

				System.out.print("\n\nIntroduce el primer operando: ");
				a = teclado.nextInt();
				System.out.print("\nIntroduce el segundo operando: ");
				b = teclado.nextInt();

				System.out.println("Resultado: " + (a + b) + "\n");

				break;
			case 2:

				System.out.print("\n\nIntroduce el primer operando: ");
				a = teclado.nextInt();
				System.out.print("\nIntroduce el segundo operando: ");
				b = teclado.nextInt();

				System.out.println("Resultado: " + (a - b) + "\n");

				break;
			case 3:

				System.out.print("\n\nIntroduce el primer operando: ");
				a = teclado.nextInt();
				System.out.print("\nIntroduce el segundo operando: ");
				b = teclado.nextInt();

				System.out.println("Resultado: " + (a * b) + "\n");
				break;
			case 4:

				System.out.print("\n\nIntroduce el primer operando: ");
				a = teclado.nextInt();
				System.out.print("\nIntroduce el segundo operando: ");
				b = teclado.nextInt();

				System.out.println("Resultado: " + (a / b) + "\n");

				break;
			case 5:
				return;

			default:
				System.out.println("Opción inválida." + "\n");
				break;
			}
		}

	}
}
