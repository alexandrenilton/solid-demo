package openClosedPrinciple.ex2;

public class FreteAviao implements ServicoDeEntrega{

	@Override
	public double para(String cidade) {
		System.out.println("Servi�o de Entrega por avi�o");
		return 0;
	}

}
