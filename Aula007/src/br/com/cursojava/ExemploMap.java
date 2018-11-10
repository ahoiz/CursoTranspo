package br.com.cursojava;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

	public static void main(String[] args) {

		Map<String, Pessoa> mapa = new HashMap<>();

		// adicionar elementos
		mapa.put("123456", new Pessoa("Maria"));
		mapa.put("789012", new Pessoa("João"));
		mapa.put("teste1", new Pessoa("Mariana"));
		System.out.println(mapa);
		// quantidade de elementos
		System.out.println("Quantidade elementos: " + mapa.size());
		// troca de valores
		mapa.put("troca", new Pessoa("Pessoa1"));
		System.out.println(mapa);
		mapa.put("troca", new Pessoa("Tibúrcio"));
		mapa.put("troca2", new Pessoa("Tibúrcio"));
		System.out.println(mapa);

		// verifica se existe uma chave
		System.out.println("Contains key(123456): " + mapa.containsKey("123456"));
		System.out.println("Contains key(naoexiste): " + mapa.containsKey("naoexiste"));

		// verifica se existe um valor específico
		System.out.println("Contains valor(Maria): " + mapa.containsValue(new Pessoa("Maria")));
		System.out.println("Contains valor(Joana): " + mapa.containsValue(new Pessoa("Joana")));

		// busca um elemento através da chave
		System.out.println("Busca por chave (123456): " + mapa.get("123456"));
		System.out.println("Busca por chave (troca1000): " + mapa.get("troca1000"));

		// retorna o conjunto de chaves (keys)
		System.out.println("Conjunto de chaves: " + mapa.keySet());

		// retorna o conjunto de valores
		System.out.println("Conjunto de valores: " + mapa.values());

		// percorre todos os elementos através de um entryset COMUM NO DIA-A-DIA
		System.out.println("Percorre Map atraves de um EntrySet:");
		for (Map.Entry<String, Pessoa> entry : mapa.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		// remover um elemento
		System.out.println("Antes: " + mapa);
		System.out.println("Após remover(123456): " + mapa.remove("123456"));
		System.out.println(mapa);
		System.out.println("Após clear():");
		mapa.clear();
		System.out.println(mapa);
		

	}

}
