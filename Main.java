import Humains.*; // on importe toutes les classes du package Humains

//classe principale du programme
public class Main {

    // public static void main = méthode principale du programme (obligatoire en
    // Java)

    public static void main(String[] args) {
        // Créer la première instance de Homme
        Homme john = new Homme("Lennon", "John", 32);
        Homme paul = new Homme("McCartney", "Paul", 34, 186, 73, 1953, "France", "Liverpool");

        john.sayHello(); // parenthese imp /!\
        System.out.println("Equipe préféré de" + john.getNom() + " " + john.getEquipePreferee()); // sout<- raccouri

        paul.sayHello();
        System.out.println("Equipe préféré de" + paul.getNom() + " " + paul.getEquipePreferee()); // sout<- raccouri

        System.out.println("Poids de John : " + john.getPoids() + " kg");
        john.setPoids(65);
        System.out.println("Nouveau poids de John : " + john.getPoids() + " kg");

        System.out.println("Poids de Paul : " + paul.getPoids() + " kg");
        paul.setPoids(paul.getPoids() + 5);
        System.out.println("Nouveau poids de Paul : " + paul.getPoids() + " kg");



        //Femme
        Femme alizee = new Femme("Défault", "Alizée", 27, 160, 63, 1996, "France", "Lille");

        alizee.sayHello();
        System.out.println("Le magazine préféré d'" + alizee.getPrenom() + " " + alizee.getmagazinePrefere());
        alizee.setmagazinePrefere("Niort Agglo Magazine");
        System.out.println("Le magazine préféré d'" + alizee.getPrenom() + " " + alizee.getmagazinePrefere()); 





    }

}