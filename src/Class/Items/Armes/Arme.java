package Class.Items.Armes;

import Class.Items.ObjetsDuJeu;

public class Arme extends ObjetsDuJeu {
    public int dégats;
    public int vitesseAttaque;

    public Arme(String nom, int durabilite, int dégats, int vitesseAttaque) {
        super(nom, durabilite);
        this.dégats = dégats;
        this.vitesseAttaque = vitesseAttaque;
    }

    public void équiperArme() {

    }
}
