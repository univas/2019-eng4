package br.edu.univas;

public class App {

	public static void main(String[] args) {
		Moveable car = new Ferrari();
		System.out.println("Top speed Ferrari: " + car.getSpeed() + "(MPH)");
		
		MoveableAdapter adapter = new MoveableAdapterImpl(car);
		System.out.println("Top speed Ferrari: " + adapter.getSpeed() + "(KM/H)");
	}
	
	
}
