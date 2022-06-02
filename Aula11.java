import java.util.Scanner;

public class Aula11{
    public static void main(String[] args) {
        //Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.
        Scanner valor = new Scanner(System.in);

        System.out.println("informe um número: ");

        int numero = valor.nextInt();

        if (numero >= 0){
          System.out.println("numero positivo");
          
          if(numero ==0){
              System.out.println("numero 0");
          }
        }
        else{
            System.out.println("numero negativo");
        }
    
        valor.close();
    }
}
