import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateTimeApp {

	public static void main(String[] args) {
		System.out.println("Process Date/Time values");
		// generate a current date
		LocalDate ld1 = LocalDate.now();
		System.out.println(ld1);

		// generate a current time
		LocalTime lt1 = LocalTime.now();
		System.out.println(lt1);
		
		// generate a current datetime
		LocalDateTime ldt1 = LocalDateTime.now();
		System.out.println(ldt1);
		
		// ld1 = now
		LocalDate christmas2020 = LocalDate.of(2020, 12, 25);
		
		if (ld1.isBefore(christmas2020)) {
			System.out.println("its not Christmas yet!");
			int daysUntil = (int)ld1.until(christmas2020, ChronoUnit.DAYS);
			System.out.println(daysUntil+" days until next Christmas");
		}
		else {
			System.out.println("Missed Christmas 2020");
		}
		
		System.out.println("Format todays date");
		System.out.println(ldt1);
		DateTimeFormatter df1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println("short: "+df1.format(ldt1));
		
		
		
		
		
		System.out.println("Bye");
	}

}
