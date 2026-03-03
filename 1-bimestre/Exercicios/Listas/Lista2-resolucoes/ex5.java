public class ex5{
    public static void main (String[] args){
        String valor = "false";

        boolean valor1 = Boolean.parseBoolean(valor);

        if (valor1==true){
            System.out.println("Acesso permitido!");
        }
        else{
            System.out.println("Acesso negado!");
        }
    }
}