public class ex9 {
    public static void main (String[] args){
        Object obj = "true";

        if (obj instanceof String var){
            Boolean ativo = Boolean.parseBoolean(var);
            
            if (ativo == true){
                System.out.println("Usuário ativo!");
            }
            else{
                System.out.println("Usuário inativo!");
            }
           
        }
        else {
            System.out.println("Entrada inválida!");
        }
    }
}
