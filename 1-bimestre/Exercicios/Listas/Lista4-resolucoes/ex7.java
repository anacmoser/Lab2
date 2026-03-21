import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ex7 {
    public static void main (String[] args){
        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje e dia " + hoje.getDayOfMonth() +" do "+ hoje.getMonthValue());

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("EEEE", new Locale("pt", "BR"));


        for (int i=1; i<=7; i++){
            LocalDate dia = hoje.plusDays(i);
            System.out.println(dia.format(formatador) +" "+ dia.getDayOfMonth() );
        }
    }
}
