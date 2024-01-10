package Class.Personnage;

import Class.Items.Interactuable;

public class Joueur extends Personnage {
    public  int resistance;

    public Joueur(String nom, int hp, int force, String[] inventaire, int resistance) {
        super(nom, hp, force, inventaire);
        this.resistance = resistance;
    }
}
