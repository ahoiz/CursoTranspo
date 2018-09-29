package br.com.cursojava.aula003;

import java.util.Arrays;

public class ExemploString {

	public static void main(String[] args) {

		String curso = "Curso Java TranspoBrasil S�bado";

		// Quantidade de caracteres
		System.out.printf("O texto %s possui %d caracteres.\n", curso, curso.length());

		String semEspaco = curso.replace(" ", "");

		System.out.println(semEspaco);

		System.out.println("Cont�m 'TranspoBrasil'? " + curso.contains("TranspoBrasil"));
		System.out.println("Come�a com 'Curso? " + curso.startsWith("Curso"));
		System.out.println("termina com 'S�bado'? " + curso.endsWith("S�bado"));
		System.out.println(curso.indexOf("primeira ocorr�ncia de 'a': " + "a"));
		System.out.println("Primeira posi��o de 'a' � partir 10o indice: " + curso.indexOf("a", 10));
		System.out.println("Ultima ocorr�ncia do 'a': " + curso.lastIndexOf("a"));
		System.out.println("Tudo em mai�sculo: " + curso.toUpperCase());
		System.out.println("Tudo em min�sculo: " + curso.toLowerCase());
		System.out.println("Parte do texto(substring): " + curso.substring(11, 24));
		System.out.println(
				"Primeira mai�scula: " + curso.substring(0, 1).toUpperCase() + curso.substring(1).toLowerCase());

		if (Character.isLetter(curso.charAt(26))) {

			System.out.println("'�' � letra? Sim");

		} else {

			System.out.println("'�' � letra? N�o");

		}

		String user1 = "Jo�o";
		String user2 = "Jo�o";
		String user3 = new String("Jo�o");

		// compara endere�o de memoria, da true porque verifica no pool de
		// strings que ja existe
		System.out.println("user1 e user2, ==, ambos instanciados: " + (user1 == user2));

		System.out.println("user1 e user2, ==, um instanciado e outro Objeto: " + (user1 == user3));

		// compara conteudo do objeto, caracter por caracter, case sensitive
		System.out.println("user1 e user2, equals: " + user1.equals(user2));
		System.out.println("user1 e user3, equals: " + user1.equals(user3));
		System.out.println("user1 e user3 IgnoreCase: " + user1.equalsIgnoreCase(user3));

		// vari�vel com v�rios espa�os antes e depois
		String texto = "        oi galeris       ";
		String registro = "contato;contato@teste.com;3221100";

		System.out.printf(">%s<, length = %d\n", texto, texto.length());
		System.out.printf(">%s<, length = %d\n", texto.trim(), texto.trim().length());
		String[] valores = registro.split(";");
		System.out.println(valores[0]);
		System.out.println(valores[1]);
		System.out.println(valores[2]);
		System.out.println(Arrays.toString(valores));

	}

}
