import java.time.LocalDate;

public class Programa {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        hoje.plusDays(10);
        System.out.println("Data daqui a 10 dias: " + hoje);
    }
}