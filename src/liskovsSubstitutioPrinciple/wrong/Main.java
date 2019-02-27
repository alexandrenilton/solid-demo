package liskovsSubstitutioPrinciple.wrong;

public class Main {
	
	private static Retangulo getNovoRetangulo() {
		return new Quadrado();
	}
	
	public static void main(String...args) {
		Retangulo r = Main.getNovoRetangulo();
		r.setLargura(5);
		r.setAltura(10);
		System.out.println("Area total.: " + r.getArea());
	}
}
