import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UsandoLocalDateTime {
  public static void main(String[] args) {

    LocalDateTime dataHora = LocalDateTime.parse("2010-05-15 10:00:00",
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    System.out.println(dataHora);

    LocalDateTime dataAlterada = dataHora.plusYears(4).plusMonths(6).plusHours(13);
    System.out.println(dataAlterada);


  }

}
