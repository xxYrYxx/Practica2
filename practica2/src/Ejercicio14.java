import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		int termino;
		int n0 = 0;			//termino 0
		int n1 = 1;			//termino 1
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.print("Introduce el término a calcular: ");
			termino = teclado.nextInt();
		} while (termino < 0);
		
		if(termino<2){
			n1=termino;
		}

		for (int i = 2; i < termino + 1; i++) {
			n1 += n0;
			n0 = n1 - n0;
		}
		System.out.println("El término " + termino + " es " + n1);
	}

}
