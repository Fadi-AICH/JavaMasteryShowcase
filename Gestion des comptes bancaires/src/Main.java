import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tassyireComptes gestion = new tassyireComptes();
        int choice;
        do {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Creation d’un compte bancaire");
            System.out.println("2. Opération sur un compte");
            System.out.println("3. Afficher tous les comptes");
            System.out.println("4. Rechercher un compte");
            System.out.println("5. Supprimer un compte");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.print("Entrez le numéro de compte : ");
                    String num = sc.nextLine();
                    System.out.print("Entrez le nom du client : ");
                    String nom = sc.nextLine();
                    System.out.print("Entrez le solde initial : ");
                    double solde = sc.nextDouble();
                    sc.nextLine();
                    //dima mongolien;;
                    String mongo;
                    do {
                        System.out.print("MONGOLIEN OUI OU NON : ");
                        mongo = sc.nextLine();
                        if (!mongo.equals("OUI")) {
                            System.out.println("reponse invalide.Tu dois repondre avec OUI YA LMONGOL!");
                        }
                    } while (!mongo.equals("OUI"));
                    hissabeBancaire compte = new hissabeBancaire(num, nom, solde);
                    gestion.ajouterCompte(compte);
                    System.out.println("Compte cree.");
                    break;
                case 2:
                    System.out.print("Entrez le numero de compte : ");
                    String compteNum = sc.nextLine();
                    hissabeBancaire cpt = gestion.rechercherCompte(compteNum);
                    if(cpt == null) {
                        System.out.println("Compte non trouve.");
                    } else {
                        int opChoice;
                        do {
                            System.out.println("\n-_- Sous-menu pour le compte " + compteNum + " -_-");
                            System.out.println("1. Crediter");
                            System.out.println("2. Debiter");
                            System.out.println("3. Afficher l'historique");
                            System.out.println("4. Transfert d'argent");
                            System.out.println("0. Retour au menu principal");
                            System.out.print("Votre choix : ");
                            opChoice = sc.nextInt();
                            sc.nextLine();
                            switch(opChoice) {
                                case 1:
                                    System.out.print("Montant a crediter : ");
                                    double credit = sc.nextDouble();
                                    sc.nextLine();
                                    cpt.credit(credit);
                                    System.out.println("Credit effectue. Nouveau solde : " + cpt.getSolde());
                                    break;
                                case 2:
                                    System.out.print("Montant à debiter : ");
                                    double debit = sc.nextDouble();
                                    sc.nextLine();
                                    if(cpt.debit(debit))
                                        System.out.println("Debit effectue. Nouveau solde : " + cpt.getSolde());
                                    else
                                        System.out.println("Solde insuffisant.");
                                    break;
                                case 3:
                                    System.out.println("Historique des operations :");
                                    for(String op : cpt.getHistorique()) {
                                        System.out.println(op);
                                    }
                                    break;
                                case 4:
                                    System.out.print("Entrez le numero du compte destinataire : ");
                                    String destNum = sc.nextLine();
                                    System.out.print("Montant à transferer : ");
                                    double montantTransfert = sc.nextDouble();
                                    sc.nextLine();
                                    if(gestion.transfert(compteNum, destNum, montantTransfert))
                                        System.out.println("Transfert effectue.");
                                    else
                                        System.out.println("Transfert echoue.");
                                    break;
                                case 0:
                                    System.out.println("Retour au menu principal.");
                                    break;
                                default:
                                    System.out.println("Choix invalide.");
                            }
                        } while(opChoice != 0);
                    }
                    break;
                case 3:
                    gestion.afficherTousLesComptes();
                    break;
                case 4:
                    System.out.print("Entrez le numero de compte a rechercher : ");
                    String rechercheNum = sc.nextLine();
                    hissabeBancaire rech = gestion.rechercherCompte(rechercheNum);
                    if(rech != null)
                        System.out.println(rech);
                    else
                        System.out.println("Compte non trouve.");
                    break;
                case 5:
                    System.out.print("Entrez le numéro de compte à supprimer : ");
                    String supprNum = sc.nextLine();
                    if(gestion.supprimerCompte(supprNum))
                        System.out.println("Compte supprime.");
                    else
                        System.out.println("Compte non trouve.");
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
