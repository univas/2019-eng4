package br.edu.univas;

import java.util.List;

public class App {

	public static void main(String[] args) {
		VegetalMenu vegetalMenu = new VegetalMenu();
		List<String> vegetables = vegetalMenu.getItems();
		
		System.out.println("Vegetables:");
		vegetables.forEach(System.out::println);
		
		MeatMenu meatMenu = new MeatMenu();
		List<String> meats = meatMenu.getItems();
		
		System.out.println("\n\nMeats:");
		meats.forEach(System.out::println);
	}
}
