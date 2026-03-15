import java.util.Scanner;
public class ex12 {
    public static void main (String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Escolha um idioma\n 1 - Português\n 2 - Inglês\n 3 - Espanhol");
            int idioma = sc.nextInt();

            switch(idioma){
                case 1: System.out.println("Olá mundo!");
                    break;
                case 2: System.out.println("Hello world!");
                    break;
                case 3: System.out.println("Hola mundo!");
                    break;
                default: System.out.println("Digite uma entrada válida.");
            }
        }
    }
}