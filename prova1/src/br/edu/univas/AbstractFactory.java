package br.edu.univas;

public interface AbstractFactory {

	PedidoDAO getPedidoDAO();
	
	ProdutoDAO getProdutoDAO();
	
}
