    public class Instanceof{
        public static void main (String args[]){
            Object obj = 20;

            if (obj instanceof Boolean){
                System.out.println("é um boolean!");
            }
            else if (obj instanceof Integer){
                System.out.println("é um Inteiro!");
            }
            else if (obj instanceof Double){
                System.out.println("é um double!");
            }
            else{
                System.out.println("é uma string!"); //existem outros tipos além desses 3 então isso pode dar errado, mas é um código básico de exemplo
            }
        }
    }