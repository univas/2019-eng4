package br.edu.univas;

public class App {

	public static void main(String[] args) {
		
		//Shape redCircle = new RedCircle();
		
		//Shape blueCircle = new BlueCircle();
		
		//Shape redSquare = new RedSquare();
		
		//Shape blueSquare = new BlueSquare();
		
		Shape redCircle = new Circle(new Red());
		
		Shape blueCircle = new Circle(new Blue());
		
		Shape redSquare = new Square(new Red());
		
		Shape blueSquare = new Square(new Blue());
		
	}
}
