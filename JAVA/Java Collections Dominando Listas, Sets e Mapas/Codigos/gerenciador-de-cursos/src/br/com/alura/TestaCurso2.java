package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Domindando as coleções do java", "Paulo Silveira");
		
		//System.out.println(aulas.getClass().getSimpleName());
		
		 //javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		 javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		 javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
	     javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		 
	     List<Aula> aulasImutaveis = javaColecoes.getAulas();
	     List<Aula> aulas = new ArrayList<>(aulasImutaveis);
	     
	     
	     
	     System.out.println(aulas);
	     
	     Collections.sort(aulas);
	     
	     System.out.println(aulas);
	     
	     System.out.println(javaColecoes.getTempoTotal());
	     
	     System.out.println(javaColecoes);
	     
	     
	     

	}

}
