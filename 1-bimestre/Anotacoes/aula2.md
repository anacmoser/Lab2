# Anotações aula 2

## Variáveis
- Devem começar com letras minúsculas;
- Podem conter números, mas não espaços e nem palavras reservadas

## Contantes
Valor imutável;

- Em Java, utilizamos a palavra "final" antes para declarar constantes;
- Devem ser com letras maiúsculas

```java
    final double PI = 3.14159;
    final int DIAS_SEMANA = 7;
```

## Função Principal main
Onde o programa começa
```java
    public static void main (String[] args){
        System.out.println("Olá, mundo!");
    }
```
- Ponto de entrada do programa;
- Sem ela, o programa não executa; \
✔ Public → acessível de qualquer lugar \
✔ Static → pode ser executado sem criar objeto \
✔ Void → não retorna valor \
✔ Main → nome padrão reconhecido pela JVM \
✔ String[] args → permite receber argumentos do sistem 

## Classe
Estrutura que organiza um programa Java, TODO código Java precisa estar dentro de uma classe.
```java
    public class PrimeiroPrograma{
        public static void main (String[] args){
            ///
        }
    }
```

- TUDO deve estar dentro de uma classe (inclusive a função main);

✔ Classe → organiza o programa \
✔ main → ponto de início da execução \
✔ instruções → o que o programa faz

💡 Todo programa Java segue essa estrutura básica

## JVM
Java Virtual Machine. É o programa responsável por executar aplicações Java. \
Funções da JVM: \
✔ Executar programas Java  
✔ Interpretar o bytecode  
✔ Gerenciar memória  
✔ Garantir portabilidade  
Graças à JVM, Java roda em qualquer sistema operacional.