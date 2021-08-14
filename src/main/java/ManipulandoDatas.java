import java.util.Date;

public class ManipulandoDatas {

  public static void main(String[] args) {
    var data = new Date();
    System.out.println("Data usando o construtor padrão: " + data + "\n");

    var usandoLong = System.currentTimeMillis();
    System.out.println("Data 2: " + usandoLong);
    var data2 =  new Date(usandoLong);
    System.out.println("Data 2: " + data2 + "\n");

    var manipulandoLong = System.currentTimeMillis() - 10000;
    System.out.println("Data 3: " + manipulandoLong);
    var data3 = new Date(manipulandoLong);
    System.out.println("Data 3: " + data3 + "\n");

    //Comparando datas
    //Verifica se os objetos são iguais
    boolean comparacao1 = data2.after(data3);
    boolean comparacao2 = data.equals(data2);
    if (comparacao1) {
      System.out.println("Data 2 é maior que a Data 3");
    } else {
      System.out.println("Data 2 é menor que a Data 3");
    }

    if (comparacao2) {
      System.out.println("Data 1 é igual a Data 2");
    } else {
      System.out.println("Data 1 é diferente de Data 2");
    }

    var outraForma = new Date();
    System.out.println("\nOutra forma de buscar a data: " + outraForma.getTime());

  }


} 