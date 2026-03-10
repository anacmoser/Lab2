import java.util.Scanner;
public class ex2 {
    public static void main (String[] args){
        try(Scanner sc = new Scanner (System.in)){
            System.out.println("Digite um ano: ");
            Integer ano = sc.nextInt();

            if(ano%4==0 && ano%100!=0 || ano%400==0){
                System.out.println("é um ano bissexto!");
            }
            else{
                System.out.println("Não é um ano bissexto!");
            }
        }    
    }
}
