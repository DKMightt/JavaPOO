package Class.Personnage.Ennemis;

import Class.Personnage.Joueur;
import Class.Personnage.Personnage;
import java.util.Random;

public class TitanCon extends Personnage {
    public String nom = "Titan Con";

    public TitanCon(int hp, int force) {

        super("Titan Con", hp, force);
    }

    // Se met des dégats totalement conssenti losqu'il attaque
    public void attarder(Joueur bot) {
        Random random = new Random();
        int golmon = random.nextInt(2);
        if (golmon == 1) {  // 50% de chance de louper son coup
            System.out.println(nom + " à 80 HP");
            System.out.println(nom + " se cogne la tête sur " + bot.nom);
            bot.hp -= force;
            hp -= force;
            System.out.println(bot.nom + " n'est plus qu'a " + bot.hp + " HP");
            System.out.println(" il reste " + hp + " HP au " + nom);
        } else { // Se blessera dans tout les cas
            System.out.println(nom + " à 80 HP");
            System.out.println(nom + " s'apprête a se cogner la tête sur " + bot.nom);
            hp -= force;
            System.out.println(nom + " a chier dans la colle et a viser a coté ");
            System.out.println(nom + " a clamsé ");
        }
    }
    public void golmonerie(Joueur bot) { // Boost du titan
        Random random = new Random();
           int debile = random.nextInt(2);
           if (debile == 1) { //50% toujours de toucher
               System.out.println(nom + " a " + hp + " HP ");
               System.out.println(nom + " pousse un crie de zinzin ");
               hp = hp + 10;
               System.out.println(nom + " passe a " + hp + " HP ");
           } else { //Ou meurt
               System.out.println(nom + " a " + hp + " HP ");
               System.out.println(nom + " aboie tel un clebard et avale sa langue ");
               hp = 0;
               System.out.println(nom +" s'est littéralement etouffé ");
           }
        }
    }

