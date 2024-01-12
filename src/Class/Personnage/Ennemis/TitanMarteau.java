package Class.Personnage.Ennemis;

import Class.Personnage.Personnage;
import Class.Personnage.Joueur;

import java.util.Random;

public class TitanMarteau extends Personnage {

    public String nom = "Titan Marteau";
    public TitanMarteau() {
        super("Titan Marteau", 100, 20);
    }
    public void choixAttaque(Joueur bot){
        Random random = new Random();
        int choixAttaque = random.nextInt(2);
    }

    // Se regenere en fonction des dégats qu'il inflige
    public  void attaquer(Joueur bot) {
        System.out.println("\n----- Début du tour de " + nom + " -----");
        System.out.println(bot.nom + " a " + bot.hp + " hp ");
        System.out.println(nom + " donne un coup de marteau à " + bot.nom);

        int regen = force/2;
        hp += regen;
        System.out.println("\n" + nom + " a stompé " + bot.nom);
        System.out.println(nom + " s'est régénéré " + regen + " HP ");
        System.out.println(nom + " a désormais " + hp + " HP \n");

        bot.defendre(this, force);


    }

        public void spe() { // Boost du titan
            System.out.println(nom + " hurle et enrage son marteau ");
            force = force + 10;
            System.out.println(nom + " possède désormais " + force + " d'attaque ");
        }



}
