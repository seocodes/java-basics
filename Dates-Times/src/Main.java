import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

//        LocalTime time = LocalTime.now();
//        LocalDate date = LocalDate.now();

        //LocalDateTime unites LocalTime and LocalDate
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);

        Instant instant = Instant.now();  //UTC time

        LocalDateTime date1 = LocalDateTime.of(2024,12,25,12,0,0);
        LocalDateTime date2 = LocalDateTime.of(2025,1,1,0,0,0);


        System.out.println(dateTime);
        System.out.println(newDateTime);

        System.out.println(instant);

        if(date1.isBefore(date2)){
            System.out.println(date1+" is earlier than "+ date2);
        }
        else if(date1.isAfter(date2)){
            System.out.println(date1+" is after "+date2);
        }
        else if (date1.isEqual(date2)) {
            System.out.println("Equal");
        }
    }
}