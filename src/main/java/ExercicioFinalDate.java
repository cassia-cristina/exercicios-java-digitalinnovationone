import java.util.Date;

public class ExercicioFinalDate {

  public static void main(String[] args) {
    var dataNasc = new Date(629344800000L);
    System.out.println(dataNasc);

    var dataComparacao = new Date(1273892400000L);
    System.out.println(dataComparacao);

    boolean comparaDatas = dataNasc.before(dataComparacao);

    if (comparaDatas) {
      System.out.println("A data de nascimento é anterior a 15-05-2010");
    } else {
      System.out.println("A data de nascimento é posterior a 15-05-2010");
    }

  }

}

