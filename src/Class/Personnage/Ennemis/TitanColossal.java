package Class.Personnage.Ennemis;

import Class.Personnage.Personnage;

public class TitanColossal extends Personnage {
    public String nom = "Titan Colossal";
    public int brulure;

    public TitanColossal(String nom, int hp, int force, String[] inventaire) {
        super(nom, hp, force, inventaire);
    }

    // Dégats lorsqu'il est attaqué
    public void Vapeur() {

    }
}
