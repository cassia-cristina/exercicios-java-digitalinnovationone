import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ExercicioFinalCalendar {
  public static void main(String[] args) throws ParseException {
    Scanner scan = new Scanner(System.in);
    System.out.println("Informe uma data:");
    String entrada = scan.next();

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    Date data = format.parse(entrada);
    Calendar dataCalendar = Calendar.getInstance();
    dataCalendar.setTime(data);

    System.out.println("Data inicial: " + format.format(dataCalendar.getTime()));

    for (int i = 1; i <= 10; i++) {
      if (dataCalendar.get(Calendar.DAY_OF_WEEK) == 1) {
        dataCalendar.add(Calendar.DATE, 1);
      } else if (dataCalendar.get(Calendar.DAY_OF_WEEK) == 7) {
        dataCalendar.add(Calendar.DATE, 2);
      }
      dataCalendar.add(Calendar.DATE, 1);
    }

    System.out.print("Prazo de 10 dias úteis para vencimento. ");
    System.out.print("Nova data: " + format.format(dataCalendar.getTime()));
  }
}
