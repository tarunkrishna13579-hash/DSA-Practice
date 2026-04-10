package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime Time=LocalTime.now();
		System.out.println(Time);
		
		LocalDateTime DateTime=LocalDateTime.now();
		System.out.println(DateTime);
		
		
		//CUSTOM FORMAT:
		
		DateTimeFormatter formater=DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
				String NewDateTime=DateTime.format(formater);
				System.out.println(NewDateTime);

	}

}
