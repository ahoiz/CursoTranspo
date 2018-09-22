package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade em dias:");
		int idadeEmDias = Integer.parseInt(teclado.nextLine());
		int idadeEmAnos = idadeEmDias / 360;
		int idadeEmMeses = (idadeEmDias - idadeEmAnos * 360) / 30;
		int sobraDias = idadeEmDias - idadeEmAnos * 360 - idadeEmMeses * 30;

		System.out.printf("Sua idade é %d ano(s), %d mes(es) e %d dia(s).\n", idadeEmAnos, idadeEmMeses, sobraDias);

		teclado.close();
	}

}
