package Class.Personnage;

import Class.Items.Armes.Arme;
import Class.Items.Objets.ObjetsAvecDurabilite;
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

    public boolean ajouterItem(ObjetsDuJeu objet){
        if (argent < objet.prix){
            System.out.println("mon gars ta plus de moula on fait comment ");
        }
        else{
            this.inventaire.add(objet);
            argent -= objet.prix;
        }
        return false;
    }

    public void afficherItem(){
        for (ObjetsDuJeu objet : inventaire) {
            System.out.println("-" + objet.getNom());
        }
    }
    public void gererDurabilite() {
        ArrayList<ObjetsDuJeu> objetsASupprimer = new ArrayList<>();

        for (ObjetsDuJeu item : inventaire) {
            if (item instanceof ObjetsAvecDurabilite) {
                ((ObjetsAvecDurabilite) item).decrementerDurabilite();

                if (((ObjetsAvecDurabilite) item).doitEtreSupprime()) {
                    System.out.println("L'objet " + item.getNom() + " est épuisé et disparaît !");
                    objetsASupprimer.add(item);
                }
            }
        }

        // Supprimer les objets épuisés
        for (ObjetsDuJeu item : objetsASupprimer) {
            retirerItem(item);
        }
    }


    private void retirerItem(ObjetsDuJeu item) {
    }
}
