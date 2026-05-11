package Listas.Lista1;

public class Tenis {
    private String marca;
    private String cor;
    private String modelo;

    public Tenis (){

    }
    public Tenis(String marca){
        this.marca=marca;
    }
    public Tenis(String marca, String cor, String modelo){
        this.marca=marca;
        this.cor=cor;
        this.modelo=modelo;

    }

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setCor(String cor){
        this.cor=cor;
    }

    
    public static void main (String[]args){
        Tenis t = new Tenis("Converse", "preto", "All stars");
        System.out.println(t.getMarca()+" "+ t.getCor()+" "+t.getModelo());
    }
}
