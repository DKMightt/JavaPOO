package Class.Personnage;

public class Personnage {
    public String nom;
    public int hp;
    public int force;
 
    public Personnage(String nom, int hp, int force) {
        this.nom = nom;
        this.hp = hp;
        this.force = force;
    }

    public Personnage(String nom) {
        this.nom = nom;
    }

    public Personnage(int hp, int force) {
        this.hp = hp;
        this.force = force;
    }


    public void infos(){
        System.out.println(nom + " HP : " + hp + " Force : " + force);
    }
    public void attaquer(Joueur eren) {
    }
    public void defendre(Personnage attaquant, int degat) {
        hp -= degat;
        System.out.println(nom + " a perdu " + degat + " hp");
        System.out.println("Il lui reste " + hp + " hp");

        System.out.println("----- Fin du tour -----");

    }
}
