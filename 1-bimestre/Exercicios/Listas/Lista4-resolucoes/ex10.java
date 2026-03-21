import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ex10 {
    public static void main (String[] args){
        try(Scanner sc = new Scanner (System.in)){
            System.out.println("Digite uma data (AAAA-MM-DD)");
            LocalDate dataScanner = LocalDate.parse(sc.nextLine());
            
            LocalDate hoje = LocalDate.now();
            System.out.println("Hoje é "+hoje);
            long periodo = ChronoUnit.DAYS.between(hoje, dataScanner);
            String resultado = (periodo > 0) ? "futuro" : (periodo == 0) ? "presente" : "passado";

           System.out.println("A data de entrada corresponde ao " + resultado);
        }
    }
}
