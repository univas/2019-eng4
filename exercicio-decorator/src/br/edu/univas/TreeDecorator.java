package br.edu.univas;

public abstract class TreeDecorator implements ChristmasTree {

	private ChristmasTree decorator;
	
	public TreeDecorator(ChristmasTree decorator) {
		this.decorator = decorator;
	}
	
	@Override
	public String decorate() {
		return decorator.decorate();
	}

}
