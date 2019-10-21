package br.edu.univas;

<<<<<<< HEAD
public class Student implements Prototype {
=======
public class Student {
>>>>>>> fe5caffb445059c31dd393f57fc6ef1956fa7ab6

	private String name;
	private String email;
	private String cpf;

<<<<<<< HEAD
	public Student() {
		
	}
	
	public Student(String name, String email, String cpf) {
		this.name = name;
		this.email = email;
		this.cpf = cpf;
	}
	
=======
>>>>>>> fe5caffb445059c31dd393f57fc6ef1956fa7ab6
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
	
<<<<<<< HEAD
	@Override
	public Prototype clone() {
		return new Student(this.name, this.email, this.cpf);
	}
	
=======
>>>>>>> fe5caffb445059c31dd393f57fc6ef1956fa7ab6
}
