# Anotações - Aula 1
## Abstração
Reduzir a complexidade (utilizando apenas as partes importantes) de um código para entendê-lo com mais facilidade

## Classe
Uma classe é um molde usado para criar objetos, definindo características (atributos) e comportamentos (métodos).
Em java, um arquivo pode ter várias classes, mas só uma pode ser public, o nome dessa deve ser igual ao do arquivo. 
```java
public class Teste {

}

class Carro {

}

class Moto {

}
//primeira letra do nome da classe maiúscula;
//qualificador de acesso public na fu

```

## Pacotes / packages
Packages são usados para organizar classes em grupos, como se fossem pastas do projeto

``` java
    package escola.alunos;

    public class Aluno {

    }
```
estrutura equivalente:
```
escola/
 └── alunos/
      └── Aluno.java
```

## Qualificadores de acesso
Palavras-chave que definem quem pode acessar atributos, métodos ou classes de um programa. Controlam a visibilidade e protegem os dados do sistema.
- `public`: acessível de qualquer lugar

- ``private``: só pode ser acessado dentro da própria classe

- ``protected``: pode ser acessado pela classe, subclasses e classes do mesmo pacote/package

- ``default``: (sem modificador): pode ser acessado apenas por classes do mesmo pacote

``` java
public class Carro {

    public String marca;
    private String placa;

}
```

## Atributos
É uma variável que pertence a uma classe e serve para armazenar as características de um objeto. Se dividem em atributos de instância e de classe;

- `Instância`: pertence a cada objeto.
- `Classe`: pertence à classe inteira, sendo compartilhado entre todos os objetos.
``` java
    public class Carro {

        String modelo; // atributo de instância

        static int quantidadeCarros; // atributo de classe

    }
    Carro c1 = new Carro();
    Carro c2 = new Carro();

    c1.modelo = "Civic";
    c2.modelo = "Corolla";`
    // cada obj tem seu proprio modelo
    Carro.quantidadeCarros = 2;
    //quantidadeCarros é compartilhado por todos os carros
```

## Encapsulamento
Restringe o acesso externo aos dados internos de um objeto. Utiliza-se o qualificador de acesso `private` em Java para encapsular e proteger os atributos da classe, controlando o acesso pelos métodos get e set.

``` java
    public class Carro {
        public String marca;
        private String placa;

        public String getPlaca(){
            return placa;
        }

        public void  String setPlaca(String placa){
            this.placa = placa;
        }
        //void pq n retorna nada
    }

    Carro c = new Carro();

    c.marca = "BMW"; // muda, pois marca é public;
    c.placa = "GAY0I67"; // não funciona pois a placa é private e não pode ser acessada fora da classe

    c.setPlaca("GAY0I67"); // agora funciona pois utilizou o metodo set para alterar.

    System.out.println(c.getPlaca());  // GAY0I67


```

## Método / função
Uma função é um trecho de código que visa reduzir a redundância do programa, permitindo que uma mesma lógica seja aplicada a diferentes tarefas. Um método é uma função de uma classe específica. Como a classe carro pode ter o método buzinar()
```java
    public Double calcularSalario(Double percentual){
   //qualificador de acesso | tipo de retorno | nome do metodo | argumentos
    }
```

## Método Construtor
Método especial usado para inicializar objetos no momento em que eles são criados. Possui o mesmo nome da classe, não possuir tipo de retorno e é executado automaticamente ao criar o objeto.

```java
    public class Carro{
        String marca; // atributo com acesso padrão (default/package-private, so classes do msm package podem acessar)
        public Carro(String marca){
            this.marca = marca;
        }
    }

    Carro c = new Carro("Toyota");
```
- qualificador de acesso `public`;
- mesmo nome da Classe;
- Argumentos;
- Inicia os atributos com o valor dos argumentos.0

## Métodos de acesso
utilizados para atualizar e recuperar os valores dos atributos dos objetos da classe. Get e Set são convenções para o gerenciamento sobre o acesso dos atributos

## UML - Unified Modeling Language
Padrão para representação de modelagens utilizadas na POO. Diagrama de classes é um dos principais componentes.

## Glossário
- `parâmetro`: variável declarada na função (método) para receber valores.
- `argumento`: valor enviado para o parâmetro
- `objeto`: instância de uma classe

## Primeiro programa
>[Link](../Exercicios/src/Pessoais/Teste.java)