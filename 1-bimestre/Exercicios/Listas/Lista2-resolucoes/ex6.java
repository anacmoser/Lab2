public class ex6{
    public static void main (String args[]){
        Object obj = 10;

        if (obj instanceof Integer inteiro){
            System.out.println("é um inteiro!");
            int obj2 = Integer.valueOf(inteiro);
            if (obj2 > 50){
                System.out.println("O valor é maior que 50");
            }
            else{
                System.out.println("O valor é menor ou igual a 50");
            }
          
        }
        else{
            System.out.println("O objeto não é do tipo inteiro!");
        }
    }
}