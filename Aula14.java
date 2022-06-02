import java.util.Scanner;

public class Aula14 {

    public static void main(String[] args) {
        // Faça um programa para ler 2 valores informados pelo usuário e se o segundo
        // valor informado for ZERO, deve ser lido um novo valor, ou seja, para o
        // segundo valor não pode ser aceito o valor zero nem negativo e imprimir o
        // resultado da divisão do primeiro valor lido pelo segundo valor lido.

        Scanner valor = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int num1 = valor.nextInt();

        System.out.println("Informe um valor: ");
        int num2 = valor.nextInt();

        if (num2 <= 0) {
            System.out.println("Informe um valor diferente de 0");

        } else {
            int divisao = num1 / num2;
            System.out.println("A divisão é " + divisao);
        }

        valor.close();
    }
}
