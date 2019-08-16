package br.edu.univas;

public class WindowsFactory implements AbstractFactory {

	@Override
	public Button getButton() {
		return new WindowsButton();
	}

	@Override
	public CheckBox getCheckBox() {
		return new WindowsCheckBox();
	}

}
