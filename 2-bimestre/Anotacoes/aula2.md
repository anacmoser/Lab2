# Anotações - Aula 2 | Desenvolvimento Orientado a Objetos
## JAVADOC
``Java Platform, Standard Edition & Java Development Kit Version API Specification``
Um gerador de documentação criado pela Sun Microsystems para documentar a API dos programas em Java, a partir do código-fonte. O resultado é expresso em HTML

## Invocando métodos 
```java
public class TesteInteger{
    public static void main (String[] args){
        Integer a = 5;
        Double b = a.doubleValue();
        Float c = a.floatValue();
        Integer d - Integer.parseInt("10");
    }
}
```

## Polimorfismo
Capacidade de um objeto assumir diferentes formas.  A sobrecarga de métodos é um conceito do polimorfismo
```java
    class Animal {
        void som() { System.out.println("som"); }
    }

    class Cachorro extends Animal {
        void som() { System.out.println("au au"); }
    }

    public class Main {
        public static void main(String[] args) {
            Animal a = new Cachorro();
            a.som();
        }
    }
    // o método som pode imprimir auau ou miau, assumindo mais de uma forma.
```

## Sobrecarga
Criação de dois ou mais métodos com nomes iguais em uma classe, contanto que seus argumentos sejam diferentes.
```java
    public class Aluno{
        private String nome;
        private String prontuario;

        public Aluno(){
            this.nome="";
            this.prontuario="";
        }
        public Aluno(String n, String p){
            this.nome=n;
            this.prontuario=p;
        }
        public Aluno (String n){
            this.nome=n;
            this.prontuario=""
        }
    }
```