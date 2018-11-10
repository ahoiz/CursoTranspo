package br.com.cursojava.ex01;
import java.util.Scanner;

public class AppCadastro {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Cadastro app = new Cadastro();
		app.mostrarMenu();
		teclado.close();

	}

}
