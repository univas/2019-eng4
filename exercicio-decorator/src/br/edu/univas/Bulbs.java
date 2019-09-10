package br.edu.univas;

public class Bulbs extends TreeDecorator {

	public Bulbs(ChristmasTree decorator) {
		super(decorator);
	}
	
	public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }
     
    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }

}
