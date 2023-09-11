package Humains;

public class Femme extends Humain {
    private String magazinePrefere = "aucun";

    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age); // Appel du constructeur de la classe mère (Humain)
    }

    public Femme(String nom, String prenom, int age, int taille, int poids, int anneeDeNaissance,
            String pays, String magazinePrefere) {
        super(nom, prenom, age, taille, poids, anneeDeNaissance, pays);
        this.magazinePrefere = magazinePrefere;
    }

    // Méthode pour obtenir l'équipe préférée
    public String getmagazinePrefere() {
        return magazinePrefere;
    }

    // Méthode pour définir l'équipe préférée
    public void setmagazinePrefere(String magazinePrefere) {
        this.magazinePrefere = magazinePrefere;
    }

    @Override
    public void sayHello() { //polymorphisme

        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom + "je suis une femme et j'ai" + age + "ans");
    }
}