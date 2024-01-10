package Class.Personnage.Ennemis;

import Class.Personnage.Personnage;
import Class.Personnage.Joueur;
public class TitanColossal extends Personnage {
    public String nom = "Titan Colossal";
    public int brulure;

    public TitanColossal(int hp, int force) {
        super("Titan Colossal", hp, force);
    }

    // Dégats lorsqu'il est attaqué
    public void Vapeur(Joueur bot) {

    }
    public void attaquer(Joueur bot){
        System.out.println(bot.nom + " a " +bot.hp + " hp ");
        System.out.println(nom + " met une bavette  sur " + bot.nom);
        bot.hp -= force;
        System.out.println(bot.nom + " a perdu  " +force + " il est donc a :  " + bot.hp);
    }
}
