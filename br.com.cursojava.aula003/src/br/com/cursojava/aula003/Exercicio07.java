package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase:");
		String frase = teclado.nextLine();
		/*
		 * String semVogalA = frase.replace("a", "").replace("A", ""); String
		 * semVogalE = semVogalA.replace("e", "").replace("E", ""); String
		 * semVogalI = semVogalE.replace("i", "").replace("I", ""); String
		 * semVogalO = semVogalI.replace("o", "").replace("O", ""); String
		 * semVogalU = semVogalO.replace("u", "").replace("U", ""); String
		 * semVogaisTrimmed = semVogalU.trim();
		 */

		/*frase = frase.replace("a", "").replace("A", "").replace("e", "").replace("E", "").replace("i", "")
				.replace("I", "").replace("o", "").replace("O", "").replace("u", "").replace("U", "");*/
		
		frase = frase.replaceAll("[aáâãàäAÁÂÃÀÄeéèêëEÉÈÊËiíìïîIÍÌÎÏoóòôõöOÓÒÔÕÖuúùûüUÚÙÛÜ]","");

		System.out.println(frase.trim());

		teclado.close();

	}

}
