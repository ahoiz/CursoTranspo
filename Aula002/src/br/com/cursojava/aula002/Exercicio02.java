package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a base do ret�ngulo:");
		double base = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a altura do ret�ngulo:");
		double altura = Double.parseDouble(teclado.nextLine());

		double area = base * altura;
		double perimetro = (base * 2) + (altura * 2);
		System.out.printf("A �rea do ret�ngulo � %.2f � %.2f.\n", area, perimetro);

		teclado.close();

	}

}
