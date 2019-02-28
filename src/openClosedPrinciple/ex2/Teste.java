package openClosedPrinciple.ex2;

public class Teste {
	
	public static void main(String[] args) {
		TabelaDePreco tabela = new TabelaDePrecoDiferenciada();
		ServicoDeEntrega entrega = new Frete();
		
		Compra compra = new Compra(200.00, "Brasilia");
		
		Compra compra2 = new Compra(200.00, "SAO PAULO");
		
		CalculadoraDePrecos cp = new CalculadoraDePrecos(tabela, entrega);
		cp.calcula(compra);
		
		tabela = new TabelaDePrecoFimDeAno();
		entrega = new FreteAviao();
		
		cp = new CalculadoraDePrecos(tabela, entrega);
		cp.calcula(compra2);
	}
}
