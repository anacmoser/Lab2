# Anotações aula 3
## Objeto em java
- Praticamente tudo é objeto;
- Tipos primitivos vs objetos;
- Wrappers = objetos de tipos primitivos; mais utilizados;

#### == VS EQUALS() EM WRAPPERS (prova):
Objetos(wrappers) NÃO podem ser comparados com == assim como primitivos
```java
public class Erro {
    public static void main(String[] args){
        Integer n1 = 200;
        Integer n2 = 200;
        if (n1 == n2){
            // ERRO, == compara o endereço de MEMÓRIA. Equals() compara o valor interno/conteudo
        }

        if (n1.equals(n2)){
            System.out.prinln("Valores iguais!");
        }
    }
}
```

- #### instanceof: 
usado para verificar se um objeto pertence a determinada classe/implementa determinada interface

