package Class.Personnage.Ennemis;

import Class.Personnage.Joueur;
import Class.Personnage.Personnage;
import java.util.Random;

public class TitanCuirasse extends Personnage {
    public String nom = "Titan Cuirassé";
    Random random = new Random();
    int invincible = random.nextInt(2);

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
    public void defendre(Joueur bot){

        Random random = new Random();
        int invincible = random.nextInt(3);
        if (invincible == 0){
            System.out.println(nom + " est rock solid, il annule les dégats ");
            hp += bot.force;
            System.out.println("il lui reste donc " + hp);
            }
    }

}
