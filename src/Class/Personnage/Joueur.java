package Class.Personnage;

import Class.Items.Armes.Arme;
import Class.Items.Objets.Nourritures;
import Class.Items.Objets.Objet;
import Class.Items.ObjetsDuJeu;

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
    public void attaquer(Personnage bot){
        System.out.println(bot.nom + " a " +bot.hp + " hp ");
        System.out.println(nom + " met un gros chasser dans le crane de " + bot.nom);
        bot.hp -= force;
        System.out.println(bot.nom + " a perdu  " +force + " il est donc a :  " + bot.hp);
    }
    public void attaquer(Arme equipement, Personnage bot  ){
        for (ObjetsDuJeu objet : inventaire) {
            if (objet instanceof Arme) {
                System.out.println("WSH TU AS UNE ARME SUR TOI");
            }
        }

        System.out.println(bot.nom + " a " + bot.hp + " hp ");
        System.out.println(nom + " zigouille " + bot.nom + " avec " + equipement.getNom());
        int degatsTotal = force + equipement.degats;
        bot.hp -= degatsTotal;
        System.out.println(bot.nom + " a perdu  " + degatsTotal + ". Il lui reste " + bot.hp + " hp");
    }

    public void ajouterItem(ObjetsDuJeu objet){
        if (argent < objet.prix){
            System.out.println("mon gars ta plus de moula on fait comment ");
        }
        else{
            this.inventaire.add(objet);
            argent -= objet.prix;
        }
    }

    public void afficherItem(){
        for (ObjetsDuJeu objet : inventaire) {
            System.out.println("- " + objet.getNom());
        }
    }
}
