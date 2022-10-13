import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	
	public static void main(String[] args) {
		
		//LocalDate é uma data especifica
		
		//LocalTime é um momento especifico
		
		LocalDate hoje = LocalDate.now();
		
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2022, Month.NOVEMBER, 6);
		
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasRio);
		
		System.out.println("Faltam " + periodo.getDays());
		
		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		
		System.out.println(proximasOlimpiadas);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatado = proximasOlimpiadas.format(formatador);
		
		System.out.println(valorFormatado);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		
		System.out.println(agora.format(formatadorComHoras));
		
		LocalTime intervalo = LocalTime.of(15, 30);
		
		System.out.println(intervalo);
		
		System.out.println(intervalo.getHour());
	}
}
