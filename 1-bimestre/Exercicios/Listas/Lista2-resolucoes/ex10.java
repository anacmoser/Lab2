public class ex10 {
   public static void main (String[] args) {
        Object obj = 208.9;
        
        if (obj instanceof Integer inteiro){
            if (inteiro>=100) {
                System.out.println("Número inteiro maior ou igual a 100");
            }
            else{
                System.out.println("Número inteiro menor que 100");

            }
        }
        else if (obj instanceof Double flutuante){
            if (flutuante>=100) {
                System.out.println("Número Double maior ou igual a 100.0");
            }
            else{
                System.out.println("Número Double menor que 100.0");

            }
        }

        else if (obj instanceof Boolean booleano){
            if (booleano == true) {
                System.out.println("Valor booleano igual a true");
            }
            else{
                System.out.println("Valor booleano igual a false");

            }
        }
        else{
            System.out.println("Tipo não suportado!");
        }
   }
}
