package POOJavaEcole;

public class Etudiant {

    protected String nom;// Atributs
    protected String prenom;
    protected int age;
    protected String matiereEtudiee;
    protected Boolean diplomeObtenu;

    public Etudiant(String nom, String prenom, int age, String matiereEtudiee, Boolean diplomeObtenu) { // attribut
        this.nom = nom; // ou nom = etudiantNom;
        this.prenom = prenom;
        this.age = age;
        this.matiereEtudiee = matiereEtudiee;
        this.diplomeObtenu = diplomeObtenu;
    }

    public void sayHello() { // méthode sayHello
        System.out.println(
                "Bonjour, je m'appelle " + prenom + " " + nom + ", j’ai " + age + " et j’étudie " + matiereEtudiee);
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

    public String getMatiereEtudiee() {
        return matiereEtudiee;
    }

    public Boolean getDiplomeObtenu() {
        return diplomeObtenu;
    }

    public void setDiplomeObtenu(Boolean secondDiplomeObtenu) {
        diplomeObtenu = secondDiplomeObtenu;
    }


    public void isGraduated() {
        if (diplomeObtenu == true) {
            System.out.println("J'ai obtenu mon diplôme.");
        } else {
            System.out.println("Je ne suis pas encore diplômé(e).");
        }
    }

}
