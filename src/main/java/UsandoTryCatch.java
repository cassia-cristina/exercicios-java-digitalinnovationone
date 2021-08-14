import java.util.InputMismatchException;
import java.util.Scanner;

public class UsandoTryCatch {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    try {
      System.out.println("Informe um número:");
      int entrada = scan.nextInt();
      System.out.println("Entrada é válida: " + entrada);
    } catch (InputMismatchException e) {
      System.out.println("Entrada inválida");
      //e.printStackTrace();
    }

  }
}
