package br.edu.univas;

public class FactoryProvider {

	private FactoryProvider() {
	}
	
	public static AbstractFactory getFactory(String osName) {
		osName = osName.toLowerCase();
		if (osName.contains("mac")) {
			return new MacFactory();
		} else if (osName.contains("windows")) {
			return new WindowsFactory();
		}
		return null;
	}
	
}
