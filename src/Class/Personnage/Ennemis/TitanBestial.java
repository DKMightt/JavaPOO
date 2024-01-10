package Class.Personnage.Ennemis;

import Class.Personnage.Personnage;

public class TitanBestial extends Personnage {

    public String nom = "Titan Bestial";
    public int nbCailloux;

    public TitanBestial(String nom, int hp, int force, String[] inventaire) {
        super(nom, hp, force, inventaire);
    }

    // Dégats aléatoire entre X et X rafales
    public void lancerdeCailloux() {

    }
}
