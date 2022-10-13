package br.com.alura.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteTeclado {

	public static void main(String[] args) throws IOException {
		
		
		Socket s = new Socket();

        InputStream fis = s.getInputStream(); //System.in; //new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = s.getOutputStream(); //System.out; //new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        
//		//Lendo o arquivo
//		InputStream  fis = System.in; //new FileInputStream("lorem.txt");
//		Reader isr = new InputStreamReader(fis);
//		BufferedReader br = new BufferedReader(isr);
//		
//		//Escrevendo no arquivo
//		OutputStream  fos = System.out;//new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
//		
		String linha = br.readLine();
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha+'\n');
			bw.flush();
			linha = br.readLine();
		}
		
		bw.close();
		br.close();
	}

}

