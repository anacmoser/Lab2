import java.util.Scanner;
public class ex5 {
    public static void main (String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int [] numeros = new int[100]; // lista de ate 100 numeros;
            int contador = 0;

            int num;

            do{
                System.out.println("Digite um número. 0 para parar.");
                num = sc.nextInt();
                
                if(num!=0 && contador<=100){
                    numeros[contador]=num;
                    contador ++;
                }

            }while(num != 0 && contador<=100);
            int soma = 0;
            for (int i=0; i<contador; i++){
                soma+=numeros[i];
            }

            System.out.println("Números digitados: ");
            for (int i=0; i<contador; i++){
                System.out.print(numeros[i]+", ");
            }
            System.out.println("\nSoma total: " + soma);
        }
    }
}