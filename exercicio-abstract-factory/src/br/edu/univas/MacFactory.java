package br.edu.univas;

public class MacFactory implements AbstractFactory {

	@Override
	public Button getButton() {
		return new MacButton();
	}

	@Override
	public CheckBox getCheckBox() {
		return new MacCheckBox();
	}

}
