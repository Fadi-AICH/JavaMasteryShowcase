public class Main {
    public static void main(String[] args) {
        System.out.println("Programme de gestion de fichiers");

        // Créer un répertoire
        Repertoire rep = new Repertoire("Documents");

        // Ajouter des fichiers
        rep.ajouter(new Fichier("file1", "txt", 100));
        rep.ajouter(new Fichier("file2", "pdf", 250));
        rep.ajouter(new Fichier("file3", "jpg", 500));

        // Afficher les fichiers
        rep.afficher();

        // Rechercher un fichier
        int index = rep.rechercher("file2");
        System.out.println("Index of file2: " + index);

        // Afficher les fichiers PDF
        rep.rechercherPDF();

        // Taille totale du répertoire
        System.out.println("Total directory size: " + rep.getTaille() + " Mo");

        // Renommer un fichier
        rep.renommer("file1", "document1");
        rep.afficher();

        // Modifier la taille d'un fichier
        rep.modifierTaille("file3", 600);
        rep.afficher();

        // Supprimer un fichier
        rep.supprimer("file2");
        rep.afficher();
    }
}
