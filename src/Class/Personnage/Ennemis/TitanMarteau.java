package Class.Personnage.Ennemis;

import Class.Personnage.Personnage;
import Class.Personnage.Joueur;
public class TitanMarteau extends Personnage {
    public String nom = "Titan Marteau";
    public int regeneration;

    public TitanMarteau( int hp, int force) {
        super("Titan Marteau", hp, force);
    }

    // Se regenere en fonction des dégats qu'il inflige
    public  void attaquer(Joueur bot) {
        bot.hp -= force;
        System.out.println(nom + " a stompé " + bot.nom);
        System.out.println(bot.nom + " est a " + bot.hp + " HP ");
        hp += force/2; // Se regenere 50% de sa force
        System.out.println(nom + " s'est régénéré et est donc a " + hp + " HP ");
    }
    public void enragement(Joueur bot) { // Boost du titan
        System.out.println(nom + " hurle et enrage son marteau ");
        force = force + 10;
        System.out.println(nom + " possède désormais " + force + " d'attaque ");
    }

}
