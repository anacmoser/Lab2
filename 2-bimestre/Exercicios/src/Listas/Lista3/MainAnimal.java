package Listas.Lista3;
class Animal {
    public String nome;
    public int idade;

    public Animal(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
    public String emitirSom(){
        return "som";
    }

    @Override
    public String toString(){
        return "Nome =" + nome + ", idade =" + idade + ", som = " + emitirSom();
    }
    @Override
    public boolean equals(Object outroObjeto){
        if(getClass() != outroObjeto.getClass()){
            return false;
        }
        Animal outroAnimal = (Animal) outroObjeto;
        return nome.equals(outroAnimal.nome) &&
            idade == outroAnimal.idade;
    }
    
}

class Cachorro extends Animal{
    public Cachorro(String nome, int idade){
        super(nome, idade);
    }
    public String emitirSom(){
        return "auau";
    }

    @Override
    public String toString(){
        return "Nome =" + nome + ", idade =" + idade + ", som = " + emitirSom();
    }

}

class Gato extends Animal{
    public Gato(String nome, int idade){
        super(nome, idade);
    }
    public String emitirSom(){
        return "miau";
    }

    @Override
    public String toString(){
        return "Nome =" + nome + ", idade =" + idade + ", som = " + emitirSom();
    }

}

public class MainAnimal{
    public static void main(String[] args){
        Cachorro c = new Cachorro("pascal", 4);
        Gato c2 = new Gato("pascal", 4);
        System.out.println(c);
        System.out.println(c2);
        System.out.println(c.equals(c2));
    }
}