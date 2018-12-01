package br.com.cursojava.aula009;

import java.util.List;

public class RepositorioContatoTeste {

	public static void main(String[] args) {
		testRemover();
		testContar();

	}

	private static void testInserir() {
		Contato contato = new Contato(null, "Bagrinho", "b@teste.com", "33221100");
		RepositorioContato repositorio = new RepositorioContato();

		repositorio.inserir(contato);
		System.out.println(contato);

	}

	private static void testListarTodos() {

		RepositorioContato repositorio = new RepositorioContato();
		List<Contato> buscarTodos = repositorio.buscarTodos();
		System.out.println("=============================");
		System.out.println("LISTAR TODOS");
		System.out.println("=============================");
		for (Contato contato : buscarTodos) {
			System.out.println(contato);
		}

	}

	private static void testListarPorId(Integer id) {

		RepositorioContato repositorio = new RepositorioContato();
		Contato contato = repositorio.buscarPorId(id);

		System.out.println(contato);

	}

	private static void testAtualizar() {
		RepositorioContato repositorio = new RepositorioContato();
		Contato contato = repositorio.buscarPorId(1);
		contato.setNome("Bagrinho da Silva Brasil");
		repositorio.atualizar(contato);
		contato = repositorio.buscarPorId(1);
		System.out.println(contato);

	}

	private static void testRemover() {
		RepositorioContato repositorio = new RepositorioContato();
		Contato contato = repositorio.buscarPorId(1);
		repositorio.remover(1);
		contato = repositorio.buscarPorId(1);
		System.out.println(contato);

	}

	private static void testContar() {
		RepositorioContato repositorio = new RepositorioContato();
		long quantidade = repositorio.contar();
		System.out.println(quantidade);

	}

}
