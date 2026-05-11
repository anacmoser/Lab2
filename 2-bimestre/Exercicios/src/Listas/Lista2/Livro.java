package Listas.Lista2;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo=titulo;
        this.autor=autor;
        this.anoPublicacao=anoPublicacao;
    }
    public Livro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
        this.anoPublicacao=2020;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao=anoPublicacao;
    }

    public void exibirInfo(){
        System.out.println("Livro: "+ getTitulo() + ", autor: " + getAutor() + ", ano de publicação: " + getAnoPublicacao());
    }


    public static void main(String[] args){
        Livro l = new Livro("Morro dos ventos uivantes", "Emily Bronte", 1847 );
        l.exibirInfo();
    }
}
