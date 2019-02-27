package openClosedPrinciple.correct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GerarArquivos {
	public void gerarArquivos(List<Arquivo> arquivos) {
		for (Arquivo arquivo : arquivos) {
			arquivo.gerar();
		}
	}
	
	
	// gerar massa de dados
	public List<Arquivo> getArquivos () {
		List<Arquivo> arquivos = new ArrayList<Arquivo>();
		
		arquivos.addAll(Arrays.asList(new ArquivoPdf(), 
									new ArquivoWord(),
									new ArquivoWord(),
									new ArquivoPdf(),
									new ArquivoTxt() ));
		
		return arquivos;
	}
	
	
	public static void main(String...args) {
		GerarArquivos ga = new GerarArquivos();
		ga.gerarArquivos(ga.getArquivos());
	}
}
