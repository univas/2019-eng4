package br.edu.univas;

public class ISS implements Imposto {

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

}
