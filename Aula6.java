import java.util.Scanner;
public class Aula6 {
    public  static void main(String[]args){
    //area do losangulo
    Scanner diagonal= new Scanner(System.in);

    System.out.print("Informe o valor da diagonal maior:");
    Double diagonalMaior=(diagonal.nextDouble());

    System.out.print("Informe o valor da  diagonal menor:");
    Double diagonalMenor=(diagonal.nextDouble());

    Double area = (diagonalMaior*diagonalMenor)/2;


    System.out.println("O valor da area é " + area );
    diagonal.close(); 

    } 
}
