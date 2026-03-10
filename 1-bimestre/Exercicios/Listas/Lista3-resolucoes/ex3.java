import java.util.Scanner;
public class ex3 {
    public static void main (String[] args){
        try(Scanner sc = new Scanner (System.in)){
        
            System.out.println("Digite o primeiro numero!");
            Integer num1 = sc.nextInt();
            System.out.println("Digite o segundo numero!");
            Integer num2 = sc.nextInt();
            System.out.println("Digite o terceiro numero!");
            Integer num3 = sc.nextInt();

            int maior = num1;
            if (num2 > maior) {
                maior = num2;
            }
            if (num3 > maior) {
                maior = num3;
            }
            System.out.printf("O maior numero é: %d\n", maior);

        }
    }
}
