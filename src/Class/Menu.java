package Class;

import Class.Items.Armes.Arme;
import Class.Items.Objets.Armure;
import Class.Items.Objets.Nourritures;
import Class.Items.Objets.Testo;
import Class.Personnage.Joueur;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {

    System.out.println("BIENVENUE DANS NOTRE JEU ! VEUILLEZ ENTRER VOTRE PSEUDO ");
    Scanner scanner = new Scanner(System.in);
    String pseudo = scanner.nextLine();

    System.out.println(pseudo + " ? C'est claqué au sol jusqu'au ciel");

    Joueur player = new Joueur( pseudo, 100, 10,0);


    while (true) {
        System.out.println("==== LOBBY ====");
        System.out.println("1. Acheter des objets  ");
        System.out.println("2. Voir l'inventaire ");
        System.out.println("3. COMMENCER LA PARTIE ");

        // Lire le choix de l'utilisateur
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:

                System.out.println("Wsh t'as " + player.argent + " €. Tu veux acheter quoi");
                System.out.println("1. Épée ( 2€ ) / 2. Kefta ( 1€ ) / 3. Armure ( 2€ ) / 4. Guedro ( 4€ ) ");
                int achat = scanner.nextInt();

                switch (achat) {
                    case 1:
                        System.out.println("Bien vu l'épée");
                        Arme epee = new Arme ("excaliburne",2,10,2);
                        player.ajouterItem(epee);
                        break;
                    case 2 :
                        System.out.println("Pas mal le steak halal");
                        Nourritures steak = new Nourritures ("steak halal",1,10);
                        player.ajouterItem(steak);
                        break;
                    case 3 :
                        System.out.println("Ah OEEE TU JOU SAFE!");
                        Armure shield = new Armure ("Doudoune Nike",1,10);
                        player.ajouterItem(shield);
                        break;
                    case 4 :
                        System.out.println("Ni Vu Ni Connu");
                        Testo drogue = new Testo ("Héroines",1,2);
                        player.ajouterItem(drogue);
                        break;
                    default:
                        System.out.println("Azy bouge");
                }
                break;
            case 2:
                System.out.println("Votre argent : " + player.argent + " €");
                if (!player.inventaire.isEmpty()) { //verifie taille de l'inventaire
                    System.out.println("Vos items :");
                    player.afficherItem();
                }
                break;
            case 3:
                System.out.println("WELCOME TO THE GOUl...");
                break;
            default:
                System.out.println("Option invalide. Veuillez choisir à nouveau.");
        }
    }
    }

    private static void creerPersonnage() {
        // Logique pour créer un personnage
        System.out.println("Personnage créé !");
    }

    private static void jouerAuJeu() {
        // Logique pour jouer au jeu
        System.out.println("Jeu en cours...");
    }

    private static void acheterDesObjets() {
        // Logique pour acheter des objets
        System.out.println("Objets achetés !");
    }
}

