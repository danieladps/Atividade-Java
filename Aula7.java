import java.util.Scanner;
public class Aula7 {
    public static void main(String[] args) {
        // area do trapezio
        Scanner ladoUm = new Scanner (System.in);
        
        System.out.print("Informe um valor:");
        Double baseMaior=(ladoUm.nextDouble());

        System.out.print("Informe mais um valor:");
        Double baseMenor=(ladoUm.nextDouble());

        System.out.print("Informe a altura:");
        Double altura=(ladoUm.nextDouble());

        Double area = (baseMaior+baseMenor)*altura/2;
        System.out.println("O valor da do trapézio é: " + area);
        
        ladoUm.close();
    }
}
