package Class.Items.Objets;

public class Armure extends Objet{
    // Donne des bonus de resistance

    public Armure(String nom, int durabilite, int bonus) {

        super(nom, durabilite, bonus);
        this.prix = 2;
    }
}