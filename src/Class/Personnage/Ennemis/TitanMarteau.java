package Class.Personnage.Ennemis;

import Class.Personnage.Personnage;

public class TitanMarteau extends Personnage {
    public String nom = "Titan Marteau";
    public int regeneration;

    public TitanMarteau(String nom, int hp, int force, String[] inventaire) {
        super(nom, hp, force, inventaire);
    }

    // Se regenere en fonction des dégats qu'il inflige
    public  void voldeVie() {

    }
}
