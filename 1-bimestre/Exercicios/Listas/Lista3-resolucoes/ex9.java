import java.util.Scanner;
public class ex9 {
    public static void main (String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            int digitos=0;
            if (num==0){
                digitos=1;
            }
            while(num!=0){
                digitos++;
                num/=10;
            }
            System.out.println("O número possui " + digitos+ " digito(s)");
        }
    }
}