public class Directeur{
      private static Directeur IlyasseElhamdouchi = new Directeur();
      private GestionEmployes SystemGestion;

      private Directeur(){
          SystemGestion = new GestionEmployes(4);
      }
      public void setSystemGestion(GestionEmployes systemGestion) {
         SystemGestion = systemGestion;
      }
      public static Directeur ObtenirInstanceDirecteur(){
          return IlyasseElhamdouchi;
      }
      public double getSalaireTotal(){
          return SystemGestion.SalaireTotal();
      }
      public double getSalaireMoyen(){
          return SystemGestion.SalaireMoyen();
      }
      public void AjouterEmployee(Employee Emp){
        SystemGestion.AjouterEmployee(Emp);
      }
      public void AfficherEmployees(){
          SystemGestion.AfficherEmployees();
      }
      public void SupprimerEmployee(String Nom){
        SystemGestion.SupprimerEmployee(Nom);
      }
}
