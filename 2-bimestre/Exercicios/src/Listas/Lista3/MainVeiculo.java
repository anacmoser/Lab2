package Listas.Lista3;

class Veiculo{
    public String marca;
    public String modelo;

    public Veiculo(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }
    public Boolean ligar(Boolean ligado){
        return ligado=true;
    }
    public Boolean desligar(Boolean ligado){
        return ligado=false;
    }
    @Override
    public String toString(){
        return "Marca =" + marca + ", Modelo =" + modelo;
    }
    @Override
    public boolean equals(Object objeto){
        if(getClass()!=objeto.getClass()){
            return false;
        }
        Veiculo veiculo = (Veiculo) objeto;
        return marca.equals(veiculo.marca) && modelo.equals(veiculo.modelo);
    }
}

class Carro extends Veiculo{
    public int quantidadePortas;
    public Carro(String marca, String modelo, int quantidadePortas){
        super(marca, modelo);
        this.quantidadePortas=quantidadePortas;
    }
}

class Moto extends Veiculo{
    public int cilindradas;
    public  Moto(String marca, String modelo, int cilindradas){
        super(marca, modelo);
        this.cilindradas=cilindradas;
    }
}
public class MainVeiculo{
    public static void main (String[] args){
        Carro c = new Carro("hyundai", "toyota", 4);
        Carro c2 = new Carro("hyundai", "toyota", 4);
        Moto m = new Moto("hyundai", "toyota", 50);
        System.out.println(c);
        System.out.println(c2);
        System.out.println(m);
        System.out.println(c.equals(c2));
        System.out.println(c.equals(m));
    }
}
