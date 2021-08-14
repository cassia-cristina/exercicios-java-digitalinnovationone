public class ManipulandoStrings {

  public static void main(String[] args) {
    var minhaString = " Minha String ";
    final var nome = "Cassia";
    final var sobrenome = "Souza";

    //Char na posição
    System.out.println(minhaString.charAt(4));
    //Tamanho
    System.out.println(minhaString.length());
    //Tirando espaços no início e fim
    System.out.println("Sem trim [" + minhaString + "]");
    System.out.println("Com trim [" + minhaString.trim() + "]");

    System.out.println(minhaString.toUpperCase());
    System.out.println(minhaString.toLowerCase());

    System.out.println("Contém M? " + minhaString.contains("M"));
    System.out.println("Contém T? " + minhaString.contains("T"));

    System.out.println(minhaString.replace(" ", "-"));

    System.out.println("Usando equals: " + minhaString.equals("Minha string"));
    System.out.println("Usando equals: " + minhaString.equals(" Minha String "));

    System.out.println("EqualsIgnoreCase: " + minhaString.equalsIgnoreCase(" Minha sTring "));

    System.out.println(minhaString.substring(1, 6));

    System.out.println(minhaString.replaceAll("Minha", "Sua"));
    System.out.println(minhaString.replaceAll(minhaString.substring(0, 5), "*"));

    System.out.println(minhaString.concat(" TESTE "));
    //System.out.println(minhaString.toCharArray());

    // Quebrando uma string
    for (String quebra : minhaString.split(" ")) {
      System.out.println(quebra);
    }

    System.out.println();
    //Transformando a string em um array de char
    for (char viraChar : minhaString.toCharArray()) {
      System.out.println("Char: " + viraChar);
    }

    System.out.println();
    //Usando format:
    System.out.println(String.format("O seu nome é %s e seu sobrenome é %s", nome, sobrenome));
    //Buscando quatro casas após a vírgula de um número double
    System.out.println(String.format("Número: %.4f", 1.23456d));

    //Utilizando String Builder
    var builder = new StringBuilder(nome);
    System.out.println(builder.append("Cristina"));
    System.out.println(builder.insert(0, "*").insert(builder.length(), "*"));
    var reverse = builder.reverse();
    System.out.println(reverse);
    System.out.println(reverse.insert(0, "#").insert(reverse.length(), "#"));


  }


}
