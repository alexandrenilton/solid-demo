package liskovsSubstitutioPrinciple.correct;

public class FileReadOnly extends File {
	
	@Override
	public void write() {
		try {
			throw new Exception("nao implementado..");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void read() {
		System.out.println("Read a readOnly file..");
	}
}
