import java.util.Scanner;

public class CalculadoradeNotas{
    static public void main (String[] args){
        try(Scanner sc = new Scanner (System.in)){
            System.out.println("Digite a nota 1:");

            double nota1 = sc.nextDouble();

            System.out.println("Digite a nota 2\n");

            double nota2 = sc.nextDouble();

            double media = (nota1+nota2)/2;

            System.out.printf("A media simples é: %.2f", media);
        }
    }
}