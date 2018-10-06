package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[5];
		
		for(int i = 0;i < 5;i++) {
			System.out.printf("Insira a %dª nota:\n",i+1);
			notas[i] = Double.parseDouble(teclado.nextLine());
		}
		
		for (Double listaNotas : notas) {
			System.out.println(listaNotas);
		}
		
		
		teclado.close();


	}

}
