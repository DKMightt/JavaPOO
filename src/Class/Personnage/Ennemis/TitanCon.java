package Class.Personnage.Ennemis;

import Class.Personnage.Joueur;
import Class.Personnage.Personnage;
import java.util.Random;

public class TitanCon extends Personnage {
    public String nom = "Titan Con";

    public TitanCon() {

        super("Titan Con", 50, 10);
    }

    // Se met des dégats totalement conssenti losqu'il attaque
    public void attarder(Joueur bot) {
        System.out.println("\n----- Début du tour de " + nom + " -----");

        Random random = new Random();
        int golmon = random.nextInt(2);
        if (golmon == 1) {
            System.out.println(nom + " à 80 HP");
            System.out.println(nom + " se cogne la tête sur " + bot.nom);
            bot.hp -= force;
            hp -= force;

            System.out.println(bot.nom + " a perdu  " + force + " hp");
            System.out.println("Il lui reste "+ bot.hp + " hp");
        } else {
            System.out.println(nom + " à 80 HP");
            System.out.println(nom + " s'apprête a se cogner la tête sur " + bot.nom);
            hp -= force;
            System.out.println(nom + " a chier dans la colle et a viser a coté ");
            System.out.println(nom + " a clamsé ");
        }

        System.out.println("\n----- Fin du tour -----");
    }
    public void golmonerie(Joueur bot) {
        Random random = new Random();
           int debile = random.nextInt(2);
           if (debile == 1) {
               System.out.println(nom + " a " + hp + " HP ");
               System.out.println(nom + " pousse un crie de zinzin ");
               hp = hp + 10;
               System.out.println(nom + " passe a " + hp + " HP ");
           } else {
               System.out.println(nom + " a " + hp + " HP ");
               System.out.println(nom + " aboie tel un clebard et avale sa langue ");
               hp = 0;
               System.out.println(nom +" s'est littéralement etouffé ");
           }
        }
    }

