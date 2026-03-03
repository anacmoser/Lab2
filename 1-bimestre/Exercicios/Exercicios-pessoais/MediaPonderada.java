import java.util.Scanner;

public class MediaPonderada {
    static public void main (String [] args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Digite a nota 1: ");
            double nota1 = sc.nextDouble();

            System.out.println("Digite o peso da nota 1: ");
            int peso1 = sc.nextInt();

            System.out.println("Digite a nota 2: ");
            double nota2 = sc.nextDouble();

            System.out.println("Digite o peso da nota 2:");
            int peso2 = sc.nextInt();

            double media = ((nota1*peso1)+(nota2*peso2))/10;

            System.out.printf("A média ponderada é: %.2f", media);
        }
    }
}
