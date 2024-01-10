package Class.Items.Objets;

import Class.Items.ObjetsDuJeu;

public class Objet extends ObjetsDuJeu {
    public static int bonus;

    public Objet(String nom, int durabilite, int bonus) {
        super(nom, durabilite);
        this.bonus = bonus;
    }

    public void équiperObjet() {

    }
}
