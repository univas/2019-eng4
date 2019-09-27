package br.edu.univas;

public class XmlFactory implements AbstractFactory {

	@Override
	public PedidoDAO getPedidoDAO() {
		return new PedidoDAOXML();
	}

	@Override
	public ProdutoDAO getProdutoDAO() {
		return new ProdutoDAOXML();
	}

}
