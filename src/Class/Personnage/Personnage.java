package Class.Personnage;

import java.util.Arrays;

public class Personnage {
    public String nom;
    public int hp;
    public int force;
    public String[] inventaire;

    public Personnage(String nom, int hp, int force, String[] inventaire) {
        this.nom = nom;
        this.hp = hp;
        this.force = force;
        this.inventaire = inventaire;
    }

    public void infos(){
        System.out.println(nom + " HP : " + hp + " Force : " + force + " Inventaire : " + Arrays.toString(inventaire));
    }
    public void attaquer() {
    }
    public void defendre() {
    }
}
