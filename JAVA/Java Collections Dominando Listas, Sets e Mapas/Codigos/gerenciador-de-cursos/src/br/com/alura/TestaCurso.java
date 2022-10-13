package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Domindando as coleções do java", "Paulo Silveira");
		
		//System.out.println(aulas.getClass().getSimpleName());
		
		 //javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		 javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		 javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
	     javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		 
	     List<Aula> aulas = javaColecoes.getAulas();
	     
	     System.out.println(aulas); 
	     
	     System.out.println(aulas == javaColecoes.getAulas());  

	}

}
