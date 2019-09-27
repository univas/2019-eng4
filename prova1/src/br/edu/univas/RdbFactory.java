package br.edu.univas;

public class RdbFactory implements AbstractFactory {

	@Override
	public PedidoDAO getPedidoDAO() {
		return new PedidoDAORDB();
	}

	@Override
	public ProdutoDAO getProdutoDAO() {
		return new ProdutoDAORDB();
	}

}
