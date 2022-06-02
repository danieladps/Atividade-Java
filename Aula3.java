import java.util.Scanner;

public class Aula3{
    //Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

 public static void main(String[] args) {
  Scanner ler= new Scanner(System.in);
   
   System.out.print("Informe seu nome");
   String  nome =(ler.nextLine());

   System.out.println("Informe sua idade");
   int ano = ler.nextInt();

   System.out.println("Olá, " + nome + ", sua idade é "+ ano);
 
   ler.close(); 
  }
 }
    