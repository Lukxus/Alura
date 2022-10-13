package br.com.alura.java.io.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
	
	//Serealização é a transformção de um fluxo binario em objeto
	//Desserialização é a transformação de um objeto em um fluxo binario

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
//		String nome = "Nico Steppat";
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		
//		oos.writeObject(nome);
//		
//		oos.close();
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		
		String nome = (String) ois.readObject();
		
		ois.close();
		
		System.out.println(ois);
		System.out.println(nome);
	}

}
