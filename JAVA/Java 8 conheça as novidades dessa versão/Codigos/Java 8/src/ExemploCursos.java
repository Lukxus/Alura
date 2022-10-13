import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
 *A classe Optional nos oferece uma variedade imensa 
 *de novos métodos que nos permite trabalhar de forma 
 *funcional com nossos valores, tirando maior proveito 
 *dos novos recursos de default methods, lambdas e method reference. 
 */

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome() + ", quantidade de alunos: " + this.getAlunos() + ", memoria: "
				+ super.toString();
	}
}

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		// Equivalentes
		cursos.sort(Comparator.comparing(Curso::getAlunos));

		cursos.forEach(System.out::println);
		// Assim naõ posso especificar o que eu quero imprimir do objeto ; Vai usar o
		// toString da classe

		cursos.forEach(c -> System.out.println(c.getNome()));

		System.out.println("----------------------------------------");

		cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(System.out::println);

		System.out.println("----------------------------------------");

		cursos.stream().filter(c -> c.getAlunos() >= 100).map(c -> c.getAlunos()).forEach(System.out::println);

		System.out.println("----------------------------------------");

		Stream<Curso> dados1 = cursos.stream().filter(c -> c.getAlunos() >= 100);
		System.out.println(dados1);
		Stream<Integer> dados2 = cursos.stream().filter(c -> c.getAlunos() >= 100).map(c -> c.getAlunos());
		System.out.println(dados2);
		dados2.forEach(c -> System.out.println("Iterando sobre o mapToInt: "+c));
		//System.out.println(cursos.stream().filter(c -> c.getAlunos() >= 100).map(c -> c.getAlunos()).getClass().getSimpleName());
		
		int sum = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(c -> c.getAlunos()).sum();
		System.out.println(sum);
		
		System.out.println("----------------------------------------");
		
		Optional<Curso> optionalCurso = cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.findAny();
			
		Curso curso = optionalCurso.orElse(null);
 		System.out.println(curso);
 		
 		optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
 		
 		System.out.println("----------------------------------------");
 		
 		 OptionalDouble media = cursos.stream()
 			.filter(c -> c.getAlunos() >= 100)
 			.mapToInt(c -> c.getAlunos())
 			.average();
 		 
 		 System.out.println(media);
 		 
 		 System.out.println("----------------------------------------");
 		
		 List<Curso> resultado = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toList());

		System.out.println(resultado);

		System.out.println("----------------------------------------");
	 		
		Map<String, Integer> mapa = cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
		 
		System.out.println(mapa);
		
		System.out.println("----------------------------------------");
 		
		cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
			.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
		
		System.out.println("----------------------------------------");
 		
		cursos.parallelStream()
			.filter(c -> c.getAlunos() > 100)
			.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
			.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
 		

	}

}
