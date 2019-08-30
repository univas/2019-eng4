package br.edu.univas;

public class App {

	public static void main(String[] args) {
		Container container1 = new Container();
		container1.addComponent(new Circle());
		container1.addComponent(new Square());
		container1.addComponent(new Rectangle());
		
		Container container2 = new Container();
		container2.addComponent(new Circle());
		container2.addComponent(new Circle());
		
		container1.addComponent(container2);
		container1.draw();
	}
}
