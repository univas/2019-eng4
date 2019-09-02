package br.edu.univas;

public class App {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(250);
		
		Imposto ipi = new IPI();
		System.out.println(ipi.calculaImposto(orcamento));
		
		Imposto iss = new ISS();
		System.out.println(iss.calculaImposto(orcamento));
		
		Imposto icms = new ICMS();
		System.out.println(icms.calculaImposto(orcamento));
	}
}
