public class ex2{
    public static void main (String[] args){
        Integer obj1 = 95;
        Integer obj2 = 95;

        int teste = obj1.compareTo(obj2);

        if (teste > 0){
            System.out.println("O primeiro número é maior");
        }
        else if (teste < 0){
            System.out.println("O segundo número é maior");
        }
        else{
            System.out.println("Os números são iguais!");
        }
    }
}