public class ex4{
    public static void main (String[] args){
        String num1 = "98.8";
        double num2 = Double.parseDouble(num1);

        if (num2<=100) {
            System.out.println("Menor que 100!");
        }

        else{
            System.out.println("Maior que 100!");
        }
   
    }
}