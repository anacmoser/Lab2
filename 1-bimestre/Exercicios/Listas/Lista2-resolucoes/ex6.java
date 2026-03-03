public class ex6{
    public static void main (String args[]){
        Object obj = 10;

        if (obj instanceof Integer inteiro){
            System.out.println("é um inteiro!");
            int obj2 = Integer.valueOf(inteiro);
          
        }
        else{
            System.out.println("O objeto não é do tipo inteiro!");
        }
    }
}