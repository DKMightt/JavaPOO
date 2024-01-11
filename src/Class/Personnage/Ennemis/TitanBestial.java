package Class.Personnage.Ennemis;

import Class.Personnage.Joueur;
import Class.Personnage.Personnage;
import java.util.Random;
public class TitanBestial extends Personnage {

    public String nom = "Titan Bestial";
    // 15 de force
    public int cailloux = 15;

    public TitanBestial(int hp, int force) {
        super("Titan Bestial", hp, force);
    }

    // Dégats aléatoire entre X et X rafales
    public void attaquer(Joueur bot) {
        Random random = new Random();
        int cailloux = random.nextInt(1, 6);
        System.out.println(nom + " va rafaler " + cailloux + " fois " + bot.nom);
        force *= cailloux;
        bot.hp -= force;
        System.out.println(bot.nom + " a prit " + force + " dégats ");
        System.out.println(" il reste " + bot.hp + " HP a " + bot.nom);
        force = 15;
    }

    public void singerie(Joueur bot) {
        force = force += 10;
        System.out.println(nom + " pousse un hurlement bestial et passe a " + force + " d'attaque");
    }
}


