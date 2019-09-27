package br.edu.univas;

import java.util.List;

public interface PedidoDAO {

	void insertPedido(Pedido pedido);
	
	List<Pedido> listPedidos();
}
