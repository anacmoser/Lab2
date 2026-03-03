# EXERCÍCIOS – Lista de Exercícios 2 | 03/03/2026
## Laboratório de Programação II
### Slides: [Aula 3](../../Slides/Aula3.pdf)

---

### 1.
Em Java, um objeto possui três características fundamentais. Explique cada uma delas com suas próprias palavras e dê um exemplo prático.

>[Resolução](Lista2-resolucoes/ex1.java)

---

### 2.
Dado o trecho abaixo, identifique o que é a classe, o que é o objeto e o que é a referência:

```java
String nome = "Domingos";
```

---

### 3.
Qual a diferença entre tipos primitivos e objetos em Java? Cite ao menos duas características de cada.

---

### 4.
Por que os tipos primitivos não podem ser usados diretamente em estruturas como `ArrayList`? O que deve ser usado no lugar?

---

### 5.
Para cada tipo primitivo abaixo, escreva sua classe Wrapper correspondente e um exemplo de uso de método utilitário:

- `int`
- `double`
- `char`
- `boolean`

>[Resolução](Lista2-resolucoes/ex5.java)

---

### 6.
O código abaixo apresenta erro. Explique o motivo e corrija:

```java
ArrayList<int> numeros = new ArrayList<int>();
numeros.add(10);
```

>[Resolução](Lista2-resolucoes/ex6.java)

---

### 7.
Explique com suas palavras o que é **Autoboxing** e **Unboxing**. Dê um exemplo de cada.

>[Resolução](Lista2-resolucoes/ex7.java)

---

### 8.
O que será exibido no console? Explique passo a passo o que ocorre internamente:

```java
Integer numero = 10;
int valor = numero;
System.out.println(valor);
```

---

### 9.
Explique por que o código abaixo pode causar erro em tempo de execução e como corrigi-lo:

```java
Integer pontuacao = null;
int total = pontuacao + 10;
```

---

### 10.
Converta a `String` abaixo para os tipos indicados usando os métodos corretos dos Wrappers:

```java
String valor = "1250.75";
// Converta para: int, double, float
```

>[Resolução](Lista2-resolucoes/ex10.java)

---

### 11.
Qual a diferença prática entre `Integer.parseInt(s)` e `Integer.valueOf(s)`? Quando usar cada um?

---

### 12.
O código abaixo vai compilar? Se sim, qual será a saída? Explique o que acontece com o tipo do objeto:

```java
Object obj = 10;
if (obj instanceof Integer) {
    System.out.println("É um Integer!");
}
```

---

### 13.
Explique o resultado do código abaixo. Por que os dois `if` produzem resultados diferentes?

```java
Object obj = 3.14;

if (obj instanceof Double) {
    System.out.println("É um Double!");
}
if (obj instanceof Integer) {
    System.out.println("É um Integer!");
}
```

---

### 14.
Por que o operador `==` **não** deve ser usado para comparar objetos Wrapper? O que deve ser utilizado no lugar? Dê um exemplo que demonstre o problema.

>[Resolução](Lista2-resolucoes/ex14.java)

---

### 15.
O que será exibido pelo código abaixo? Justifique sua resposta com base no conceito de comparação por referência:

```java
Integer a = 200;
Integer b = 200;
System.out.println(a == b);
System.out.println(a.equals(b));
```

---

### 16.
O que acontece ao usar `instanceof` com um objeto `null`? Escreva um exemplo que demonstre o comportamento esperado.

>[Resolução](Lista2-resolucoes/ex16.java)

---

### 17.
Analise o código e corrija o erro de conversão entre Wrappers:

```java
Integer nota = 100;
Double notaDouble = (Double) nota; // Esta linha está errada
```

>[Resolução](Lista2-resolucoes/ex17.java)

---

### 18.
O código abaixo lança uma exceção em tempo de execução. Identifique qual exceção é essa, explique por que ocorre e corrija:

```java
String entrada = "R$ 150";
int preco = Integer.parseInt(entrada);
```

>[Resolução](Lista2-resolucoes/ex18.java)

---

### 19.
Coloque na ordem correta o fluxo de conversão que ocorre na linha `int valor = numero;`, onde `numero` é um `Integer`:

- ( ) O valor primitivo é armazenado na variável `valor`
- ( ) O Java chama internamente `numero.intValue()`
- ( ) O objeto `Integer` está na memória Heap
- ( ) O resultado primitivo é extraído do objeto

---

### 20. Exercício prático

Crie um programa que:

- receba dois valores numéricos digitados pelo usuário como `String`
- converta-os para `Integer` usando o método adequado
- compare os valores usando `equals()` e exiba se são iguais ou diferentes
- exiba qual é o maior valor usando `Integer.max()`
- exiba a representação binária do maior valor usando `Integer.toBinaryString()`

>[Resolução](Lista2-resolucoes/ex20.java)

Escreva também os comandos para compilar e executar.