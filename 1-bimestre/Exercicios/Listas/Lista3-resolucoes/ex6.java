import java.util.Scanner;
public class ex6 {
    public static void main (String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int [] numeros = new int [100];
            int num = 0;
            int i = 0;

            while(num>=0 && i<=100){
                System.out.println("Digite números. Negativo para parar,");
                num = sc.nextInt();
                if (num>=0){
                    numeros[i]=num;
                    i++;
                }
            }

            System.out.println("Quantidade de números positivos digitados: "+ i);
        }
    }
}