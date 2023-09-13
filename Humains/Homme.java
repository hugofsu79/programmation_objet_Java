package Humains;

public class Homme extends Humain {
    private String equipePreferee = "aucune";

    public Homme(String nom, String prenom, int age) {
        super(nom, prenom, age); // Appel du constructeur de la classe mère (Humain)
    }

    public Homme(String nom, String prenom, int age, int taille, int poids, int anneeDeNaissance,
            String pays, String equipePreferee) {
        super(nom, prenom, age, taille, poids, anneeDeNaissance, pays);
        this.equipePreferee = equipePreferee;
    }

    // Méthode pour obtenir l'équipe préférée
    public String getEquipePreferee() {
        return equipePreferee;
    }

    // Méthode pour définir l'équipe préférée
    public void setEquipePreferee(String equipePreferee) {
        this.equipePreferee = equipePreferee;
    }

    @Override
    public void sayHello() { // polymorphisme

        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom + ", je suis un homme et j'ai " + age + "ans");
    }

    @Override
    public void sayEverything() {
        super.sayEverything();
        System.out.println("Mon équipe préférée est " + equipePreferee);
    }
}