package br.com.alura.java.io.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		// inteiro -> unicode(codepoint) -> encoding(UTF-8, UTF-16)
		// O encoding qu o java usa por padrão muda em cada sistema operacional
//		String s = "ç";
//		System.out.println(s.codePointAt(0));
//		
//		
//		Charset charset = Charset.defaultCharset();
//		System.out.println("Encoding padrao " +charset.displayName());
//		
//		byte bytes1[] = s.getBytes("UTF-8");
//		System.out.println(bytes1.length + ", UTF-8");
//		
//		String sNovo = new String(bytes1);
//		System.out.println("Convertendo bytes1 "+sNovo);
//		
//		byte bytes2[] = s.getBytes("UTF-16");
//		System.out.println(bytes2.length + ", UTF-16");
//		
//		sNovo = new String(bytes2);
//		System.out.println("Convertendo bytes2 "+sNovo);
//		
//		byte bytes3[] = s.getBytes("windows-1252");
//		System.out.println(bytes3.length + ", windows-1252");
//		
//		sNovo = new String(bytes3);
//		System.out.println("Convertendo bytes3 "+sNovo);
//		
//		byte bytes4[] = s.getBytes(StandardCharsets.US_ASCII);
//		System.out.println(bytes4.length + ", US_ASCII");
//		
//		sNovo = new String(bytes4);
//		System.out.println("Convertendo bytes3 "+sNovo);
		
//		for (byte b : bytes2) {
//			System.out.println(b);
//			
//		}
//		
		
		Charset utf8 = StandardCharsets.UTF_8;
		String s1 = "13º Órgão Oficial";
		byte[] bytes = s1.getBytes(utf8);
		String s2 = new String(bytes, utf8);
		System.out.println(s2);
		
		
		String s = "ç";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        bytes = s.getBytes("windows-1252");
        System.out.print(bytes.length + ", windows-1252, ");
        String sNovo = new String(bytes, "windows-1252");
        System.out.println(sNovo);

        bytes = s.getBytes("UTF-16");
        System.out.print(bytes.length + ", UTF-16, ");
        sNovo = new String(bytes, "windows-1252");
        System.out.println(sNovo);

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.print(bytes.length + ", US_ASCII, ");
        sNovo = new String(bytes, "windows-1252");
        System.out.println(sNovo);

      bytes = s.getBytes(StandardCharsets.UTF_8);
      System.out.print(bytes.length + ", UTF-8, ");
      sNovo = new String(bytes, "UTF-8");
      System.out.println(sNovo);
		
		
	}
	
}
