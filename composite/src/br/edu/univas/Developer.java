package br.edu.univas;

public class Developer implements Employee {

	private int id;
	private String name;

	public Developer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void printName() {
		System.out.println("Developer: ID: " + this.id + " - Name: " + this.name);
	}

}
