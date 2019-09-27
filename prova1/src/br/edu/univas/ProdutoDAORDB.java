package br.edu.univas;

import java.util.List;

public class ProdutoDAORDB implements ProdutoDAO {

	@Override
	public void insertProduto(Produto produto) {
		System.out.println("Inserindo produto em RDB.");
	}

	@Override
	public List<Produto> listProdutos() {
		System.out.println("Listando produto em RDB");
		return null;
	}

}
