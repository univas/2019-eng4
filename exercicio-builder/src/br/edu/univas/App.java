package br.edu.univas;

public class App {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("FIAT", "Palio ELX", "Prata", 4, 2017, 2016);
		
		Vehicle vehicle2 = new Vehicle("Volksvagen", "Gol", "Branco", 4, 2019, 2019);
		
		System.out.println("Ve�culo 1:");
		System.out.println(vehicle1);
		
		System.out.println("Ve�culo 2:");
		System.out.println(vehicle2);
	}
}
