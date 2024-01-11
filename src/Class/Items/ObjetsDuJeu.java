package Class.Items;

public abstract class ObjetsDuJeu implements Interactuable {

    protected String nom;

    public int prix;
    protected int durabilite;

    protected ObjetsDuJeu(String nom, int durabilite) {
        this.nom = nom;
        this.durabilite = durabilite;
    }

    public String getNom() {
        return nom;
    }
}
