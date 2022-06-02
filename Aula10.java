import java.util.Scanner;

public class Aula10{
  public static void main(String[] args) {
      //area do circulo
      Scanner valor = new Scanner (System.in); 

      Double pi = 3.14;
      
      System.out.println("Informe o valor do raio");
      Double raio =(valor.nextDouble());

      Double area= pi*(raio*raio);

      System.out.println("A área do circulo é " + area);
      valor.close();
  }
}