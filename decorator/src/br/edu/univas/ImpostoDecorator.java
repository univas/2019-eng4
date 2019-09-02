package br.edu.univas;

public abstract class ImpostoDecorator implements Imposto {

	protected ImpostoDecorator outroImposto;

	public ImpostoDecorator() {
		outroImposto = null;
	}
	
	public ImpostoDecorator(ImpostoDecorator outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	@Override
	public abstract double calculaImposto(Orcamento orcamento);
	
	protected double calculoOutroImposto(Orcamento orcamento) {
		if (outroImposto == null) {
			return 0.0;
		}
		return outroImposto.calculaImposto(orcamento);
	}


}
