package Listas.Lista3;

class ItemBiblioteca{
    public String titulo;
    public int anoPublicacao;

    public ItemBiblioteca(String titulo, int anoPublicacao){
        this.titulo=titulo;
        this.anoPublicacao=anoPublicacao;
    }
    public void exibirInformacoes(){
        System.out.println("Livro: "+titulo+", ano de publicação: "+anoPublicacao);
    }
    @Override
    public String toString(){
        return "Livro: " + titulo +", anoPublicacao: "+ anoPublicacao;
    }
    @Override
    public boolean equals(Object objeto){
        if(getClass()!=objeto.getClass()){
            return false;
        }
        ItemBiblioteca item =(ItemBiblioteca)objeto;
        return titulo.equals(item.titulo)&&anoPublicacao == item.anoPublicacao;
    }
}

class Livro extends ItemBiblioteca{
    public String autor;
    public Livro(String titulo, int anoPublicacao, String autor){
        super(titulo, anoPublicacao);
        this.autor=autor;
    }
    @Override
    public String toString(){
        return "Livro: " + titulo +", anoPublicacao: "+ anoPublicacao + ", autor: " + autor;
    }
}

class Revista extends ItemBiblioteca{
    public int edicao;
    public Revista(String titulo, int anoPublicacao, int edicao){
        super(titulo, anoPublicacao);
        this.edicao=edicao;
    }
    @Override
    public String toString(){
        return "Livro: " + titulo +", anoPublicacao: "+ anoPublicacao + ", edição: " + edicao;
    }
}

public class MainBiblioteca {
    public static void main(String[] args){
        Livro l = new Livro("A metamorfose", 1915, "Franz Kafka");
        Revista r = new Revista("playboy", 2009, 12);
        System.out.println(l);
        System.out.println(r);
    }
}
