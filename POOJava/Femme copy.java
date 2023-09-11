package POOJava;

public class Homme {
    private String nom;
    private String prenom;
    private int age;
    private int taille;
    private int poids;
    private int anneeDeNaissance;
    private String pays;

    public Homme(String nom, int age) {
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
}