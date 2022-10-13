package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>(); 
		//sets não tem ordem
		//garante que não existam duplicatas
		
		alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        
        System.out.println(alunos.size());
        alunos.add("Mauricio Aniche");
        System.out.println(alunos.size());
        
        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        System.out.println(pauloEstaMatriculado);
        alunos.remove("Sergio Lopes");
        // metodos são mais performaticos do que nas listas
        
//        for (String aluno : alunos) {
//			System.out.println(aluno);
//		}
        
        alunos.forEach(aluno->{
        	System.out.println(aluno);
        });

        System.out.println(alunos);    
	}
}
