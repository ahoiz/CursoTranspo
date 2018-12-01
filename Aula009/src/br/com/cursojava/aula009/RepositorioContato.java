package br.com.cursojava.aula009;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * Repositório de contatos, responsável por realizar o transformação
 * dos dados entre o paradigma do banco de dados ea aplicação (O.O)
 * @author Felipe
 * java da um insert com nome, email e telefone, o bd cria um id, java pega o id e grava no objeto
 */

public class RepositorioContato {

	// método pra inserir no BD
	public void inserir(Contato contato) {
		// não deve trocar '?' diretamente pois pode ter um sql injection (cod
		// mal intencionado)
		// prepared statement: validação do que o usuario inseriu
		String sql = "insert into contatos(nome,email,telefone) values (?,?,?)";
		Connection conexao = BancoUtil.getConexao();
		try {
			// retorna um objeto
			PreparedStatement comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			// cada numero é o indice do '?' na String de insert
			comando.setString(1, contato.getNome());
			comando.setString(2, contato.getEmail());
			comando.setString(3, contato.getTelefone());

			// executa o insert substituindo os '?'
			comando.execute();

			// pega a chaves gerada, no caso, id
			ResultSet keys = comando.getGeneratedKeys();
			// se tiver um registro ele vai para essa posição
			if (keys.next()) {
				Integer id = keys.getInt(1);
				contato.setId(id);
			}
			// nao fechar conexao pois pode estar sendo usado por outros
			// recursos
			keys.close();
			comando.close();

		} catch (SQLException e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
			System.out.println("Não foi possivel pq vc inseriu de uma maneira burra");
		}

	}

	public List<Contato> buscarTodos() {
		List<Contato> lista = new ArrayList<>();
		String sql = "SELECT * FROM contatos";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			// quando o comando retorna algo, utiliza executeQuery(), que
			// retornará o ResultSet
			ResultSet cursor = comando.executeQuery();
			Contato contato = null;
			// while que verifica se há prox registro
			// next() tenta mover o cursor pra prox linha, retorna true/false
			while (cursor.next()) {
				contato = criarContato(cursor);
				lista.add(contato);

			}
			cursor.close();
			comando.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel recuperar lista de registros do BD");
		}

		return lista;
	}

	public Contato buscarPorId(Integer id) {
		Contato contato = null;
		String sql = "SELECT * FROM contatos WHERE id = ?";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1, id);
			// quando o comando retorna algo, utiliza executeQuery(), que
			// retornará o ResultSet
			ResultSet cursor = comando.executeQuery();
			// while que verifica se há prox registro
			// next() tenta mover o cursor pra prox linha, retorna true/false
			if (cursor.next()) {
				contato = criarContato(cursor);

			}
			cursor.close();
			comando.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel recuperar lista de registros do BD");
		}

		return contato;
	}

	public void atualizar(Contato contato) {
		String sql = "UPDATE contatos SET nome = ?, email = ?, telefone = ? where id = ?";
		Connection conexao = BancoUtil.getConexao();
		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setString(1, contato.getNome());
			comando.setString(2, contato.getEmail());
			comando.setString(3, contato.getTelefone());
			comando.setInt(4, contato.getId());
			comando.executeUpdate();
			comando.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel recuperar lista de registros do BD");

		}

	}

	private Contato criarContato(ResultSet cursor) throws SQLException {
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		String email = cursor.getString("email");
		String telefone = cursor.getString("telefone");
		return new Contato(id, nome, email, telefone);
	}

	public void remover(Integer id) {
		String sql = "DELETE FROM contatos WHERE id = ?";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1, id);
			comando.execute();
			comando.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel recuperar lista de registros do BD");

		}

	}
	
	public long contar() {
		String sql = "SELECT count (*) AS TOTAL FROM contatos";
		Connection conexao = BancoUtil.getConexao();
		long total = 0;

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			ResultSet cursor = comando.executeQuery();
			if (cursor.next()) {
				total = cursor.getLong("total");
			}
			cursor.close();
			comando.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel recuperar lista de registros do BD");

		}
		
		return total;

	}

}
