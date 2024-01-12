package Class.Personnage;

import Class.Items.Armes.Arme;
import Class.Items.Objets.Nourritures;
import Class.Items.Objets.Objet;
import Class.Items.ObjetsDuJeu;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Joueur extends Personnage {
    public int resistance;
    public int argent = 5;

    public ArrayList<ObjetsDuJeu> inventaire;

    public Joueur(String nom, int hp, int force, int resistance) {
        super(nom, hp, force);
        this.resistance = resistance;
        this.inventaire= new ArrayList<>();
    }

    public Joueur(String nom){
        super(nom);
    }

    public void attaquer(Personnage ennemi) {
        System.out.println("\n----- Début du tour de " + nom + " -----");

        System.out.println(ennemi.nom + " a " + ennemi.hp + " hp ");
        System.out.println(nom + " met un gros chasser dans le crane de " + ennemi.nom);

        ennemi.defendre(this, force);

    }
    public void attaquer(Arme equipement, Personnage bot){
        System.out.println("\n----- Début du tour de " + nom + " -----");

        System.out.println(bot.nom + " a " + bot.hp + " hp ");
        System.out.println("\n" + nom + " zigouille le " + bot.nom + " avec " + equipement.getNom());

        int degatsTotal = force + equipement.degats;
        bot.hp -= degatsTotal;

        System.out.println(bot.nom + " a perdu " + degatsTotal + " hp. Il lui reste " + bot.hp + " hp");

        System.out.println("\n----- Fin du tour -----");
    }

    public void ajouterItem(ObjetsDuJeu objet){ // Ajouter un item dans l'inventaire
        if (argent < objet.prix){ // Si le prix de l'item est supérieur à l'argent du joueur
            System.out.println("mon gars ta plus de moula on fait comment ");
        }
        else{
            this.inventaire.add(objet);
            argent -= objet.prix;
        }
    }

    public void afficherItem(){ // Afficher la liste des items dans l'inventaire
        for (ObjetsDuJeu objet : inventaire) {
            System.out.println("    - " + objet.getNom());
        }
    }
}
