package Listas.Lista2;

public class Produto {
    private String nome;
    private Double preco;
    private Integer estoque;

    public Produto(String nome, Double preco, Integer estoque){
        this.nome=nome;
        this.preco=preco;
        this.estoque=estoque;
    }
    public Produto (String nome){
        this.nome=nome;
        this.preco=0.00;
        this.estoque=0;
    }

    public String getNome(){
        return nome;
    }
    public Double getPreco(){
        return preco;
    }
    public Integer getEstoque(){
        return estoque;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setPreco(Double preco){
        this.preco=preco;
    }
    public void setEstoque(Integer estoque){
        this.estoque=estoque;
    }
}
