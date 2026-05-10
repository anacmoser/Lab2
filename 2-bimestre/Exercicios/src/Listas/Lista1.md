# EXERCÍCIOS 2 bimestre – Lista de Exercícios 1 | Programação Orientada a Objetos
## Laboratório de Programação II
### Conteúdo: Classes, Objetos, Métodos, Encapsulamento e Construtores

---

### 1.
Com relação aos conceitos da programação orientada a objetos, qual é a finalidade da classe?
> Classes têm como objetivo servir como um molde reutilizavel para a criação de objetos, definindo atributos e métodos que os objetos terão
---

### 2.
Como posso representar uma classe na linguagem de programação Java?
> Uma classe pode ser representada por um conjunto de palavras que seguem um padrão, da seguinte forma:

```java
public class Pessoa{

}
```
>Em que há um qualificador de acesso, o nome "class" e o próprio nome da classe, com inicial maiúscula.
---

### 3.
Qual a diferença entre uma classe e um objeto na programação orientada a objetos?
> Um objeto é uma instância de uma classe. 
---

### 4.
Qual a finalidade do método construtor? Qual é a assinatura do método construtor na linguagem de programação Java?
>O método construtor serve para permitir que as instâncias da classe possuam atributos, literalmente construindo-os 

```java
public class Pessoa{
    String nome;
    int idade;

    public Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
}
```
O método constructor possui o mesmo nome da classe e não tem tipo de retorno.

---

### 5.
Qual a utilidade dos métodos na programação orientada a objetos? O que é a assinatura de um método? Qual é a assinatura dos métodos na linguagem de programação Java?
> Métodos são úteis pois definem comportamentos de um objeto.
Um método possui qualificador de acesso, tipo de dado e pode ter ou não parâmetros.

```java
public class Pessoa{
    private String nome;
    int idade;

    public Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
}
```

---

### 6.
Qual é a importância do encapsulamento na programação orientada a objetos? Como podemos representar o encapsulamento na linguagem de programação Java?
> O encapsulamento é importante para a segurança dos dados, através do acesso controlado por meio de qualificadores de acesso, getters e setters.

```java
public class Pessoa{
    private String nome;
    int idade;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
}
```

---

### 7.
Qual é a importância da técnica de “sobrecarregar” os métodos na programação orientada a objetos?
> 

```java

```

---

### 8.
Quais são os padrões de nomenclatura Java que devem ser utilizados para a definição de atributos, métodos, métodos estáticos e classes?
> - `Atributos`: camelCase
> - `Métodos`: camelCase
> - `Métodos Estáticos`: camelCase
> - `Classes`: PascalCase


---

### 9.
Escreva o código fonte da classe Relógio, incluir 3 atributos, 3 métodos construtores, métodos de acesso get/set;

>[Resolução](Lista1/Relogio.java)

---

### 10.
Escreva o código fonte da classe Caneta incluir 3 atributos, 3 métodos construtores, métodos de acesso get/set;

>[Resolução](Lista1/Caneta.java)

---

### 11.
Escreva o código fonte da classe Tenis incluir 3 atributos, 3 métodos construtores, métodos de acesso get/set;

>[Resolução](Lista1/Tenis.java)

---