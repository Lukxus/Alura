package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class QualColecaoUsar {

	public static void main(String[] args) {
		
		Collection<Aluno> alunos = new HashSet<>();
		alunos.size();
		//alunos.get(0); //erro pois não tem o metodo get
		
		System.out.println(alunos.getClass().getSimpleName());
		

	}

}
