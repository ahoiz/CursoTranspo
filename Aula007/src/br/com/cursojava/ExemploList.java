package br.com.cursojava;

import java.util.List;
import java.util.ArrayList;

public class ExemploList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> nomes = new ArrayList<>();

		// adicionar elementos ao final da lista
		nomes.add("João");
		nomes.add("Maria");
		// adiciona ao início da lista
		nomes.add(0, "Ronaldo");
		System.out.println(nomes.size());
		// troca item na posição definida (ex: ultima posição)
		nomes.set(nomes.size() - 1, "Tibúrcio");
		// busca elemento específico na lista por indice
		System.out.println(nomes.get(2));
		// busca indice de um elemento específico (1a ocorencia)
		System.out.println(nomes.indexOf("Ronaldo"));
		// se não existir retorna -1
		System.out.println(nomes.indexOf("Craldyu"));
		// verifica se contém na lista
		System.out.println(nomes.contains("João"));
		System.out.println(nomes.contains("Craldyu"));
		// cria sublista
		List<String> sublista = nomes.subList(2, nomes.size());
		System.out.println(sublista);
		// remover elemento da lista por índice
		System.out.println(nomes);
		nomes.remove(0);
		System.out.println("Antes" + nomes);
		// remover elementdo da lista por referencia
		nomes.remove("João");
		System.out.println("Depois " + nomes);

		System.out.println(nomes.size());

	}

}
