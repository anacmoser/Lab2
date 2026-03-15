import java.util.Scanner;
public class ex4 {
    public static void main (String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Digite uma letra do alfabeto: ");
            char letra = sc.next().charAt(0);

            if(!Character.isLetter(letra)){
                System.out.println("Erro: Digite uma letra.");
            }
            else{
                char letrauniv = Character.toLowerCase(letra);

                if (letrauniv=='a'||letrauniv=='e'||letrauniv=='i'||letrauniv=='o'||letrauniv=='u'){
                    System.out.println("É uma vogal!");
                }
                else{
                    System.out.println("É uma consoante!");
                }
            }
        }
    }
}
