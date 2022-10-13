package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException { //checked

		
		//Fluxo de entrada com arquivo
		
		OutputStream  fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Hello world!");
		bw.newLine();
		
		bw.close();
	}

}
