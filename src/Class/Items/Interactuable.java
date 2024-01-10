package Class.Items;

import Class.Items.Objets.Armure;
import Class.Items.Objets.Nourritures;
import Class.Items.Objets.Objet;
import Class.Items.Objets.Testo;
import Class.Personnage.Joueur;
import Class.Personnage.Personnage;

public interface Interactuable {
    public default void RamasserNourritures(Personnage player){
        System.out.println(player.nom + " récupère l'item suivant : " + Nourritures.nom  );

    };
    public default void UtiliserNourritures(Personnage player){

        player.hp += Nourritures.bonus;
        System.out.println(player.nom + " démollit le " + Nourritures.nom);

    };
    public default void RamasserTesto(Personnage player){

        System.out.println(player.nom + " récupère l'item suivant : " + Testo.nom);
    }

    public default void UtiliserTesto(Personnage player){

        player.force += Testo.bonus;
        System.out.println(player.nom + " englouti la " + Testo.nom);
    }
    public default void RamasserArmure(Joueur player){

        System.out.println(player.nom + " récupère l'item suivant : " + Armure.nom);
    }

    public default void UtiliserArmure(Joueur player){

        player.resistance += Armure.bonus;
        System.out.println(player.nom + " tabasse la " + Armure.nom);
    }
}
