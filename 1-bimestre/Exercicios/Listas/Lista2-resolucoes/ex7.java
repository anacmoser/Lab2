public class ex7 {
    public static void main(String[] args) {
        Object obj = -10.5;

        if (obj instanceof Double flutuante){
            double valorprimitivo = flutuante.doubleValue();
            System.out.printf("Valor double: %.2f\n", valorprimitivo);

            if (valorprimitivo>=0) {
                System.out.println("Número positivo!");
            }
            else{
                System.out.println("É negativo!");
            }
        }
        else{
            System.out.println("O valor não é double!");
        }
    }
}
