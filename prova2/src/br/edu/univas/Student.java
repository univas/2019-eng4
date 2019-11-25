package br.edu.univas;

import java.util.Date;

public class Student {

	private int register;
	private String name;
	private String email;
	private String address;
	private Date birthday;
	private int cellphone;
	
	public Student(int register, String name, String email, String address, Date birthday, int cellphone) {
		this.register = register;
		this.name = name;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.cellphone = cellphone;
	}

	public int getRegister() {
		return register;
	}

	public void setRegister(int register) {
		this.register = register;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getCellphone() {
		return cellphone;
	}

	public void setCellphone(int cellphone) {
		this.cellphone = cellphone;
	}

	@Override
	public String toString() {
		return "Student [register=" + register + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", birthday=" + birthday + ", cellphone=" + cellphone + "]";
	}
	
}
