package br.edu.univas;

public class App {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("windows")) {
			WindowsButton button = new WindowsButton();
			button.paint();
			
			WindowsCheckBox checkBox = new WindowsCheckBox();
			checkBox.paint();
		} else if (osName.contains("mac")) {
			MacButton button = new MacButton();
			button.paint();
			
			MacCheckBox checkBox = new MacCheckBox();
			checkBox.paint();
		}
	}
}
