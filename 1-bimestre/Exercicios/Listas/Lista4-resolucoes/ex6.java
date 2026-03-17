import java.time.LocalDate;
import java.time.DayOfWeek;

public class ex6 {
    public static void main (String[] args){
        LocalDate dia = LocalDate.of(2026, 03, 15);
        DayOfWeek diaSemana = dia.getDayOfWeek();

        switch(diaSemana){
            case SATURDAY: System.out.println("SÁBADO");
                break;
            case SUNDAY: System.out.println("DOMINGO");
                break;
            default: System.out.println("Outro dia.");
                break;
        }
    }
}
