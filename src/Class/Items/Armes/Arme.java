package Class.Items.Armes;

import Class.Items.ObjetsDuJeu;

public class Arme extends ObjetsDuJeu {
    public int degats;
    public int vitesseAttaque;

    public Arme(String nom, int durabilite, int degats, int vitesseAttaque) {
        super(nom, durabilite);
        this.degats = degats;
        this.vitesseAttaque = vitesseAttaque;
    }

    public void équiperArme() {

    }
}
