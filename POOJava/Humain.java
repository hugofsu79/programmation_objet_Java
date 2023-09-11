package POOJava;

public class Humain {
    private String nom;
    private String prenom;
    private int age;
    private int taille;
    private int poids;
    private int anneeDeNaissance;
    private String pays;

    public Humain(String nom, String prenom, int age) { // attribut
        this.nom = nom; // ou nom = humainNom;
        this.prenom = prenom;
        this.age = age;

    }
// abstract
    public Humain(String nom, String prenom, int age, int taille, int poids, int anneeDeNaissance, String pays) { // attribut
                                                                                                                  // avec
                                                                                                                  // les
                                                                                                                  // attributs
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.taille = taille;
        this.poids = poids;
        this.anneeDeNaissance = anneeDeNaissance;
        this.pays = pays;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public int getTaille() {
        return taille;
    }

    public int getPoids() {
        return poids;
    }

    public int getAnneeDeNaissance() {
        return anneeDeNaissance;
    }

    public String getPays() {
        return pays;
    }

    public void setPoids(int nouveauPoids) {
        poids = nouveauPoids;
    }

    public void sayHello() { // méthode sayHello
        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom);
    }

}