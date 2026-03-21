import java.util.Scanner;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


public class ex9 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Digite o horário de início do evento (HH:MM): ");
            LocalTime horaInicio = LocalTime.parse(sc.nextLine());

            System.out.println("Digite o horário de término do evento (HH:MM): ");
            LocalTime horaFim = LocalTime.parse(sc.nextLine());

            long duracaoMinutos = ChronoUnit.MINUTES.between(horaInicio, horaFim);

            if(duracaoMinutos<0){
                duracaoMinutos+=24*60;
            }

            double duracaoHoras = duracaoMinutos/60.0;

            System.out.printf("Duração em horas: %.2f horas\n", duracaoHoras);
            System.out.println("E em minutos foi de: "+duracaoMinutos+" minutos");
        }
    }
}
