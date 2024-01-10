package Class.Items;

public abstract class ObjetsDuJeu implements Interactuable {

    public static String nom;
    public int durabilite;

    protected ObjetsDuJeu(String nom, int durabilite) {
        this.nom = nom;
        this.durabilite = durabilite;
    }


}
