public class GestionEmployes{
    private Employee Employees[];
    private int NombreEmployees;

    GestionEmployes(int tailleListe){
        Employees =  new Employee[tailleListe];
    }
    public int RechercherEmployee(String Nom){
        for(int i=0;i<NombreEmployees;i++){
            if(Employees[i].getNom().equals(Nom)){
                return i;
            }
        }
        System.out.println("Employee "+Nom+" Introuvable !!");
        return -1;
    }
    public void AjouterEmployee(Employee E){
        if(NombreEmployees==Employees.length){
            System.out.println("!! Espace Inssufisant !!");
            return;
        }
         Employees[NombreEmployees++] = E;
        System.out.println("Employee Ajouter avec succes... ");
    }
    public void SupprimerEmployee(String Nom){
        int indice = RechercherEmployee(Nom);
        if(indice != -1){
            for(int i=indice ;i<NombreEmployees-1;i++){
                Employees[i] = Employees[i+1];
            }
        NombreEmployees--;
            System.out.println("->>>>> Suppression est bien effectue...");
        }
    }
    public void AfficherEmployees(){
        if(NombreEmployees == 0){
            System.out.println("!! Aucun Employees !!");
            return ;
        }
        System.out.println(" L'ensemble des employees : ");
            for(int i=0;i<NombreEmployees;i++){
                Employees[i].AfficherInfosEmployee();
            }

    }
    public double SalaireTotal(){
        int salaireTotal = 0;
        for(int i=0;i<NombreEmployees;i++){
            salaireTotal+=Employees[i].getSalaire();
        }
    return salaireTotal;
    }
    public Double SalaireMoyen(){
        return NombreEmployees != 0 ? SalaireTotal()/NombreEmployees : null;
    }

}
