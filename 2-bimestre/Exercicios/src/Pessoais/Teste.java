package Pessoais;

public class Teste {
    public static void main (String[] args){
        Carro c = new Carro("Hyundai", "GAY0I67");
        Carro c2;
        c2 = new Carro("BMW", "PUT9Y42");
        c2.setPlaca("V14D067");
        c.marca="Toyota";
        
        System.out.println("Carro 1: " + c.marca + " "+ c.getPlaca());

        System.out.println("Carro 2: " + c2.marca + " "+ c2.getPlaca());
    }
 
}
