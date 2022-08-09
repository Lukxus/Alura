
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1270;
		int valor = (int)salario;
		System.out.println("valor= "+valor);
		
//		String letra = "a";
//		int numero = (int)salario;
//		System.out.println("valor= "+valor);
		
		long valorteste = 2000000000;
		System.out.println(valorteste);
		long valorteste2 = 2000000000000L;
		System.out.println(valorteste2);
		
		short valorpequeno = 2131;//16bits -1
		byte b= 127;
		
		double num1= 0.1;
		double num2= 0.2;
		System.out.println(num1+num2);
		
		float pontoFlutuante = 3.14f;
		float pontoFlutuante2 = (float)3.14;
	}

}
