package Class.Personnage.Ennemis;

import Class.Personnage.Personnage;
import Class.Personnage.Joueur;
public class TitanColossal extends Personnage {

    public int brulure = 5; // Dégats lorsqu'il est attaqué

    public TitanColossal() {
        super("Titan Colossal", 200, 15);
    }




    public void attaquer(Joueur bot){
        System.out.println("\n----- Début du tour de " + nom + " -----");

        System.out.println(bot.nom + " a " +bot.hp + " hp ");
        System.out.println(nom + " écrase " + bot.nom);

        bot.defendre(this, force);
    }
    public void defendre(Personnage attaquant, int degat) {
        hp -= degat;
        System.out.println(nom + " a perdu " + degat + " hp");
        System.out.println("Il lui reste " + hp + " hp");

        attaquant.hp -= brulure;
        System.out.println(" \nMais le " + nom + " a gazifié " + attaquant.nom + " durant l'attaque");
        System.out.println(attaquant.nom + " a perdu " + brulure + " hp");
        System.out.println("Il lui reste "+ attaquant.hp + " hp");

        System.out.println("----- Fin du tour -----");
    }
}
