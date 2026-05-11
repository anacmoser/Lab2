# Anotações - Aula 3 | Herança

## Herança
Na linguagem Java, a herança permite a criação de novas classes (subclasses/classes derivadas, mais específicas) a partir de outras(superclasses, mais genéricas), criando uma hierarquia de classes. Uma subclasse herda os métodos e atributos de sua superclasse, mas é possível reescrevê-los para uma forma mais específica de representar o comportamento do método herdado.

## Classe Object
Assim como em JS, no Java a classe Object é a mais importante de todas. Todas as classes tem como origem a superclasse Object, portanto todas as classses herdam características dela também.

## Métodos da Classe Object
Todas as classes Java herdam os métodos da superclasse Object, sendo os três mais importantes: 
- `toString()`: Retorna uma string que representa o objeto invocando o método
- `equals()`: Compara se dois objetos são iguais(todos os atributos têm valores idênticos) ou diferentes
- `hashCode()`: Retorna um número inteiro que representa o objeto invocando o método,

São relevantes porque definem como o objeto apresenta os valores armazenados nos atributos, como será identificado e comparado com outros objetos.

## API Java
Biblioteca de classes java que encontra-se disponível gratuitamente na web. Apresenta descrição de todos componentes disponíveis no Java
>[API Java](https://docs.oracle.com/javase/8/docs/api/)

## Sobreescrever métodos
Permite que o dev reescreva um método na subclasse que já foi herdado da superclasse. O objetivo é tornar o método mais específico conforme as necessidades, por exemplo,  o programador pode sobreescrever o método toString que foi herdado da classe Object para configurar o método a fim de que ele retorne um String com os respectivos valores armazenados no atributos da subclasse.

```java
public class Aluno {
    private String nome;
    private String prontuario;

    public Aluno(String nome, String prontuario) {
        this.nome = nome;
        this.prontuario = prontuario;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " | Prontuário: " + prontuario;
    }
}
public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Ana", "12345");

        System.out.println(a); // Aluno: Ana | Prontuário: 12345
    }
}
```

## Exemplo 1 - classe veículo
```java
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
        return "[marca=" + marca + ", modelo=" + modelo + "]"
    }

    public static void main (String[] args){
        Veiculo c = new Veiculo("Hyundai","Carro");
        System.out.println(c);
    }
}
```

## Extends
Indica que uma classe herda características de outra clase

## Super
Faz referência aos métodos ou atributos da superclasse, sendo também utilizada para chamar o construtor.
- Regra importante: sempre que utilizamos a herança
na programação Java, nos métodos construtores dasubclasse devemos sempre utilizar a instrução superpara invocar o método construtor da super classe.
Obs: sempre a instrução super deve ser a primeira instrução dentro do método construtor.

## Exemplo 1 - classe veículo
```java
    public class Carro extends Veiculo{
        private Integer quantidadePortas;
        
        public Carro(){
            super();//obrigatorio
            this.quantidadedePortas=0;
        }
        public Carro(String marca, String modelo, Integer quantidadedePortas){
            super(marca, modelo);
            this.quantidadePortas = quantidadePortas;
        }

        public Integer getQuantidadedePortas(){
            return quantidadedePortas;
        }
        public void setQuantidadedePortas(Integer quantidadedePortas){
            this.quantidadedePortas= quantidadedePortas;
        }

        @Override
        public String toString(){
            return super.toSting()+ "[Quantidade de Portas = "+ quantidadedePortas +"]"
        }
    }
```
