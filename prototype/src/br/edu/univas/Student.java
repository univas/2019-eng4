package br.edu.univas;

public class Student implements Prototype {

	private String name;
	private String email;
	private String cpf;

	public Student() {
		
	}
	
	public Student(String name, String email, String cpf) {
		this.name = name;
		this.email = email;
		this.cpf = cpf;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", cpf=" + cpf + "]";
	}
	
	@Override
	public Prototype clone() {
		return new Student(this.name, this.email, this.cpf);
	}
	
}
