package br.edu.univas;

import java.util.List;

public class ProdutoDAOXML implements ProdutoDAO {

	@Override
	public void insertProduto(Produto produto) {
		System.out.println("Inserindo produto em XML.");
	}

	@Override
	public List<Produto> listProdutos() {
		System.out.println("Listando produto em XML");
		return null;
	}

}
