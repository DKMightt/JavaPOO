package Class;

import Class.Items.Armes.Arme;
import Class.Items.Objets.Armure;
import Class.Items.Objets.Nourritures;
import Class.Items.Objets.Testo;
import Class.Personnage.Ennemis.TitanBestial;
import Class.Personnage.Ennemis.TitanColossal;
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
    String pseudo = scanner.nextLine(); // Variable qui stock le pseudo du joueur

    System.out.println(pseudo + " ? C'est claqué au sol jusqu'au ciel");

    Joueur player = new Joueur( pseudo, 100, 10,0); // Création du joueur


    while (true) {
        System.out.println("\n ===== LOBBY =====");
        System.out.println("1. Acheter des objets  ");
        System.out.println("2. Voir l'inventaire ");
        System.out.println("3. COMMENCER LA PARTIE ");

        // Lire le choix de l'utilisateur
        int choix = scanner.nextInt();

        switch (choix) { // Envoie dans un menu en fonction de la valeur "choix"
            case 1: // Ouvre le menu magasin pour acheter des items

                System.out.println("\n Wsh t'as " + player.argent + " €. Tu veux acheter quoi");
                System.out.println("1. Épée ( 2€ ) / 2. Kefta ( 1€ ) / 3. Armure ( 2€ ) / 4. Guedro ( 4€ ) ");
                int achat = scanner.nextInt();

                switch (achat) { // Créer puis dépose un item dans l'inventaire du joueur en fonction de la valeur "achat"
                    case 1: // Arme Épée
                        System.out.println("\nBien vu l'épée");
                        Arme epee = new Arme ("excaliburne",2,10,2);
                        player.ajouterItem(epee);
                        break;
                    case 2 : // Nourriture Steak
                        System.out.println("\nPas mal le steak halal");
                        Nourritures steak = new Nourritures ("steak halal",1,10);
                        player.ajouterItem(steak);
                        break;
                    case 3 : // Armure Doudoune
                        System.out.println("\nAh OEEE TU JOU SAFE!");
                        Armure shield = new Armure ("Doudoune Nike",1,10);
                        player.ajouterItem(shield);
                        break;
                    case 4 : // Testo drogue
                        System.out.println("\nNi Vu Ni Connu");
                        Testo drogue = new Testo ("Héroines",1,2);
                        player.ajouterItem(drogue);
                        break;
                    default: // Si "choix" contient une valeur pas pris en charge par le switch
                        System.out.println("Azy bouge");
                }
                break;

            case 2: // Affiche l'argent possédé et le contenus de l'inventaire

                System.out.println("\nVotre argent : " + player.argent + " €");
                if (!player.inventaire.isEmpty()) { // Si l'inventaire n'est pas vide, alors l'afficher
                    System.out.println("Vos items :");
                    player.afficherItem();
                }
                break;

            case 3: // Ouvre le menu de combat
                System.out.println("WELCOME TO THE GOUl...");
                TitanColossal titan = new TitanColossal();
                System.out.println(titan.hp);
                System.out.println("Quelle bail ! Il y a le " + titan.nom + " ! Tu dois l'affronter");

                while (true){

                    System.out.println("\n===== COMBAT =====");
                    System.out.println("1. Attaquer  ");
                    System.out.println("2. Utiliser Items ");

                    int choi = scanner.nextInt();    // Lire le choix de l'utilisateur

                    switch (choi) {
                        case 1:
                            player.attaquer(titan);
                            titan.attaquer(player);
                            break;
                        default:
                            System.out.println("Fréro c'est pas compliqué 1 OU 2 !!!");
                    }

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

