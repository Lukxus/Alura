package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter{
	public static void main(String[] args) throws IOException {
		//Fluxo de entrada com arquivo
		//InputStream  fis = new FileInputStream("lorem.txt");
		//Reader isr = new InputStreamReader(fis);
		//BufferedReader br = new BufferedReader(isr);

//		FileWriter fw = new FileWriter("lorem2.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
		
		//PrintStream ps = new PrintStream("lorem2.txt");
		
		//PrintStream ps = new PrintStream(new File("lorem2.txt"));
		
		PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");
		
		ps.println("Estudando outra coisa no estagio");
		ps.println("Estudando outra coisa no estagio");
		ps.println("Estudando outra coisa no estagio");
		ps.println("Estudando outra coisa no estagio");
		ps.println("Estagiando, estagiando");
		ps.println();
		ps.close();
		
//		bw.write("Estudando no estagio\n");
//		bw.write("Estudando no estagio\n");
//		bw.write("Estudando no estagio\n");
//		bw.write("Estudando no estagio\n");
//		bw.write("\n");
//		bw.close();
		
		
	}
	
}
