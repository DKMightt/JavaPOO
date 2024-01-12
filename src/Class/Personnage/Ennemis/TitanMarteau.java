package Class.Personnage.Ennemis;

import Class.Personnage.Personnage;
import Class.Personnage.Joueur;
public class TitanMarteau extends Personnage {

    public String nom = "Titan Marteau";
    public TitanMarteau() {
        super("Titan Marteau", 100, 20);
    }

    // Se regenere en fonction des dégats qu'il inflige
    public  void attaquer(Joueur bot) {
        System.out.println("\n----- Début du tour de " + nom + " -----");
        System.out.println(bot.nom + " a " + bot.hp + " hp ");
        System.out.println(nom + " donne un coup de marteau à " + bot.nom);

        bot.defendre(this, force);

        int regen = force/2;
        hp += regen;
        System.out.println(nom + " a stompé " + bot.nom);
        System.out.println(nom + " s'est régénéré " + regen + " HP ");
        System.out.println(nom + " a désormais " + hp + " HP ");




    }
}
