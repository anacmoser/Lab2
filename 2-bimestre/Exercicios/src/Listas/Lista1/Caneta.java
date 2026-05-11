package Listas.Lista1;

public class Caneta {
    private String cor;
    private String marca;
    private Boolean tampada;

    public Caneta(){

    }
    public Caneta(String cor){
        this.cor=cor;
    }

    public Caneta (String cor, String marca, Boolean tampada){
        this.cor=cor;
        this.marca=marca;
        this.tampada=tampada;
    }

    public String getCor(){
        return cor;
    }
    public String getMarca(){
        return marca;
    }
    public Boolean getTampada(){
        return tampada;
    }

    public void setCor(String cor){
        this.cor=cor;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setTampada(Boolean tampada){
        this.tampada=tampada;
    }

    static public void main (String[] args){
        Caneta c = new Caneta("azul", "bic", false);
        System.out.println(c.getMarca()+" "+c.getCor()+" "+c.getTampada());
    }
}
