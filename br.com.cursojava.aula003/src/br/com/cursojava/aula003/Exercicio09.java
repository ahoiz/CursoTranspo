package br.com.cursojava.aula003;

//import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase:");
		String frase = teclado.nextLine();


		/*
		 * String fraseTrimmed = frase.trim();
		 * String ultimaPalavra =
		 * fraseTrimmed.substring(fraseTrimmed.lastIndexOf(" ") + 1);
		 * System.out.println(ultimaPalavra);
		 */

		int index = frase.lastIndexOf(" ");

		System.out.println(frase.substring(index + 1));

		teclado.close();

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.println("Digite uma frase:"); String frase =
		 * teclado.nextLine(); String fraseTrimmed = frase.trim(); String[]
		 * palavras = fraseTrimmed.split(" "); int ultimaPalavraDoArray =
		 * Array.getLength(palavras);
		 * System.out.println(palavras[ultimaPalavraDoArray-1]);
		 * teclado.close();
		 */

	}

}
