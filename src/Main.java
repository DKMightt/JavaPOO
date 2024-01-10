import Class.Items.Armes.Arme;
import Class.Items.Interactuable;
import Class.Items.Objets.Armure;
import Class.Items.Objets.Nourritures;
import Class.Items.Objets.Testo;
import Class.Personnage.Ennemis.TitanColossal;
import Class.Personnage.Ennemis.TitanCuirasse;
import Class.Personnage.Joueur;
import Class.Personnage.Personnage;

public class Main {
    public static void main(String[] args) {

        Joueur Eren = new Joueur("Eren", 100, 50, new String[]{"Lames","Équipement tri-dimensionnelle"},0);
        Joueur Reiner = new Joueur("Reiner");
        Personnage younes = new Personnage( "bg_sur_pate", 30000, 0);
        Arme Excaliburne =  new Arme( " Excaliburne", 999 , 50 , 1);
        TitanCuirasse invincible = new TitanCuirasse( 200, 50);
        Eren.attaquer(Excaliburne, invincible);
        Eren.attaquer(invincible);
        invincible.attaquer(Eren);
        TitanColossal vaporisation = new TitanColossal(500, 60);
        Eren.attaquer(vaporisation);
        Eren.attaquer(Excaliburne, vaporisation);
        vaporisation.attaquer(Eren);



    }
}