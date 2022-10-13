package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter{
	public static void main(String[] args) throws IOException {
		//Fluxo de entrada com arquivo
		//InputStream  fis = new FileInputStream("lorem.txt");
		//Reader isr = new InputStreamReader(fis);
		//BufferedReader br = new BufferedReader(isr);

		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Estudando no estagio\n");
		bw.write("Estudando no estagio\n");
		bw.write("Estudando no estagio\n");
		bw.write("Estudando no estagio\n");
		bw.write("\n");
		
		
		
		bw.close();
	}
	
}
