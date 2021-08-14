import java.util.Calendar;

public class UtilizandoCalendar {
  public static void main(String[] args) {

    Calendar data = Calendar.getInstance();
    System.out.println("Data atual: " + data.getTime());

    data.add(Calendar.DATE, -10);
    System.out.println("10 dias atrás: " + data.getTime());

    data.add(Calendar.MONTH, 3);
    System.out.println("3 meses depois: " + data.getTime());

    data.add(Calendar.YEAR, 2);
    System.out.println("2 anos depois: " +  data.getTime());

    Calendar dataAtual = Calendar.getInstance();
    System.out.printf("\nHora atual: " + "%tT", dataAtual);
    System.out.printf("\nData atual: " + "%tD", dataAtual);

  }

}
