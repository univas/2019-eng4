package br.edu.univas;

public class App {

	public static void main(String[] args) {
		Student studentA = new Student();
		studentA.setName("João");
		studentA.setEmail("joao@gmail.com");
		studentA.setCpf("932.384.283-11");
		
		System.out.println(studentA);
		
<<<<<<< HEAD
		Student studentB = (Student) studentA.clone();
		System.out.println(studentB);
=======
>>>>>>> fe5caffb445059c31dd393f57fc6ef1956fa7ab6
	}
	
}
