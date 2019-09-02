package br.edu.univas;

public class ISSDecorator extends ImpostoDecorator {

	public ISSDecorator() {
		super();
	}
	
	public ISSDecorator(ImpostoDecorator outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.07 + calculoOutroImposto(orcamento);
	}

}
