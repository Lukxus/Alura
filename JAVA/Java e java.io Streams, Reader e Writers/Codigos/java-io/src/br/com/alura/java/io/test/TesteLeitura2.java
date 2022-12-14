package br.com.alura.java.io.test;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2  {
	public static void main(String[] args)throws Exception {
		
		Scanner scanner = new Scanner(new File("contas2.csv"), "UTF-8");
		
		
		while(scanner.hasNextLine()){
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
//			String valores[] = linha.split(",");
//			System.out.println(valores);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
//			System.out.println(valor1);
//			System.out.println(valor2);
//			System.out.println(valor3);
//			System.out.println(valor4);
//			System.out.println(valor5);
			
			//System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			
			String valorFormatado = String.format(new Locale("pt","BR"), "%s - %04d-%08d, %20s: %05.2f", tipoConta, agencia, numero, titular, saldo);
            System.out.println(valorFormatado);
			
			linhaScanner.close();
			
		}
		
		scanner.close();
		
	}
}
