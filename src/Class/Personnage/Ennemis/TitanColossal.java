package Class.Personnage.Ennemis;

import Class.Personnage.Personnage;
import Class.Personnage.Joueur;
public class TitanColossal extends Personnage {
    public String nom = "Titan Colossal";
    // Dégats lorsqu'il est attaqué
    public int brulure = 5;

    public TitanColossal(int hp, int force) {
        super("Titan Colossal", hp, force);
    }




    public void attaquer(Joueur bot){
        System.out.println(bot.nom + " a " +bot.hp + " hp ");
        System.out.println(nom + " met une bavette  sur " + bot.nom);
        bot.hp -= force;
        System.out.println(bot.nom + " a perdu  " +force + " il est donc a :  " + bot.hp);
    }
    public void defendre(Joueur bot){
        System.out.println(nom + " gazifie " + bot.nom + " donc il perd " + brulure + "HP");
        bot.hp -= brulure;
        System.out.println("il lui reste donc " + bot.hp);
    }
}
