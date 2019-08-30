package br.edu.univas;

public class Square implements Component {

	@Override
	public void draw() {
		System.out.println("*********");
		System.out.println("*       *");
		System.out.println("*       *");
		System.out.println("*       *");
		System.out.println("*********");
	}
}
