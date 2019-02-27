package liskovsSubstitutioPrinciple.correct;

public class FileTxt extends File {
	@Override
	public void write() {
		System.out.println("writing...");
	}
	
	@Override
	public void read() {
		System.out.println("reading...");
	}
}
