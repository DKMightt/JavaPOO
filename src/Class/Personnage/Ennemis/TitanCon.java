package Class.Personnage.Ennemis;

import Class.Personnage.Personnage;

public class TitanCon extends Personnage {
    public String nom = "Titan Con";
    public int cognerie;

    public TitanCon(String nom, int hp, int force, String[] inventaire) {
        super(nom, hp, force, inventaire);
    }

    // Se met des dégats totalement conssenti losqu'il attaque
    public void attarder() {

    }
}
