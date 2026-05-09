# EXERCÍCIOS 2 bimestre– Lista de Exercícios 3 | Programação Orientada a Objetos
## Laboratório de Programação I
### Conteúdo: Herança, Polimorfismo, Sobrescrita e Classe Object

---

### 1. Classe Animal

Crie uma classe `Animal` com os atributos:
- `nome`
- `idade`

E um método:
- `emitirSom()`

Depois, crie duas subclasses:
- `Cachorro`
- `Gato`

As subclasses devem sobrescrever o método `emitirSom()` para exibir:
- `"Latido"` para Cachorro
- `"Miau"` para Gato

#### Requisitos:
- Implementar os métodos:
  - `equals()`
  - `toString()`

>[Resolução](Lista3-resolucoes/Animal.java)

---

### 2. Classe Veiculo

Crie uma classe base `Veiculo` com os atributos:
- `marca`
- `modelo`

E os métodos:
- `ligar()`
- `desligar()`

Depois, crie as subclasses:
- `Carro`
- `Moto`

#### Requisitos:
- `Carro` deve possuir:
  - atributo `quantidadePortas`
  - métodos específicos

- `Moto` deve possuir:
  - atributo `cilindradas`
  - métodos específicos

- Implementar os métodos:
  - `equals()`
  - `toString()`

>[Resolução](Lista3-resolucoes/Veiculo.java)

---

### 3. Sistema de Biblioteca

Faça uma hierarquia de classes para representar itens em uma biblioteca.

#### Classe base:
`ItemBiblioteca`

##### Atributos:
- `titulo`
- `anoPublicacao`

##### Método:
- `exibirInformacoes()`

#### Subclasses:
- `Livro`
  - atributo adicional: `autor`
- `Revista`
  - atributo adicional: `edicao`

#### Requisitos:
- Sobrescrever `exibirInformacoes()`
- `Livro` deve exibir o autor
- `Revista` deve exibir a edição
- Implementar:
  - `equals()`
  - `toString()`

>[Resolução](Lista3-resolucoes/ItemBiblioteca.java)

---

### 4. Sistema de Transportes

Faça um sistema que modele diferentes tipos de transportes.

#### Classe base:
`Transporte`

##### Atributos:
- `capacidade`
- `velocidadeMaxima`

#### Subclasses:
- `Carro`
  - atributo adicional:
    - `tipoCombustivel`
  - método:
    - `abastecer()`

- `Bicicleta`
  - atributo adicional:
    - `tipoBicicleta`
  - método:
    - `pedalar()`

#### Requisitos:
- Implementar:
  - `equals()`
  - `toString()`

>[Resolução](Lista3-resolucoes/Transporte.java)

---

### 5. Classe Funcionario

Faça uma classe `Funcionario` com os atributos:
- `nome`
- `salario`

E um método:
- `calcularBonificacao()`

O método deve retornar:
- `10%` do salário

Depois, crie as subclasses:
- `Gerente`
- `Programador`

#### Requisitos:
- `Gerente`
  - bonificação de `20%`
- `Programador`
  - bonificação de `15%`

Crie uma lista de funcionários e calcule a bonificação total de todos.

>[Resolução](Lista3-resolucoes/Funcionario.java)

---

### 6. Sistema de Pagamentos

Implemente um sistema de pagamentos.

#### Classe base:
`Pagamento`

##### Método:
- `processarPagamento()`

O método deve imprimir:
```java
"Processando pagamento..."
```

#### Subclasses:

##### `PagamentoCartaoCredito`
Sobrescreve `processarPagamento()` para imprimir:
```java
"Pagamento com cartão de crédito aprovado."
```

##### `PagamentoBoleto`
Sobrescreve `processarPagamento()` para imprimir:
```java
"Pagamento com boleto bancário confirmado."
```

##### `PagamentoPix`
Sobrescreve `processarPagamento()` para imprimir:
```java
"Pagamento com Pix realizado com sucesso."
```

>[Resolução](Lista3-resolucoes/Pagamento.java)

---