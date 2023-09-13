package POOJavaEcole;

public class Ecole {

    protected String nom;// Atributs
    protected String[] matieresEnseignees;
    protected String ville;
    protected Etudiant[] etudiants;

    public Ecole(String nom, String[] matieresEnseignees, String ville, Etudiant[] etudiants) { // attribut
        this.nom = nom;
        this.matieresEnseignees = matieresEnseignees;
        this.ville = ville;
        this.etudiants = etudiants;

    }

    public String getNom() {
        return nom;
    }

    public String[] getMatieresEnseignees() {
        return matieresEnseignees;
    }

    public String getVille() {
        return ville;
    }

    public Etudiant[] getEtudiant() {
        return etudiants;
    }

    public void showInformations() {
        System.out.println("À l'école " + nom + " de la ville de " + ville
                + ", une variété de matières fascinantes, y compris ");
        for (String matiere : matieresEnseignees) {
            System.out.println(matiere);
        }
        System.out.println(
                " L'école " + nom
                        + " est un lieu d'apprentissage dynamique et de croissance académique, où les futurs leaders et chercheurs sont formés pour réussir dans leur vie et leur carrière.");
    }
}
