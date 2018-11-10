package br.com.cursojava;

import java.util.List;
import java.util.ArrayList;

public class ExemploList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> nomes = new ArrayList<>();

		// adicionar elementos ao final da lista
		nomes.add("Jo�o");
		nomes.add("Maria");
		// adiciona ao in�cio da lista
		nomes.add(0, "Ronaldo");
		System.out.println(nomes.size());
		// troca item na posi��o definida (ex: ultima posi��o)
		nomes.set(nomes.size() - 1, "Tib�rcio");
		// busca elemento espec�fico na lista por indice
		System.out.println(nomes.get(2));
		// busca indice de um elemento espec�fico (1a ocorencia)
		System.out.println(nomes.indexOf("Ronaldo"));
		// se n�o existir retorna -1
		System.out.println(nomes.indexOf("Craldyu"));
		// verifica se cont�m na lista
		System.out.println(nomes.contains("Jo�o"));
		System.out.println(nomes.contains("Craldyu"));
		// cria sublista
		List<String> sublista = nomes.subList(2, nomes.size());
		System.out.println(sublista);
		// remover elemento da lista por �ndice
		System.out.println(nomes);
		nomes.remove(0);
		System.out.println("Antes" + nomes);
		// remover elementdo da lista por referencia
		nomes.remove("Jo�o");
		System.out.println("Depois " + nomes);

		System.out.println(nomes.size());

	}

}
