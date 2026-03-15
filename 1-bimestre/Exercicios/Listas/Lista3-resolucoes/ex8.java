import java.util.Scanner;
public class ex8 {
    public static void main (String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int numeros[] = new int [100];
            int num;
            int i =0;
            int maior = Integer.MIN_VALUE; //menor valor possível

            do{
                System.out.println("Digite números: ");
                num=sc.nextInt();
                if(num!=0){
                    numeros[i] = num;
                    i++;
                }
            }while(num!=0 && i<=100);
            for (int x:numeros){
                if(x>maior){
                    maior=x;
                }
            }
            System.out.println("O maior número digitado foi: " + maior);
        }
    }
}