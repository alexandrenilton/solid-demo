package openClosedPrinciple.ex1.wrong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import openClosedPrinciple.ex1.correct.Arquivo;
import openClosedPrinciple.ex1.correct.ArquivoPdf;
import openClosedPrinciple.ex1.correct.ArquivoTxt;
import openClosedPrinciple.ex1.correct.ArquivoWord;

public class GerarArquivosWrong {
	public void gerarArquivos(List<Arquivo> arquivos) {
		for (Arquivo arquivo : arquivos) {
			if (arquivo instanceof ArquivoPdf ) {
				System.out.println("Gerando um PDF");
			} else if (arquivo instanceof ArquivoWord ) {
				System.out.println("Gerando um arquivo Word");
			} else if (arquivo instanceof ArquivoTxt) {
				System.out.println("Gerando um arquivo txt");
			}
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
		GerarArquivosWrong ga = new GerarArquivosWrong();
		ga.gerarArquivos(ga.getArquivos());
	}
}
