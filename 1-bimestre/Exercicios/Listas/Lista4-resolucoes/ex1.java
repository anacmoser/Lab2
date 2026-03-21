import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;
public class ex1{
    public static void main (String[] args){
        try(Scanner sc = new Scanner (System.in)){
            System.out.println("Digite sua data de nascimento (AAAA-MM-DD): ");
            String scannerData = sc.nextLine();
            LocalDate dataAtual = LocalDate.now();
            LocalDate dataNascimento = LocalDate.parse(scannerData);
            Period idade = Period.between(dataNascimento, dataAtual);// periodo entre data de nascimento e data atual
            System.out.println("Idade: " + idade.getYears());

        }
    }
}