import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class ex8 {
    public static void main (String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Digite a data do pedido (AAAA-MM-DD)");
            String scannerData = sc.nextLine();

            LocalDate dataPedido = LocalDate.parse(scannerData);

            int diasUteis=0;
            LocalDate dataAtual = dataPedido;

            while(diasUteis<15){
                dataAtual = dataAtual.plusDays(1);
                    if((dataAtual.getDayOfWeek()!=DayOfWeek.SATURDAY) && (dataAtual.getDayOfWeek()!=DayOfWeek.SUNDAY)){
                        diasUteis++;
                    } 
                
            }

            System.out.print("Data de entrega "+ dataAtual);

        }
    }
}
