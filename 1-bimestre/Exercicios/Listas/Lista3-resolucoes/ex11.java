import java.util.Scanner;
public class ex11 {
    public static void main (String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int resultado=0;

            System.out.println("Digite o primeiro número: ");
            int a=sc.nextInt();
            System.out.println("Digite o segundo número: ");
            int b=sc.nextInt();
            System.out.println("Digite um operador (+, -, * ou / ");
            char op=sc.next().charAt(0);

            switch(op){
                case '+': resultado = a+b;
                    break;
                case '-': resultado = a-b;
                    break;
                case '*': resultado = a*b;
                    break;
                case '/': resultado = a/b;
                    break;
                default: System.out.println("Digite um operador válido.");
            }
            System.out.println("O resultado da operação entre "+ a +" e " + b+" é: " +resultado );
        }
    }
}