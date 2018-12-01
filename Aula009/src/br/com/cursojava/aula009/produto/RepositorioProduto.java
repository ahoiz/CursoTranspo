package br.com.cursojava.aula009.produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.cursojava.aula009.BancoUtil;
import br.com.cursojava.aula009.Contato;

public class RepositorioProduto {

	public void inserir(Produto produto) {
		String sql = "insert into produtos(nome,descricao,preco) values (?,?,?)";
		Connection conexao = BancoUtil.getConexao();
		try {
			// retorna um objeto
			PreparedStatement comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			// cada numero é o indice do '?' na String de insert
			comando.setString(1, produto.getNome());
			comando.setString(2, produto.getDescricao());
			comando.setDouble(3, produto.getPreco());

			// executa o insert substituindo os '?'
			comando.execute();

			// pega a chaves gerada, no caso, id
			ResultSet keys = comando.getGeneratedKeys();
			// se tiver um registro ele vai para essa posição
			if (keys.next()) {
				Integer id = keys.getInt(1);
				produto.setId(id);
			}
			// nao fechar conexao pois pode estar sendo usado por outros
			// recursos
			keys.close();
			comando.close();

		} catch (SQLException e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
			System.out.println("Não foi possivel inserir o registro no BD");
		}

	}

	public List<Produto> buscarTodos() {
		List<Produto> lista = new ArrayList<>();
		String sql = "SELECT * FROM produtos";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			ResultSet cursor = comando.executeQuery();
			Produto produto = null;
			while (cursor.next()) {
				produto = criarProduto(cursor);
				lista.add(produto);

			}
			cursor.close();
			comando.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel recuperar lista de registros do BD");
		}

		return lista;

	}

	public Produto buscarPorId(Integer id) {
		Produto produto = null;
		String sql = "SELECT * FROM contatos WHERE id = ?";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1, id);
			ResultSet cursor = comando.executeQuery();
			if (cursor.next()) {
				produto = criarProduto(cursor);

			}
			cursor.close();
			comando.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel recuperar lista de registros do BD");
		}

		return produto;

	}

	public void atualizar(Produto produto) {
		String sql = "UPDATE produtos SET nome = ?, descricao = ?, preco = ? WHERE id = ?";
		Connection conexao = BancoUtil.getConexao();
		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setString(1, produto.getNome());
			comando.setString(2, produto.getDescricao());
			comando.setDouble(3, produto.getPreco());
			comando.setInt(4, produto.getId());
			comando.executeUpdate();
			comando.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel recuperar lista de registros do BD");

		}

	}

	public void remover(Integer id) {
		String sql = "DELETE FROM produtos  WHERE id = ?";
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
		String sql = "SELECT count (*) AS total FROM produtos";
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

	public List<Produto> buscarPorFaixaPreco(Double precoMax, Double precoMin) {
		List<Produto> lista = new ArrayList<>();
		Produto produto = null;
		String sql = "SELECT * FROM produtos WHERE (preco <= ? AND preco >= ?)";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setDouble(1, precoMax);
			comando.setDouble(2, precoMin);
			ResultSet cursor = comando.executeQuery();
			while (cursor.next()) {
				produto = criarProduto(cursor);
				lista.add(produto);

			}			
			cursor.close();
			comando.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel recuperar lista de registros do BD");
		}

		return lista;

	}

	public Produto criarProduto(ResultSet cursor) throws SQLException {
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		String descricao = cursor.getString("descricao");
		Double preco = cursor.getDouble("preco");
		return new Produto(id, nome, descricao, preco);

	}

}
