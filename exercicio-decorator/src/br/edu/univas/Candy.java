package br.edu.univas;

public class Candy extends TreeDecorator {

	public Candy(ChristmasTree decorator) {
		super(decorator);
	}

	public String decorate() {
        return super.decorate() + decorateWithColoredCandy();
    }
     
    private String decorateWithColoredCandy() {
        return " with Colored Candy";
    }
}
