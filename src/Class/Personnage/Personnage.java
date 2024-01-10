package Class.Personnage;

import java.util.Arrays;

public class Personnage {
    public String nom;
    public int hp;
    public int force;

    public Personnage(String nom, int hp, int force) {
        this.nom = nom;
        this.hp = hp;
        this.force = force;
    }

    public Personnage(String nom) {
        this.nom = nom;
    }

    public Personnage(int hp, int force) {
        this.hp = hp;
        this.force = force;
    }


    public void infos(){
        System.out.println(nom + " HP : " + hp + " Force : " + force);
    }
    public void attaquer() {
    }
    public void defendre() {
    }
}
