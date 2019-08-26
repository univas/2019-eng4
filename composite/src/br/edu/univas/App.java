package br.edu.univas;

public class App {

	public static void main(String[] args) {
		Employee developer1 = new Developer(1, "Rodrigo");
		Employee developer2 = new Developer(2, "João");
		Employee developer3 = new Developer(3, "Maria");
		
		Employee manager1 = new Manager(4, "José");
		
		Department software1 = new Department("Software House 1");
		software1.addEmployee(developer1);
		software1.addEmployee(developer2);
		software1.addEmployee(developer3);
		software1.addEmployee(manager1);
		
		software1.printName();
	}
	
}
