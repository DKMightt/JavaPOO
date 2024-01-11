package Class.Personnage;

import Class.Items.Armes.Arme;
import Class.Items.Interactuable;

public class Joueur extends Personnage {
    public  int resistance;

    public String[] inventaire;

    public Joueur(String nom, int hp, int force, String[] inventaire, int resistance) {
        super(nom, hp, force);
        this.resistance = resistance;
        this.inventaire= inventaire;
    }

    public Joueur(String nom){
        super(nom);
    }
    public void attaquer(Personnage bot){
        System.out.println(bot.nom + " a " +bot.hp + " hp ");
        System.out.println(nom + " met un gros chasser dans le crane de " + bot.nom);
        bot.hp -= force;
        System.out.println(bot.nom + " a perdu  " +force + " il est donc a :  " + bot.hp);
    }
    public void attaquer(Arme equipement, Personnage bot  ){
        System.out.println(bot.nom + " a " +bot.hp + " hp ");
        System.out.println(nom + " zigouille " + bot.nom + " avec " + equipement.nom);
        int degatsTotal = force + equipement.degats;
        bot.hp -= degatsTotal;
        System.out.println(bot.nom + " a perdu " + degatsTotal + " HP " + " il est donc a : " + bot.hp + " HP ");
    }
}
