package br.edu.univas;

public class App {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		
		AbstractFactory factory = FactoryProvider.getFactory(osName);
		Button button = factory.getButton();
		button.paint();
		
		CheckBox checkBox = factory.getCheckBox();
		checkBox.paint();
	}
}
