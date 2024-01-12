package Class.Personnage.Ennemis;

import Class.Personnage.Joueur;
import Class.Personnage.Personnage;
import java.util.Random;

public class TitanCuirasse extends Personnage {
    public String nom = "Titan Cuirassé";
    Random random = new Random();
    int invincible = random.nextInt(2);

    public TitanCuirasse() {

        super("Titan Cuirassé", 100, 20);
    }

    // Chance de pas prendre de dégats
    public void armureImpenetrable() {

    }
    public void attaquer(Joueur bot){
        System.out.println("\n----- Début du tour de " + nom + " -----");

        System.out.println(bot.nom + " a " +bot.hp + " hp ");
        System.out.println(nom + " met une bavette sur " + bot.nom);

        bot.defendre(this, force);
    }
    public void defendre(Personnage attaquant, int degat) {
        Random random = new Random();
        int invincible = random.nextInt(3);

        if (invincible == 0){
            System.out.println(nom + " est rock solid, il annule les dégats ");
            System.out.println("il garde ses " + hp + " hp");
        } else {
            hp -= degat;
            System.out.println(nom + " a perdu " + degat + " hp");
            System.out.println("Il lui reste " + hp + " hp");
            System.out.println("----- Fin du tour -----");
        }
    }
    public void attaque2(Joueur bot){
        bot.hp -= force *= 1.5;
        System.out.println(force);
        System.out.println(bot.nom + " " + bot.hp);

    }
}
