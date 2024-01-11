package Class.Items;

import Class.Items.Objets.Armure;
import Class.Items.Objets.Nourritures;
import Class.Items.Objets.Testo;
import Class.Personnage.Joueur;

public interface Interactuable {

    /*
    public default void RamasserNourritures(Joueur player, Nourritures nourriture){
        System.out.println(player.nom + " récupère l'item suivant : " + nourriture.getNom());
    }

    public default void UtiliserNourritures(Joueur player, Nourritures nourriture){
        player.hp += nourriture.getBonus();
        System.out.println(player.nom + " démollit le " + nourriture.getNom());
    }

    public default void RamasserTesto(Joueur player, Testo testo){
        System.out.println(player.nom + " récupère l'item suivant : " + testo.getNom());
    }

    public default void UtiliserTesto(Joueur player, Testo testo){
        player.force += testo.getBonus();
        System.out.println(player.nom + " englouti la " + testo.getNom());
    }

    public default void RamasserArmure(Joueur player, Armure armure){
        System.out.println(player.nom + " récupère l'item suivant : " + armure.getNom());
    }

    public default void UtiliserArmure(Joueur player, Armure armure){
        player.resistance += armure.getBonus();
        System.out.println(player.nom + " tabasse la " + armure.getNom());
    }

    */
}
