public class Main {
    public static void main(String[] args) {
        //  Mes Employees
        Employee Amine = new Employee("Chigre","securite","08/03/2025",3000);
        Employee Fadi = new Employee("Aich","Caisse","01/03/2025",7000);
        Employee Anas = new Employee("El badre","Menage","05/03/2025",4500);
        Employee Nawfal = new Employee("lala hrma9a","gher zayd bhal boda","08/03/2025",20000);

        // un seul directeur dans tous le programme (Singleton)
        // on peut l'instance de directeur via la methode " ObtenirInstanceDirecteur() "

        Directeur FADI = Directeur.ObtenirInstanceDirecteur();

        // le directeur peut faire les operations suivantes
        FADI.AjouterEmployee(Amine);
        FADI.AjouterEmployee(Fadi);
        FADI.AjouterEmployee(Anas);
        FADI.AjouterEmployee(Nawfal);
        FADI.AfficherEmployees();
        FADI.SupprimerEmployee("Chigre");

        System.out.println("Salaire Total est : "+FADI.getSalaireTotal());
        System.out.println("Salaire Moyen est : "+FADI.getSalaireMoyen());

    }

}