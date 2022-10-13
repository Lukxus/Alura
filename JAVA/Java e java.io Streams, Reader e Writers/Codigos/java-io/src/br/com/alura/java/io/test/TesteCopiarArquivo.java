package br.com.alura.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException { //checked

		
		//Lendo o arquivo
		InputStream  fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		//Escrevendo no arquivo
		OutputStream  fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		while (linha != null) {
			bw.write(linha+'\n');
			linha = br.readLine();
		}
		
		OutputStream os = System.out;
		
		bw.close();
		br.close();
	}

}
