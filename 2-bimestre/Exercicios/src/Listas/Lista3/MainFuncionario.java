package Listas.Lista3;

class Funcionario{
    public String nome;
    public double salario;

    public Funcionario (String nome, double salario){
        this.nome=nome;
        this.salario=salario;
    }

    public double calcularBonificacao(){
        double bonificacao=salario*0.1;
        return Math.round(bonificacao * 100.0) / 100.0;
    }
    @Override
    public String toString(){
        return "Funcionário: " + nome + ", Salario: " + salario + ", Bonificação: " + calcularBonificacao();
    }
}

class Gerente extends Funcionario{
    public Gerente(String nome, double salario){
        super(nome, salario);
    }
    public double calcularBonificacao(){
        double bonificacao=salario*0.2;
        return bonificacao;
    }
    @Override
    public String toString(){
        return "Funcionário: " + nome + ", Cargo:" + getClass().getSimpleName() + ", Salario: " + salario + ", Bonificação: " + calcularBonificacao();
    }
}

class Programador extends Funcionario{
    public Programador(String nome, double salario){
        super(nome, salario);
    }
    public double calcularBonificacao(){
        double bonificacao=salario*0.15;
        return bonificacao;
    }
    @Override
    public String toString(){
        return "Funcionário: " + nome + ", Cargo:" + getClass().getSimpleName() + ", Salario: " + salario + ", Bonificação: " + calcularBonificacao();
    }
}

public class MainFuncionario {
    public static void main (String[] args) {
        Funcionario[] lista = new Funcionario[3];

        lista[0] = new Programador("Joao", 1200.50);
        lista[1] = new Gerente("Eduardo", 1500.60);
        lista[2] = new Funcionario("Guilherme", 1000.10);

        for (Funcionario f : lista) {
            f.calcularBonificacao();
            System.out.println(f);
        }//for each funcionario f, calcular bonificacao

    }
}
