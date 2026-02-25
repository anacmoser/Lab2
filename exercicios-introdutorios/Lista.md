# EXERCÍCIOS – Lista de Exercícios 1  
## Laboratório de Programação II

---

### 1.
Declare três variáveis para armazenar:
- nome de um surfista  
- idade  
- altura  

Atribua valores e exiba na tela.

>[Resolução](ex1.java)

---

### 2.
Declare uma constante chamada `ANO_ATUAL` com valor `2026` e calcule o ano de nascimento de uma pessoa com idade 20.

>[Resolução](ex2.java)

---

### 3.
Observe o código:

```java
int a = 10;
int b = a;
a = 20;
System.out.println(b);
```

Qual será a saída? Explique.
>10, pois 20 está sendo atribuído à A depois de B;

---

### 4.
O código abaixo apresenta erro. Explique e corrija:

```java
final double taxa;
taxa = 2.5;
taxa = 3.0;
```
> A variável que possui "final" no ínicio é uma constante, portanto, seu valor é imutável.

---

### 5.
Transforme os valores abaixo em constantes adequadas:

- velocidade máxima de uma via (80 km/h)  
- número de meses do ano  
- valor de PI  
>[Resolução](ex5.java)

---

### 6.
Escolha o tipo mais adequado para armazenar:

a) população de um país  
b) temperatura corporal  
c) letra inicial do nome  
d) se o aluno está matriculado  
>[Resolução](ex6.java)
---

### 7.
Explique por que o código abaixo gera erro. Corrija.

```java
char letra = "A";
```
>[Resolução](ex7.java)

---

### 8.
Qual a diferença prática entre usar `int` e `double` em cálculos?
> INT: variáveis numéricas inteiras (1, 5, 10). Double: ponto flutuante, (3.14, 1.83). A diferença prática em cálculos é a extadisão dos resultados, já que se uma operação entre números inteiros der um número quebrado, o Java retorna um número inteiro, portanto um resultado incorreto.

---

### 9.
O que será exibido? Explique.

```java
int x = 7;
int y = 2;
System.out.println(x / y);
```
>3, pois as variáveis estão declaradas como int, para um resultado exato, precisavam ser double.
---

### 10.
Corrija o código:

```java
float peso = 70.5;
```
> [Resolução](ex10.java)

---

### 11.
Explique por que o método `main` precisa ser `static`.
>Porque ele precisa ser estático para a JVM iniciar a aplicação sem precisar criar uma instância da classe onde o metodo se encontra
---

### 12.
O que acontece se o nome da classe for diferente do nome do arquivo?
>Porque o compilador Java usa essa convenção para localizar, compilar e gerenciar classes

---

### 13.
Complete a estrutura correta:

```java
public class Programa {
    // função main, imprimir valores dos tipos primitivos
}
```
>[Resolução](ex13.java)

---

### 14.
O que será exibido?

```java
int idade = 18;
boolean maior = idade >= 18;
System.out.println(maior);
```
> true
---

### 15.
O que será exibido?

```java
char letra = 'J';
System.out.println("Letra: " + letra);
```
> Letra: J

---

### 16.
Explique a diferença entre código fonte e bytecode.
> Código fonte é o que o dev escreve, bytecode é o gerado após a compilação, que a máquiana entende.
---

### 17.
O que acontecerá se você tentar executar um arquivo `.java` diretamente com o comando `java`?
> Ao tentar executar um arquivo .java diretamente com o comando java (sem javac antes), o programa não roda, pois o jvm não roda codigo-fonte diretamente.
---

### 18.
Coloque na ordem correta:

- ( ) Execução pela JVM  
- ( ) Compilação  
- ( ) Código fonte  
- ( ) Bytecode  
> 1 código fonte | 2 compilação | 3 bytecode | 4 execução pela jvm
---

### 19.
Por que Java é considerado multiplataforma?
> Porque graças a JVM a linguagem Java tem alta portabilidade, isso é, permite que programas sejam executados em qualquer sistema operacional - sem precisar recompilar ou reescrever o código. 
---

### 20. Exercício prático

Crie um programa que:

- leia um número digitado pelo usuário  
- calcule o dobro desse número  
- exiba o resultado  
>[Resolução](ex20.java)

Escreva também os comandos para compilar e executar.