package Pessoais;

public class Veiculo{
    private String marca;
    private String modelo;

    public Veiculo(){
        this.marca="";
        this.modelo="";
    }
    public Veiculo(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    @Override
    public String toString(){
        return "Marca =" + marca + ", modelo =" + modelo + "";
    }

    public static void main (String[] args){
        Veiculo c = new Veiculo("Hyundai","Carro");
        System.out.println(c);
    }
}