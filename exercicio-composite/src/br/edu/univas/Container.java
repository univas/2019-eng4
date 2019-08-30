package br.edu.univas;

import java.util.ArrayList;
import java.util.List;

public class Container implements Component {

	private List<Component> components;
	
	public Container() {
		components = new ArrayList<>();
	}
	
	@Override
	public void draw() {
		components.forEach(Component::draw);
	}
	
	public void addComponent(Component component) {
		this.components.add(component);
	}
	
	public void removeComponent(Component component) {
		this.components.remove(component);
	}

}
