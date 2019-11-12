package br.edu.univas;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private MeatMenu meat;
	private VegetalMenu vegetal;
	
	public Menu() {
		meat = new MeatMenu();
		vegetal = new VegetalMenu();
	}
	
	public List<String> getMenu() {
		List<String> items = new ArrayList<>();
		items.addAll(meat.getItems());
		items.addAll(vegetal.getItems());
		return items;
	}
	
}
