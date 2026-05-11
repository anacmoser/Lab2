package Pessoais;

public class Carro0 {
    protected String marca;
    private String placa;

    public Carro0(String marca, String placa){
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
