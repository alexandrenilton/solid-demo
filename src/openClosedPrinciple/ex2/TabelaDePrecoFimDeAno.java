package openClosedPrinciple.ex2;

public class TabelaDePrecoFimDeAno implements TabelaDePreco{

	@Override
	public double descontoPara(double valor) {
		System.out.println("TabelaDePrecoFimDeAno");
		return 0;
	}

}
