

import java.util.Scanner;

public class SumarOchoNumeros {
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		int num=0;
		
		System.out.println("Introduzca ocho números: ");
		for (int i = 0; i < 8; i++) {
			System.out.println((i+1)+"º: ");
			num+=teclado.nextInt();
		}
		System.out.println("La suma de todos ellos es "+num);
	}
}
