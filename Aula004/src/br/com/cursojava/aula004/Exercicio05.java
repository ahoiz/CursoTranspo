package br.com.cursojava.aula004;

public class Exercicio05 {

	public static void main(String[] args) {

		int soma = 0;
		String calculo = "";

		for (int i = 1; i <= 50; i++) {

			calculo += String.valueOf(i) + "+";
			soma += i;

		}

		System.out.println("Calculo: " + calculo.substring(0, calculo.length() - 1));
		System.out.println("Total: " + soma);

	}

}
