import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
    //Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".

    System.out.println("Informe seu nome");
    Scanner ler= new Scanner(System.in);
    String nome=(ler.nextLine());
  

    System.out.println("Olá, " + nome);
    
    ler.close(); 
    }
}