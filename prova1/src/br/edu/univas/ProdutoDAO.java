package br.edu.univas;

import java.util.List;

public interface ProdutoDAO {

	void insertProduto(Produto produto);
	
	List<Produto> listProdutos();
}
