package POOJava;

public class Homme extends Humain {
    private String equipePreferee;

    public Homme(String nom, String prenom, int age) {
        super(nom, prenom, age); // Appel du constructeur de la classe mère (Humain)
    }

    public Homme(String nom, String prenom, String equipePreferee, int age, int taille, int poids, int anneeDeNaissance,
            String pays) {
        super(nom, prenom, age, taille, poids, anneeDeNaissance, pays);
        this.equipePreferee = "aucune";
    }

    // Méthode pour obtenir l'équipe préférée
    public String EquipePreferee() {
        return equipePreferee;
    }

    // Méthode pour définir l'équipe préférée
    public void setEquipePreferee(String equipePreferee) {
        this.equipePreferee = equipePreferee;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEquipePreferee() {
        return "aucune";
    }

    public int getAge() {
        return age;
    }

    public void sayHello() {
        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom + "je suis un homme et j'ai" + age + "ans");
    }
}