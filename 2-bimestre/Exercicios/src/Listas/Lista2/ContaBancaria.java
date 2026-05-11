package Listas.Lista2;
import java.util.Scanner;

public class ContaBancaria {
    private String titular;
    private Integer numero;
    private Double saldo;

    public ContaBancaria(){

    }
    public ContaBancaria(String titular, Integer numero, Double saldo){
        this.titular=titular;
        this.numero=numero;
        this.saldo=saldo;
    }
    public ContaBancaria(String titular, Integer numero){
        this.titular=titular;
        this.numero=numero;
        this.saldo=0.0;
    }

    public String getTitular(){
        return titular;
    }
    public Integer getNumero(){
        return numero;
    }
    public Double getSaldo(){
        return saldo;
    }

    public void setTitular(String titular){
        this.titular=titular;
    }
    public void setNumero(Integer numero){
        this.numero=numero;
    }
    public void setSaldo(Double saldo){
        this.saldo=saldo;
    }

    public void depositar(Double entrada){
        saldo+=entrada;
    }
    public void sacar(Double saida){
        if(saldo>=saida){
            saldo-=saida;
        }
        else{
            System.out.println("Não há saldo o suficiente");
        }
    }

    public static void main (String[] args){
        ContaBancaria c = new ContaBancaria("Ana", 252, 500.90);
        System.out.println(c.getSaldo());
        c.depositar(100.50);
        System.out.println(c.getSaldo());
        c.sacar(330.20);
        System.out.println(c.getSaldo());

        
    }
}

