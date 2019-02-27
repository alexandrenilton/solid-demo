package liskovsSubstitutioPrinciple.wrong;

public class Retangulo {
	protected int altura;
	protected int largura;
	
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getArea() {
		return altura * largura;
	}
}
