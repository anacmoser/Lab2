import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class ex5 {
    public static void main (String[] args){
        LocalDateTime dataHora = LocalDateTime.now();
        LocalDateTime dataHora2 = dataHora.plusMonths(2);

        long horas =  ChronoUnit.HOURS.between(dataHora, dataHora2);

        System.out.println("A quantidade de horas que existem entre as datas é: " +horas);
    }
}
