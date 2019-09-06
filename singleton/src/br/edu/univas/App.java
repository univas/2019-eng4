package br.edu.univas;

public class App {

	public static void main(String[] args) {
		ConnectionDataBase connection = ConnectionDataBase.getInstance();
		connection.addConnection("banco1");
		connection.addConnection("banco2");
		connection.addConnection("banco3");
		
		ConnectionDataBase connection2 = ConnectionDataBase.getInstance();
		String dataBaseInformation = connection2.getConnection();
		System.out.println(dataBaseInformation);
		
	}
	
}
