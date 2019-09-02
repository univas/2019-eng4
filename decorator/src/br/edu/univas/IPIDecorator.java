package br.edu.univas;

public class IPIDecorator extends ImpostoDecorator {

	public IPIDecorator() {
		super();
	}
	
	public IPIDecorator(ImpostoDecorator outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + calculoOutroImposto(orcamento);
	}

}
