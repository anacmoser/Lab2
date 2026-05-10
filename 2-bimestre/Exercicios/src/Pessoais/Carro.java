package Pessoais;

public class Carro {
    protected String marca;
    private String placa;

    public Carro(String marca, String placa){
        this.marca = marca;
        this.placa = placa;
    }
    
    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa=placa;
    }
}
