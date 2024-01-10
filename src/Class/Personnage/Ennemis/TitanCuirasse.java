package Class.Personnage.Ennemis;

import Class.Personnage.Personnage;

public class TitanCuirassé extends Personnage {
    public String nom = "Titan Cuirassé";
    public int invincible;

    public TitanCuirassé(String nom, int hp, int force, String[] inventaire) {
        super(nom, hp, force, inventaire);
    }

    // Chance de pas prendre de dégats
    public void armureImpenetrable() {

    }
}
