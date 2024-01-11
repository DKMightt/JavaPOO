import Class.Items.Interactuable;
import Class.Items.Objets.Armure;
import Class.Items.Objets.Nourritures;
import Class.Items.Objets.Testo;
import Class.Personnage.Joueur;
import Class.Personnage.Personnage;

public class Main {
    public static void main(String[] args) {

        Joueur Eren = new Joueur("Eren", 100, 50, new String[]{"Lames","Équipement tri-dimensionnelle"},0);
        Testo PotionDeForce = new Testo("Potion de Force", 1, 10);
        PotionDeForce.RamasserTesto(Eren);
        System.out.println("Force : " + Eren.force);
        PotionDeForce.UtiliserTesto(Eren);
        System.out.println("Force : " +Eren.force);
        Nourritures Steak = new Nourritures("Steak Halal", 100, 15);
        Steak.RamasserNourritures(Eren);
        System.out.println(" Nourriture : " + Eren.hp);

        Steak.UtiliserNourritures(Eren);               ;
        System.out.println(" Nourriture : " + Eren.hp);
        Armure PotionArmure = new Armure("Potion d'Armure", 1, 15);
        PotionArmure.RamasserArmure(Eren);
        System.out.println(" Armure : " + Eren.resistance);
        PotionArmure.UtiliserArmure(Eren);
        System.out.println(" Armure : " + Eren.resistance);

    }
}