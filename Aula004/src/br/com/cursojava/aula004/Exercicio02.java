package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String opcao;

		do {
			System.out.println("Escolha uma op��o:");
			System.out.println("A - Abrir arquivo");
			System.out.println("B - Procurar arquivo");
			System.out.println("C - Download de arquivo");
			System.out.println("D - Upload de arquivo");
			System.out.println("S - Sair\n");
			opcao = teclado.nextLine();
			/*if (opcao.equals("A")) {

				System.out.println("Voc� escolheu Abrir arquivo\n");

			} else if (opcao.toUpperCase().equals("B")) {

				System.out.println("Voc� escolheu Procurar arquivo\n");

			} else if (opcao.toUpperCase().equals("C")) {

				System.out.println("Voc� escolheu Download de arquivo\n");

			} else if (opcao.toUpperCase().equals("D")) {

				System.out.println("Voc� escolheu Upload de arquivo\n");

			} else if (opcao.toUpperCase().equals("S")) {

				System.out.println("Saindo...\n");

			} else {

				System.out.println("Op��o inv�lida!\n");

			}*/
			switch(opcao) {
			case "A":
				System.out.println("Voc� escolheu Abrir arquivo\n");
				break;
			case "B":
				System.out.println("Voc� escolheu Procurar arquivo\n");
				break;
			case "C":
				System.out.println("Voc� escolheu Download de arquivo\n");
				break;
			case "D":
				System.out.println("Voc� escolheu Upload de arquivo\n");
				break;
			case "S":
				System.out.println("Saindo...\n");
				break;
			default:
				System.out.println("Op��o inv�lida!\n");
			}
				
			
		} while (!opcao.equalsIgnoreCase("s"));

		teclado.close();

	}

}
