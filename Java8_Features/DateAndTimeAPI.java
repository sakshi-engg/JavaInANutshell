package Java8_Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeAPI {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(dtf);
    }
}
