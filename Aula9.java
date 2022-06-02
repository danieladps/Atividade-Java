import java.util.Scanner;
 public class Aula9{
     public static void main(String[] args) {
         //area do triangulo
         Scanner valor = new Scanner(System.in); 
         
         System.out.println("Informe o valor da base: ");
         Double base=(valor.nextDouble());

         System.out.println("Informe a altura: ");
         Double altura =(valor.nextDouble());

         Double area = (base*altura)/2;

         System.out.println("A área do triangulo é: " + area);

         valor.close();
     } 
    
}
