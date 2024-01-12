package Class.Items.Objets;

public interface ObjetsAvecDurabilite {
    void decrementerDurabilite();
    int getDurabilite(); // Ajoutez cette méthode pour obtenir la durabilité
    boolean doitEtreSupprime(); // Ajoutez cette méthode pour vérifier si l'objet doit être supprimé
}

