package br.com.alura.java.io.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {
	
	//Serealização é a transformção de um fluxo binario em objeto
	//Desserialização é a transformação de um objeto em um fluxo binario
	
	//A cada mudança feita na classe, o meu nuemro de classe se altera
	//Quando eu salvo um objeto numa rquivo externo ele salva junto o id atual da classe. Então se eu
	//alterar a  classe, podeem ocorrer erros.
	//Uma boa pratica é forçar a versão a sempre ser a mesma

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Nico");
//		cliente.setProfissao("dev");
//		cliente.setCpf("2345345323");
//		
//		String nome = "Nico Steppat";
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		
//		oos.writeObject(cliente);
//		
//		oos.close();
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		
		Cliente nome = (Cliente) ois.readObject();
		
		ois.close();
		
		System.out.println(ois);
		System.out.println(nome.getCpf());
		System.out.println(nome.getProfissao());
		System.out.println(nome.getNome());
	}

}
