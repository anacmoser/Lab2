# EXERCÍCIOS 2 bimestre – Lista de Exercícios 2 | Programação Orientada a Objetos
## Laboratório de Programação II
### Conteúdo: Classes, Objetos, Construtores, Métodos e Encapsulamento

### 1. Classe Produto

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

>[Resolução](../Listas/Lista2/Produto.java)

---

### 2. Classe ContaBancaria

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

>[Resolução](../Listas/Lista2/ContaBancaria.java)

---

### 3. Classe Livro

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

>[Resolução](../Listas/Lista2/Livro.java)

---