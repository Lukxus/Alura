import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/*
 * É um default method! Um método de interface que você não 
 * precisa implementar na sua classe se não quiser, pois você 
 * terá já essa implementação default. Repare que ele simplesmente 
 * delega a invocação para o bom e velho Collections.sort, 
 * mas veremos que outros métodos fazem muito mais.
 */

/*
 *Lambdas sao interfaces funcionais 
 *Interfaces funcionais so podem ter 1 metodo abstrato 
 *Lambdas vieram para substituir as classes anonimas
 */

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

//		Collections.sort(palavras);
//		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
//		palavras.sort(comparador);
		
//-------------------------------------------------				
		
//		palavras.sort(new ComparadorDeStringPorTamanho());
		
//-------------------------------------------------		
		
//		palavras.sort(new Comparator<String>(){
//			@Override
//			public int compare(String s1, String s2) {
//				if (s1.length() < s2.length())
//					return -1;
//				if (s1.length() > s2.length())
//					return 1;
//				return 0;
//			}
//		});
		
//-------------------------------------------------	
		
//		palavras.sort((s1,  s2) -> {
//				if (s1.length() < s2.length())
//					return -1;
//				if (s1.length() > s2.length())
//					return 1;
//				return 0;
//			});
		
//-------------------------------------------------	
		
//		palavras.sort((s1,  s2) -> 
//			Integer.compare(s1.length(), s2.length())
//		);

//-------------------------------------------------	

		
		
		//Comparator<String> comparador = Comparator.comparing(s -> s.length());
		//palavras.sort(comparador);
		
		//Equivalente a 
		
		//Function<String, Integer> funcao = s -> s.length();
		//Comparator<String> comparador = Comparator.comparing(funcao);
		//palavras.sort(comparador)
		
		//Equivalente a
		
		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		//Equivalente a
		
		palavras.sort(Comparator.comparing(String::length));
	
		System.out.println(palavras);

		
		for (String string : palavras) {
			System.out.println(string);
		}

		System.out.println("\n----------------\n");

//		Consumer<String> consumidor = new Consumer<String>() {//classe anonima
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		};
//		palavras.forEach(consumidor);

//-------------------------------------------------		

//		palavras.forEach(new Consumer<String>() {//classe anonima
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		});

//-------------------------------------------------				

		palavras.forEach(s -> System.out.println(s));
	}
}

//class ImprimeNaLinha implements Consumer<String>{
//	@Override
//	public void accept(String s) {
//		System.out.println(s);
//	}
//}

//class ComparadorDeStringPorTamanho implements Comparator<String> {
//
//	@Override
//	public int compare(String s1, String s2) {
//		if (s1.length() < s2.length())
//			return -1;
//		if (s1.length() > s2.length())
//			return 1;
//		return 0;
//	}
//}
