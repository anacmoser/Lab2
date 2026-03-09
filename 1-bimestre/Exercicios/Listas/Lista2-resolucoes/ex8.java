public class ex8 {
    public static void main (String[] args){
        Object obj = 50;
        Object obj2 = 30;

        if (obj instanceof Integer int1 && obj2 instanceof Integer int2){
            System.out.println("Valores inteiros!");

            if (int1.compareTo(int2)==0){
                System.out.println("Valores iguais!");
            }
            else if (int1.compareTo(int2)>0){
                System.out.println("O primeiro número é maior");
            }
            else{
                System.out.println("O segundo número é maior");
            }
        }

        else{
            System.out.println("Um ou mais valores não são inteiros.");
        }
    }
}
