package Pessoais;

public class Carro extends Veiculo{
    private Integer quantidadedePortas;
    
    public Carro(){
        super();//obrigatorio
        this.quantidadedePortas=0;
    }
    public Carro(String marca, String modelo, Integer quantidadedePortas){
        super(marca, modelo);
        this.quantidadedePortas = quantidadedePortas;
    }

    public Integer getQuantidadedePortas(){
        return quantidadedePortas;
    }
    public void setQuantidadedePortas(Integer quantidadedePortas){
        this.quantidadedePortas= quantidadedePortas;
    }

    @Override
    public String toString(){
        return super.toString()+ "Quantidade de Portas = "+ quantidadedePortas +"";
    }

    public static void main (String[] args){
        Carro c = new Carro("Hyundai", "Carro", 4);
        System.out.println(c);
    }
}
