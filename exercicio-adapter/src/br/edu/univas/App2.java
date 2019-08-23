package br.edu.univas;

public class App2 {

	public static void main(String[] args) {
		RequestAdapter request = new RequestAdapterImpl();
		String students = request.getAllStudents();
		
		System.out.println(students);
	}
	
}
