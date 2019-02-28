package openClosedPrinciple.ex2;

public class FreteAviao implements ServicoDeEntrega{

	@Override
	public double para(String cidade) {
		System.out.println("Serviço de Entrega por avião");
		return 0;
	}

}
