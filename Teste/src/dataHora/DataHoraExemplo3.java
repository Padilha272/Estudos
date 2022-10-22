package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataHoraExemplo3 {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-10-19");
		LocalDateTime d05 = LocalDateTime.parse("2022-10-19T01:30:26");
		Instant d06 = Instant.parse("2022-10-19T01:30:26Z");

		
		LocalDateTime r1 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("r1 = "+r1);
		System.out.println("r2 = "+r2);
		System.out.println("d04 dia = "+d04.getDayOfWeek());
		
		/*for(String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}*/
	}

}
