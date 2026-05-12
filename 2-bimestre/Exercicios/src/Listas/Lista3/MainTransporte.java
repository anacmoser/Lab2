package Listas.Lista3;

class Transporte{
    public int capacidade;
    public int velocidadeMaxima;

    public Transporte(int capacidade, int velocidadeMaxima){
        this.capacidade=capacidade;
        this.velocidadeMaxima=velocidadeMaxima;
    }

    @Override
    public String toString(){
        return "Capacidade: " + capacidade + "Velocidade Máxima:" + velocidadeMaxima;
    }
    @Override
    public boolean equals(Object obj){
        if(getClass()!=obj.getClass()){
            return false;
        }
        Transporte t = (Transporte) obj;
        return capacidade==t.capacidade&&velocidadeMaxima==t.velocidadeMaxima;
    }
}

class Carro extends Transporte{
    public String tipoCombustivel;

    public Carro(int capacidade, int velocidadeMaxima, String tipoCombustivel){
        super(capacidade, velocidadeMaxima);
        this.tipoCombustivel=tipoCombustivel;
    }

    public void abastecer(){
        System.out.println("Abastecido com sucesso!");
    }
    @Override
    public String toString(){
        return "Carro! | "+"Capacidade: " + capacidade + "Velocidade Máxima:" + velocidadeMaxima + "Tipo de combustível" + tipoCombustivel;
    }

}

class Bicicleta extends Transporte{
    public String tipoBicicleta;

    public Bicicleta(int capacidade, int velocidadeMaxima, String tipoBicicleta){
        super(capacidade, velocidadeMaxima);
        this.tipoBicicleta=tipoBicicleta;
    }

    public void pedalar(){
        System.out.println("Pedalando!");
    }
    @Override
    public String toString(){
        return "Bicicleta! | "+"Capacidade: " + capacidade + "Velocidade Máxima:" + velocidadeMaxima + "Tipo de bicicleta: " + tipoBicicleta;
    }

}



public class MainTransporte {
    public static void main(String[] args){

    }
}
