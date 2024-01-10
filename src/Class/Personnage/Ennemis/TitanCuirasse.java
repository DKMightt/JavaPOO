package Class.Personnage.Ennemis;

import Class.Personnage.Joueur;
import Class.Personnage.Personnage;

public class TitanCuirasse extends Personnage {
    public String nom = "Titan Cuirassé";
    public int invincible;

    public TitanCuirasse( int hp, int force ) {
        super("Titan Cuirassé", hp, force);
    }

    // Chance de pas prendre de dégats
    public void armureImpenetrable() {

    }
    public void attaquer(Joueur bot){
        System.out.println(bot.nom + " a " +bot.hp + " hp ");
        System.out.println(nom + " met une bavette  sur " + bot.nom);
        bot.hp -= force;
        System.out.println(bot.nom + " a perdu  " +force + " il est donc a :  " + bot.hp);
    }
}
