package Class.Personnage.Ennemis;

import Class.Personnage.Personnage;

public class TitanCon extends Personnage {
    public String nom = "Titan Con";
    public int cognerie;

    public TitanCon(int hp, int force) {

        super("Titan Con", hp, force);
    }

    // Se met des dégats totalement conssenti losqu'il attaque
    public void attarder() {

    }
}
