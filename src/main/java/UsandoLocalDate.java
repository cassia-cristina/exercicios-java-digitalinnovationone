import java.time.LocalDate;

public class UsandoLocalDate {
  public static void main(String[] args) {
    LocalDate hoje = LocalDate.now();
    System.out.println(hoje);

    LocalDate ontem = hoje.minusDays(1);
    System.out.println(ontem);

    LocalDate diaSemana = LocalDate.now();
    System.out.println(diaSemana.getDayOfWeek());

  }
}
