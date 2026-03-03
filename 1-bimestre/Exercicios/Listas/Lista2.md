# EXERCÍCIOS – Lista de Exercícios 3 | 03/03/2026
## Laboratório de Programação II
### Slides: [Aula 3](../../Slides/Aula3.pdf)

---

### 1.
Crie um programa em Java que receba um valor do tipo `String` representando um número inteiro.  

- Utilize um método da classe `Integer` para converter essa `String` em número.  
- Em seguida, use uma estrutura `if/else` para verificar se o número é par ou ímpar.  
- Exiba a mensagem correspondente.

>[Resolução](Lista2-resolucoes/ex1.java)

---

### 2.
Crie um programa que declare dois objetos do tipo `Integer`.  

- Utilize o método `compareTo()` da classe `Integer` para comparar os dois valores.  
- Usando `if/else`, verifique o resultado da comparação e informe:
  - Qual número é maior, ou  
  - Se os dois números são iguais.

>[Resolução](Lista2-resolucoes/ex2.java)

---

### 3.
Crie um programa que declare dois objetos do tipo `Integer`.  

- Utilize o método `equals()` da classe Wrapper para verificar se os valores são iguais.  
- Com `if/else`, exiba:
  - `"Valores iguais"` caso sejam iguais  
  - `"Valores diferentes"` caso não sejam iguais  

>[Resolução](Lista2-resolucoes/ex3.java)

---

### 4.
Crie um programa que receba um valor do tipo `String` representando um número decimal.  

- Utilize um método da classe `Double` para converter esse valor.  
- Depois, utilizando `if/else`, verifique se o número é:
  - Maior que 100  
  - Menor ou igual a 100  
- Exiba a mensagem correspondente.

>[Resolução](Lista2-resolucoes/ex4.java)

---

### 5.
Crie um programa que receba uma `String` contendo `"true"` ou `"false"`.  

- Utilize um método da classe `Boolean` para converter essa `String` em um valor booleano.  
- Usando `if/else`, exiba:
  - `"Acesso permitido"` se o valor for verdadeiro  
  - `"Acesso negado"` se o valor for falso  

>[Resolução](Lista3-resolucoes/ex5.java)

---

### 6.
Crie um programa que declare uma variável do tipo `Object` e atribua a ela um valor do tipo `Integer`.  

- Utilize o operador `instanceof` para verificar se o objeto é uma instância da classe `Integer`.  
- Se for verdadeiro:
  - Converta o objeto para `Integer`
  - Verifique, usando `if/else`, se o número é maior que 50  
- Caso não seja um `Integer`, exiba:  
  `"Objeto não é do tipo Integer"`

>[Resolução](Lista3-resolucoes/ex6.java)

---

### 7.
Crie um programa que declare uma variável do tipo `Object` contendo um valor numérico decimal.  

- Utilize `instanceof` para verificar se o objeto é do tipo `Double`.  
- Se for:
  - Utilize um método da classe `Double` para obter seu valor primitivo  
  - Verifique com `if/else` se o número é positivo ou negativo  
- Caso contrário, exiba:  
  `"Tipo incompatível"`

>[Resolução](Lista3-resolucoes/ex7.java)

---

### 8.
Crie um programa que declare duas variáveis do tipo `Object`, ambas contendo valores do tipo `Integer`.  

- Antes de comparar os valores, utilize `instanceof` para garantir que ambos são instâncias de `Integer`.  
- Se forem:
  - Utilize o método `equals()` ou `compareTo()` para comparar os valores  
  - Use `if/else` para informar se são iguais ou qual é maior  
- Se algum dos objetos não for `Integer`, exiba uma mensagem informando erro de tipo.

>[Resolução](Lista3-resolucoes/ex8.java)

---

### 9.
Crie um programa que declare uma variável do tipo `Object` contendo uma `String` com valor `"true"` ou `"false"`.  

- Primeiro, verifique com `instanceof` se o objeto é do tipo `String`.  
- Se for:
  - Utilize um método da classe `Boolean` para converter a `String`  
  - Use `if/else` para exibir se o usuário está ativo ou inativo  
- Caso contrário, exiba:  
  `"Entrada inválida"`

>[Resolução](Lista3-resolucoes/ex9.java)

---

### 10.
Crie um programa que declare uma variável do tipo `Object` que pode receber diferentes tipos de Wrapper (`Integer`, `Double` ou `Boolean`).  

Utilize uma estrutura com `if/else` combinada com `instanceof` para:

- Se for `Integer` → verificar se é maior que 100  
- Se for `Double` → verificar se é maior que 100.0  
- Se for `Boolean` → informar se o valor é verdadeiro ou falso  
- Caso não seja nenhum desses tipos, exibir:  
  `"Tipo não suportado"`

>[Resolução](Lista3-resolucoes/ex10.java)

---

## 💻 Compilação e Execução

Para compilar:

```bash
javac NomeDoArquivo.java