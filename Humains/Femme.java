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

    // Méthode pour obtenir le magazine préféré
    public String getmagazinePrefere() {
        return magazinePrefere;
    }

    // Méthode pour définir le magazine préféré
    public void setmagazinePrefere(String magazinePrefere) {
        this.magazinePrefere = magazinePrefere;
    }

    @Override
    public void sayHello() { // polymorphisme

        System.out
                .println("Bonjour, je m'appelle " + prenom + " " + nom + ", je suis une femme et j'ai " + age + "ans");
    }

    @Override
    public void sayEverything() {
        super.sayEverything();
        System.out.println("Mon magazine préféré est " + magazinePrefere);
    }
}