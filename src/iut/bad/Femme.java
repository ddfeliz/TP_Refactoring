package iut.bad;

public class Femme extends Humain {
    public Femme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "FEMME : " + super.toString();
    }
    
    public static void main(String[] args) {
        Homme h = new Homme("Jhon", "Clermont", 27);
        Femme f = new Femme("Arisoa", "Justinah", 24);

        h.ami(f);
    }

}
