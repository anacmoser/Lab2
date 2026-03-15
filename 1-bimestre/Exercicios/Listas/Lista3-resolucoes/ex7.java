import java.util.Scanner;
public class ex7 {
    public static void main (String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int numeroSorteado = (int)(Math.random()*100)+1; //num inteiro entre 1 e 100
            int numUsuario=0;
            System.out.println(numeroSorteado);
            while(numUsuario!=numeroSorteado){
                System.out.println("Tente adivinhar o número secreto: ");
                numUsuario=sc.nextInt();
                int diferenca=numUsuario-numeroSorteado;
                if(diferenca<0){
                    System.out.println("O número sorteado é maior!");
                }else if(numUsuario==numeroSorteado){
                    System.out.println("Acertou!!");
                }
                else{
                    System.out.println("O número sorteado é menor!");
                }
            }

        }
    }
}