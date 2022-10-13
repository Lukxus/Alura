
public class TesteSaca {
	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123 , 321);
		
		c.deposita(200);
		try {
			c.saca(210);
		}catch(SaldoInsuficienteException ex) {
			System.out.println("EX:"+ex.getMessage());
		}
		System.out.println(c.getSaldo());
	}
}
