package practica2;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		double capitalIni;
		double interes;
		int años;
		double capitalFin;
		Scanner teclado = new Scanner(System.in);

		//Pido los datos
		System.out.println("Introduce el capital inicial: ");
		capitalIni = teclado.nextDouble();
		System.out.println("Introduce el interés anual (en tanto por uno): ");
		interes = teclado.nextDouble();
		System.out
				.println("Introduce el número de años de duración de la inversión: ");
		años = teclado.nextInt();
		
		//Aplico la fórmula
		capitalFin = capitalIni * Math.pow((1 + interes), años);

		//Muestro el resultado
		System.out.println("Con un capital inicial de " + capitalIni
				+ ", un interés anual de " + interes
				+ ", y una duración de inversión de " + años
				+ " años, el capital final obtenido será de " + capitalFin);

	}
}
