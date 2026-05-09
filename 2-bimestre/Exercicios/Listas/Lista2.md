# EXERCÍCIOS 2 bimestre – Lista de Exercícios 2 | Programação Orientada a Objetos
## Laboratório de Programação II
### Conteúdo: Classes, Objetos, Construtores, Métodos e Encapsulamento

---

### 1.
Com relação aos conceitos da programação orientada a objetos qual é a finalidade da classe ? Como posso representar uma classe na linguagem de programação Java ?

---

### 2.
Qual a diferença entre uma classe e um objeto na programação orientada a objetos ?

---

### 3.
Qual a finalidade do método construtor ? Qual é a assinatura do método construtor na linguagem de programação Java ?

---

### 4.
Qual a utilidade dos métodos na programação orientada a objetos ? O que é a assinatura de um método ? Qual é a assinatura dos métodos na linguagem de programação Java ?

---

### 5.
Qual é a importância do encapsulamento na programação orientada a objetos ? Como podemos representar o encapsulamento na linguagem de programação Java ?

---

### 6.
Qual é a importância da técnica de “sobrecarregar” os métodos na programação orientada a objetos ?

---

### 7. Classe Produto

Descrição: Crie a classe `Produto` que representa um item à venda.

#### Requisitos:
- Atributos:
  - `nome (String)`
  - `preco (Double)`
  - `estoque (Integer)`

- Dois construtores:
  - Um que recebe todos os atributos
  - Um que recebe apenas o nome e define:
    - `preco = 0.0`
    - `estoque = 0`

- Métodos:
  - Getters e Setters para todos os atributos

>[Resolução](Lista2-resolucoes/Produto.java)

---

### 8. Classe ContaBancaria

Descrição: Crie a classe `ContaBancaria` que simula uma conta de banco.

#### Requisitos:
- Atributos:
  - `titular (String)`
  - `numero (Integer)`
  - `saldo (Double)`

- Dois construtores:
  - Um que recebe titular, numero e saldo
  - Um que recebe apenas titular e numero, com:
    - `saldo = 0.0`

- Métodos:
  - Getters e Setters para todos os atributos
  - `depositar(double valor)`
  - `sacar(double valor)` (somente se houver saldo suficiente)

>[Resolução](Lista2-resolucoes/ContaBancaria.java)

---

### 9. Classe Livro

Descrição: Crie uma classe chamada `Livro` para representar livros de uma biblioteca.

#### Requisitos:
- Atributos:
  - `titulo (String)`
  - `autor (String)`
  - `anoPublicacao (int)`

- Construtores:
  - Um construtor que recebe todos os atributos
  - Um construtor que recebe apenas o título e o autor, e define:
    - `anoPublicacao = 2020`

- Métodos:
  - Getters e Setters para todos os atributos
  - Um método `exibirInfo()` que imprime os dados do livro formatados.

>[Resolução](Lista2-resolucoes/Livro.java)

---