package br.edu.univas;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		Student studentA = new Student(100, "João", "joao@gmail.com", "Rua X, nº 1 Bairro W", new Date(), 98821-2348);
		System.out.println(studentA);
		
		Student studentB = new Student(100, "Maria", "maria@gmail.com", "Rua Y, nº 9 Bairro P", new Date(), 97381-2821);
		System.out.println(studentB);
	}
}
