import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class ex3 {
    public static void main (String[] args){
            LocalDate dataAtual = LocalDate.now();
            LocalDate dataFinal = LocalDate.parse("2026-12-31");

            long periodo = ChronoUnit.DAYS.between(dataAtual, dataFinal);

            System.out.println("Faltam "+periodo +" dias para o final do ano");
    }
}