import java.time.LocalDate;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
import java.time.Period;
public class ex4{
    public static void main (String[] args){
        try(Scanner sc = new Scanner (System.in)){
            System.out.println("Digite sua data de nascimento (AAAA-DD-MM): ");
            String scannerData = sc.nextLine();
            LocalDate dataNascimento = LocalDate.parse(scannerData);
            LocalDate dataAtual = LocalDate.now();
            Period idade = Period.between(dataNascimento, dataAtual);
            LocalDate dataAniversario = dataNascimento.plusYears(idade.getYears());
            long dias = ChronoUnit.DAYS.between(dataAniversario, dataAtual);
            System.out.println("Faltam " + dias+ " dias para o próximo aniversário");
        }
    }
}