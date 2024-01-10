package Class.Personnage.Ennemis;

import Class.Personnage.Personnage;

public class TitanMarteau extends Personnage {
    public String nom = "Titan Marteau";
    public int regeneration;

    public TitanMarteau( int hp, int force) {
        super("Titan Marteau", hp, force);
    }

    // Se regenere en fonction des dégats qu'il inflige
    public  void voldeVie() {

    }
}
