import java.util.Scanner;

public class Aula12 {
    public static void main(String[] args) {
        // Faça um programa para ler 3 valores (considere que não serão informados
        // valores iguais) e escrever o maior deles.

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um valor");
        int num1 = ler.nextInt();

        System.out.println("Informe um valor");
        int num2 = ler.nextInt();

        System.out.println("Informe um valor");
        int num3 = ler.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.print("O primeiro valor e maior");
        }

        else if (num2 > num1 && num2 > num3) {
            System.out.print("O segundo numero e o maior");
        }
        else if (num1 == num2 && num1 == num3 && num2 == num3) {
            System.out.println("Os numeros sao iguais");
        }

        else {
            System.out.print("O terceiro valor e o maior");
        }

        ler.close();

    }
}