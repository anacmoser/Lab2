public class ex1{
    public static void main (String[] args){
        String numeroString = "101";
        int numeroInt = Integer.parseInt(numeroString);

        if(numeroInt%2 == 0){
            System.out.println("é par!");
        }
        else{
            System.out.println("é ímpar!");
        }
    }
}