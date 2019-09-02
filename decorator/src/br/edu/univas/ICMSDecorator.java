package br.edu.univas;

public class ICMSDecorator extends ImpostoDecorator {

	public ICMSDecorator() {
		super();
	}
	
	public ICMSDecorator(ImpostoDecorator outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.15 + calculoOutroImposto(orcamento);
	}
	
}
