public class ex2{
    public static void main (String[] args){
        Integer obj1 = 95;
        Integer obj2 = 95;


        if (obj1.compareTo(obj2)>0){
            System.out.println("O primeiro número é maior");
        }
        else if (obj1.compareTo(obj2) < 0){
            System.out.println("O segundo número é maior");
        }
        else{
            System.out.println("Os números são iguais!");
        }
    }
}