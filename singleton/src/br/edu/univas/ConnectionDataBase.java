package br.edu.univas;

import java.util.ArrayList;
import java.util.List;

public class ConnectionDataBase {

	private static ConnectionDataBase instance;
	private List<String> connections;
	
	private ConnectionDataBase() {
		connections = new ArrayList<>();
	}
	
	public static ConnectionDataBase getInstance() {
		if (instance == null) {
			instance = new ConnectionDataBase();
		}
		return instance;
	}
	
	public void addConnection(String connection) {
		connections.add(connection);
	}
	
	public String getConnection() {
		if (connections.isEmpty()) {
			return null;
		}
		return connections.remove(0);
	}
	
}
