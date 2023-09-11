import Humains.*; // on importe toutes les classes du package Humains

//classe principale du programme
public class Main {

    // public static void main = méthode principale du programme (obligatoire en
    // Java)

    public static void main(String[] args) {
        // Créer la première instance de Homme
        Homme john = new Homme("Lennon", "John", 32);

        Homme paul = new Homme("McCartney", "Paul", 34, 186, 73, 1953, "France", "Liverpool");

        john.sayHello(); //parenthese imp /!\     
        System.out.println("Equipe préféré de"+ john.getNom()+" "+ john.getEquipePreferee()); //sout<- raccouri

        john.getPoids();

        
        paul.sayHello();
        System.out.println("Equipe préféré de"+ paul.getNom()+" "+ paul.getEquipePreferee()); //sout<- raccouri

    }

}