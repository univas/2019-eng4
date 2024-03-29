package br.edu.univas;

public class Vehicle {

	private String brand;
	private String model;
	private String color;
	private int port;
	private int modelYear;
	private int manufactureYear;
	
	public Vehicle(String brand, String model, String color, int port, int modelYear, int manufactureYear) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.port = port;
		this.modelYear = modelYear;
		this.manufactureYear = manufactureYear;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	public int getManufactureYear() {
		return manufactureYear;
	}
	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", color=" + color + ", port=" + port + ", modelYear="
				+ modelYear + ", manufactureYear=" + manufactureYear + "]";
	}
	
	
}
