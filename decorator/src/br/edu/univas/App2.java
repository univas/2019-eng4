package br.edu.univas;

public class App2 {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(349.99);
		
		ImpostoDecorator imposto = new ICMSDecorator(
				new IPIDecorator(new ISSDecorator()));
		
		System.out.println(imposto.calculaImposto(orcamento));
	}
	
}
