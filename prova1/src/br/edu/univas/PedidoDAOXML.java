package br.edu.univas;

import java.util.List;

public class PedidoDAOXML implements PedidoDAO {

	@Override
	public void insertPedido(Pedido pedido) {
		System.out.println("Inserindo pedido em arquivo XML");
	}

	@Override
	public List<Pedido> listPedidos() {
		System.out.println("Listando pedido em arquivo XML");
		return null;
	}
}
