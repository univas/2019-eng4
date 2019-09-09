package br.edu.univas;

public class App {

	public static void main(String[] args) {
		ChristmasTree tree1 = new Bulbs(new Candy(new ChristmasTreeImpl()));
		System.out.println(tree1.decorate());
		//expected:
		//Christmas tree with Colored Candy with Bubble Lights

		ChristmasTree tree2 = new Bulbs(new Bulbs(new Candy(new ChristmasTreeImpl())));
		System.out.println(tree2.decorate());
		//expected:
		//Christmas tree with Colored Candy with Bubble Lights with Bubble Lights
	}
}
