package br.edu.univas;

public class Manager implements Employee {

	private int id;
	private String name;
	
	public Manager(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public void printName() {
		System.out.println("Manager: ID: " + this.id + " - Name: " + this.name);
	}

}
