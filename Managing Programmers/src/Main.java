import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Projet projet = new Projet(101, "Développement Java", 12);
        Scanner scanner = new Scanner(System.in);

        projet.ajouterProgrammeur(new Programmeur(1, "Aich", "FADI", 205));
        projet.ajouterProgrammeur(new Programmeur(2, "Ilyasse", "Elhamdouchi", 566));

        while (true) {
            System.out.println("\nMenu :");
            System.out.println("1. Ajouter un programmeur");
            System.out.println("2. Rechercher un programmeur");
            System.out.println("3. Afficher un programmeur");
            System.out.println("4. Afficher tous les programmeurs");
            System.out.println("5. Supprimer un programmeur");
            System.out.println("6. Ajouter une consommation de café");
            System.out.println("7. Changer le bureau d’un programmeur");
            System.out.println("8. Afficher le nombre total de tasses de café en une semaine");
            System.out.println("9. Quitter");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nom: ");
                    String nom = scanner.nextLine();
                    System.out.print("Prénom: ");
                    String prenom = scanner.nextLine();
                    System.out.print("Bureau: ");
                    int bureau = scanner.nextInt();
                    projet.ajouterProgrammeur(new Programmeur(id, nom, prenom, bureau));
                    break;

                case 2:
                    System.out.print("ID du programmeur: ");
                    int idRecherche = scanner.nextInt();
                    projet.afficherProgrammeur(idRecherche);
                    break;

                case 3:
                    System.out.print("ID du programmeur: ");
                    int idAfficher = scanner.nextInt();
                    projet.afficherProgrammeur(idAfficher);
                    break;

                case 4:
                    projet.afficherProgrammeurs();
                    break;

                case 5:
                    System.out.print("ID du programmeur à supprimer: ");
                    int idSupprimer = scanner.nextInt();
                    projet.supprimerProgrammeur(idSupprimer);
                    break;

                case 6:
                    System.out.print("Semaine: ");
                    int semaine = scanner.nextInt();
                    System.out.print("ID du programmeur: ");
                    int idProg = scanner.nextInt();
                    System.out.print("Nombre de tasses: ");
                    int tasses = scanner.nextInt();
                    projet.ajouterConsommation(semaine, idProg, tasses);
                    break;

                case 7:
                    System.out.print("ID du programmeur: ");
                    int idBureau = scanner.nextInt();
                    System.out.print("Nouveau bureau: ");
                    int nouveauBureau = scanner.nextInt();
                    projet.changerBureau(idBureau, nouveauBureau);
                    break;

                case 8:
                    System.out.print("Semaine: ");
                    int semaineTotal = scanner.nextInt();
                    projet.afficherTotalCafesParSemaine(semaineTotal);
                    break;

                case 9:
                    System.out.println("Fermeture...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Option invalide !");
            }
        }
    }
}
