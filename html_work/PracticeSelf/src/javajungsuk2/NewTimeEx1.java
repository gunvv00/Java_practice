package javajungsuk2;
import java.time.*;
import java.time.temporal.*;
public class NewTimeEx1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		
		now.withHour(10); //2020 2 3 12 4 5 .334
		now.with(ChronoField.HOUR_OF_DAY, 10L);
		now.truncatedTo(ChronoUnit.DAYS);
		
		LocalDate birthDate = LocalDate.of(1995, 05, 26);
		LocalTime birthtime = LocalTime.of(23,59,59);
		
		if(today.isAfter(birthDate)) {
			
		}
		
		if(today.compareTo(birthDate) > 0) {
			
		}

	}

}
