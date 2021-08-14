public class Tipos {

  public static void main(String[] args) {
    byte a = -128;
    final var condicao = false;

    //auto-boxing
    Byte b = null;
    Integer c = 1024;
    Boolean tipB = Boolean.getBoolean("false");
    Character abc = 'D';

    //unboxing
    int d = Integer.valueOf(55);

    Number num = Integer.valueOf(1000);

    num.toString();

    System.out.println(num);

    //inferência de tipo
    var numero = 5 + 12;
    System.out.println(numero);

    var texto = "Tipo por inferência - String";
    System.out.println(texto);

    //var String = new String("test");

    System.out.println();

    var ternario = condicao ? "A condição é verdadeira" : "A condição é falsa";
    System.out.println(ternario);

  }


}
