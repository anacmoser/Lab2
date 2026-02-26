import java.util.Scanner;

public class ex20 {
    static public void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para calcularmos o dobro!");

        int numero = sc.nextInt();

        int dobro = numero * 2;

        System.out.printf("O dobro de %d", numero);
        System.out.printf(" é: %d", dobro);
    }
}


//comando para compilar: javac nome-do-arquivo.java
//comando para executar: java nome-da-classe (SEM .java)