import java.util.Scanner;

public class ex1 {
    public static void main (String[] args){
        try(Scanner sc = new Scanner (System.in)){
            System.out.println("Digite a sua nota: ");
            Double nota = sc.nextDouble();

            while (nota<0 || nota>10){
                System.out.println("Digite uma nota de 0 a 10");
                System.out.println("Digite a sua nota: ");
                nota = sc.nextDouble();
            } 
             if (nota<6){
                System.out.println("Aluno reprovado");
            }
            else{
                System.out.println("Aluno aprovado!");
            }
        }
    }
}
