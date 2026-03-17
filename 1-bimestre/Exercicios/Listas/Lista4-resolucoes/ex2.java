import java.time.LocalDate;
import java.util.Scanner;

public class ex2 {
    public static void main (String[] args){
        try(Scanner sc = new Scanner (System.in)){
            System.out.println("Digite uma data (AAAA-DD-MM): ");
            String scanner = sc.nextLine();

            LocalDate scannerData = LocalDate.parse(scanner);

            if(scannerData.isLeapYear()){
                System.out.println("O ano é bissexto!");
            }else{
                System.out.println("O ano não é bissexto!");
            }
        }
    }
}
