import Class.Items.Armes.Arme;
import Class.Items.Interactuable;
import Class.Items.Objets.Armure;
import Class.Items.Objets.Nourritures;
import Class.Items.Objets.Testo;
import Class.Personnage.Ennemis.TitanBestial;
import Class.Personnage.Ennemis.TitanCuirasse;
import Class.Personnage.Joueur;
import Class.Personnage.Personnage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Joueur Eren = new Joueur("Eren", 100, 50,0);
        Joueur Reiner = new Joueur("Reiner");
        Personnage younes = new Personnage( "bg_sur_pate", 30000, 0);
        Arme Excaliburne =  new Arme( " Excaliburne", 999 , 50 , 1);
        TitanCuirasse invincible = new TitanCuirasse();

    }}