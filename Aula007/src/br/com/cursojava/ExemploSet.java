package br.com.cursojava;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class ExemploSet {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<>();

		// adicionar elementos
		nomes.add("Maria");
		nomes.add("Ana");
		System.out.println(nomes);

		// não são permitidos elementos duplicados
		boolean adicionado = nomes.add("Ana");
		System.out.println("Foi adicionado \"Ana\"? " + adicionado);
		System.out.println(nomes);

		// verificar a quantidade de elementos
		System.out.println("Quantidade de elementos: " + nomes.size());

		// verificar se o conjunto tem um elemento
		System.out.println("Contains \"Ana\": " + nomes.contains("Ana"));
		System.out.println("Contains \"Beatriz\": " + nomes.contains("Beatriz"));
		// verifica se o conjunto está vazio
		System.out.println("Está vazio? " + nomes.isEmpty());
		// itera sobre o conjunto
		System.out.println("Iterador for:each");
		for (String atual : nomes) {
			System.out.println(atual);
		}
		// o for:each usa iterator internamente
		System.out.println("Iterador Iterator");
		Iterator<String> iterator = nomes.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// remove um elemento do conjunto
		System.out.println("Antes: " + nomes);
		nomes.remove("Maria");
		System.out.println("Depois: " + nomes);

	}
}