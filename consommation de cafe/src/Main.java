// Classe principale de l'application de gestion de consommation de café
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Project project = null;
        int choice;
        do {
            System.out.println("\n=== Menu Gestion Consommation de Café ===");
            System.out.println("1. Créer un projet");
            System.out.println("2. Ajouter un programmeur");
            System.out.println("3. Rechercher un programmeur");
            System.out.println("4. Afficher un programmeur");
            System.out.println("5. Afficher la liste des programmeurs");
            System.out.println("6. Supprimer un programmeur");
            System.out.println("7. Ajouter une consommation de café à un programmeur");
            System.out.println("8. Changer le bureau d'un programmeur");
            System.out.println("9. Afficher le total de tasses de café consommées en une semaine donnée");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choice = sc.nextInt();
            sc.nextLine(); // consomme le saut de ligne
            switch(choice) {
                case 1:
                    System.out.print("Code du projet : ");
                    String code = sc.nextLine();
                    System.out.print("Sujet du projet : ");
                    String subject = sc.nextLine();
                    System.out.print("Durée (en semaines) : ");
                    int duration = sc.nextInt();
                    System.out.print("Nombre de programmeurs : ");
                    int nbProg = sc.nextInt();
                    sc.nextLine();
                    project = new Project(code, subject, duration, nbProg);
                    System.out.println("Projet créé avec succès.");
                    break;
                case 2:
                    if(project == null) {
                        System.out.println("Créez d'abord un projet.");
                        break;
                    }
                    System.out.print("ID du programmeur : ");
                    String id = sc.nextLine();
                    System.out.print("Nom du programmeur : ");
                    String name = sc.nextLine();
                    System.out.print("Bureau : ");
                    String office = sc.nextLine();
                    Programmer p = new Programmer(id, name, office);
                    if(project.addProgrammer(p))
                        System.out.println("Programmeur ajouté.");
                    else
                        System.out.println("Liste des programmeurs pleine.");
                    break;
                case 3:
                    if(project == null) {
                        System.out.println("Créez d'abord un projet.");
                        break;
                    }
                    System.out.print("Entrez l'ID du programmeur à rechercher : ");
                    String searchId = sc.nextLine();
                    int index = project.searchProgrammer(searchId);
                    if(index == -1)
                        System.out.println("Programmeur non trouvé.");
                    else
                        System.out.println("Programmeur trouvé à l'indice : " + index);
                    break;
                case 4:
                    if(project == null) {
                        System.out.println("Créez d'abord un projet.");
                        break;
                    }
                    System.out.print("Entrez l'ID du programmeur à afficher : ");
                    String affId = sc.nextLine();
                    index = project.searchProgrammer(affId);
                    if(index == -1)
                        System.out.println("Programmeur non trouvé.");
                    else
                        project.displayProgrammer(index);
                    break;
                case 5:
                    if(project == null) {
                        System.out.println("Créez d'abord un projet.");
                        break;
                    }
                    project.displayAllProgrammers();
                    break;
                case 6:
                    if(project == null) {
                        System.out.println("Créez d'abord un projet.");
                        break;
                    }
                    System.out.print("Entrez l'ID du programmeur à supprimer : ");
                    String delId = sc.nextLine();
                    if(project.deleteProgrammer(delId))
                        System.out.println("Programmeur supprimé.");
                    else
                        System.out.println("Programmeur non trouvé.");
                    break;
                case 7:
                    if(project == null) {
                        System.out.println("Créez d'abord un projet.");
                        break;
                    }
                    System.out.print("Entrez l'ID du programmeur : ");
                    String progId = sc.nextLine();
                    System.out.print("Entrez la semaine (1 à " + project.getDuration() + ") : ");
                    int week = sc.nextInt();
                    System.out.print("Nombre de tasses : ");
                    int cups = sc.nextInt();
                    sc.nextLine();
                    if(project.addCoffeeConsumption(progId, week, cups))
                        System.out.println("Consommation ajoutée.");
                    else
                        System.out.println("Erreur lors de l'ajout de la consommation.");
                    break;
                case 8:
                    if(project == null) {
                        System.out.println("Créez d'abord un projet.");
                        break;
                    }
                    System.out.print("Entrez l'ID du programmeur : ");
                    String progId2 = sc.nextLine();
                    System.out.print("Nouveau bureau : ");
                    String newOffice = sc.nextLine();
                    if(project.changeOffice(progId2, newOffice))
                        System.out.println("Bureau modifié.");
                    else
                        System.out.println("Programmeur non trouvé.");
                    break;
                case 9:
                    if(project == null) {
                        System.out.println("Créez d'abord un projet.");
                        break;
                    }
                    System.out.print("Entrez la semaine (1 à " + project.getDuration() + ") : ");
                    int weekNum = sc.nextInt();
                    sc.nextLine();
                    int total = project.totalCoffeeInWeek(weekNum);
                    if(total == -1)
                        System.out.println("Semaine invalide.");
                    else
                        System.out.println("Total de tasses de café en semaine " + weekNum + " : " + total);
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        } while(choice != 0);
        sc.close();
    }
}
