public class Ejercicio7 {

	public static void main(String[] args) {

		String cadena = "";
		int multiplo = 0;
		int contador = 1;

		multiplo = 3 * contador;
		cadena += multiplo;
		contador++;
		multiplo = 3 * contador;

		while (multiplo <= 3000) {
			cadena += (", " + multiplo);
			contador++;
			multiplo = 3 * contador;
		}
		System.out.println(cadena);
	}

}
