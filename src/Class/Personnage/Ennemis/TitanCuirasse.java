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


    }
    public void attaquer(Joueur bot){ // 1er Attaque du titan
        System.out.println(bot.nom + " a " +bot.hp + " hp ");
        System.out.println(nom + " met une bavette  sur " + bot.nom);
        bot.hp -= force;
        System.out.println(bot.nom + " a perdu  " +force + " il est donc a :  " + bot.hp);
    }
    public void defendre(Joueur bot){ // Passif annulation des degats

        Random random = new Random();
        int invincible = random.nextInt(3);
        if (invincible == 0){
            System.out.println(nom + " est rock solid, il annule les dégats ");
            hp += bot.force;
            System.out.println("il lui reste donc " + hp);
            }
    }
    public void charge(Joueur bot){ // 2e Attaque du titan
        bot.hp -= force *= 1.5;
        System.out.println(force);
        System.out.println(bot.nom + " " + bot.hp);

    }
}
