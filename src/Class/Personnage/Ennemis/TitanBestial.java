package Class.Personnage.Ennemis;

import Class.Personnage.Joueur;
import Class.Personnage.Personnage;
import java.util.Random;
public class TitanBestial extends Personnage {

    public String nom = "Titan Bestial";

    public int cailloux = 15;

    public TitanBestial() {

        super("Titan Bestial", 125, 5);
    }

    // Dégats aléatoire entre X et X rafales
    public void attaquer(Joueur bot) {
        System.out.println("\n----- Début du tour de " + nom + " -----");
        System.out.println(bot.nom + " a " + bot.hp + " hp ");

        Random random = new Random();
        int cailloux = random.nextInt(1, 6);
        int degatsTotal = force *= cailloux;

        System.out.println(nom + " envoie une rafale de pierres " + bot.nom);
        System.out.println(cailloux + " cailloux l'ont touché");

        bot.defendre(this, degatsTotal);

    }

    public void singerie(Joueur bot) {
        force = force += 10;
        System.out.println(nom + " pousse un hurlement bestial et passe a " + force + " d'attaque");
    }
}


