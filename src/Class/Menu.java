package Class;

import Class.Items.Armes.Arme;
import Class.Items.Objets.Armure;
import Class.Items.Objets.Nourritures;
import Class.Items.Objets.Testo;
import Class.Items.ObjetsDuJeu;
import Class.Personnage.Ennemis.TitanCuirasse;
import Class.Personnage.Ennemis.TitanMarteau;
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

    Joueur player = new Joueur(pseudo, 100, 20, 0);


    while (true) {
        System.out.println("===== LOBBY =====");
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
                        Arme epee = new Arme ("(5)excaliburne",2,10,2);
                        player.ajouterItem(epee);
                        break;
                    case 2 :
                        System.out.println("Pas mal le steak halal");
                        Nourritures steak = new Nourritures ("(6)steak halal",1,10);
                        player.ajouterItem(steak);
                        player.gererDurabilite();
                        break;
                    case 3 :
                        System.out.println("Ah OEEE TU JOU SAFE!");
                        Armure shield = new Armure ("(7)Doudoune Nike",1,10);
                        player.ajouterItem(shield);
                        player.gererDurabilite();
                        break;
                    case 4 :
                        System.out.println("Ni Vu Ni Connu");
                        Testo drogue = new Testo ("(8)Héroines",1,2);
                        player.ajouterItem(drogue);
                        player.gererDurabilite();
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
                TitanMarteau ennemis = new TitanMarteau();
                System.out.println("Quelle bail ! Il y a le " + ennemis.nom + " ! Tu dois l'affronter");
                System.out.println("");

                while (player.hp > 0){

                    System.out.println("===== COMBAT =====");
                    System.out.println("1. Attaquer  ");
                    System.out.println("2. Utiliser Items ");

                    int choi = scanner.nextInt();    // Lire le choix de l'utilisateur

                    switch (choi) {
                        case 1:
                            player.attaquer(ennemis);
                            ennemis.attaquer(player);
                            break;
                   // switch (choix) {
                        case 2:

                          System.out.println("choisi un item dans ton inventaire ");
                            player.afficherItem();
                            break;
                            case 5:
                                player.force+=15;
                                player.attaquer(ennemis);
                                player.force-=15;
                                player.gererDurabilite();

                                break;
                            case 6:
                                player.hp+=10;
                                System.out.println("ta " + player.hp + "hp");
                                player.gererDurabilite();
                            break;
                            case 7:
                                   player.resistance+=10;
                                   System.out.println("ton shield est de  " + player.resistance);
                                   player.gererDurabilite();

                                break;
                            case 8:
                                  player.force*=2;
                                  System.out.println("ta plus de force : " + player.force);
                                  player.gererDurabilite();

                                break;
                            default:
                            System.out.println("Fréro c'est pas compliqué 1 OU 2 !!!");
                    }
                    player.gererDurabilite();
                }
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

