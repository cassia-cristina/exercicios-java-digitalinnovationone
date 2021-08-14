import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsandoDateFormat {
  public static void main(String[] args) {

    Date agora = new Date();

    String data = DateFormat.getDateInstance().format(agora);
    System.out.println(data);

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    String dataFormatada = format.format(agora);
    System.out.println(dataFormatada);

  }
}
