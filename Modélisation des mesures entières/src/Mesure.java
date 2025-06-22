public class Mesure{
    private int valeur;
    private static int NbMesures;
    private static double SomMesures;

    public Mesure(int valeur){
        if(!(-100<=valeur && valeur<=100))
            System.out.println(" ! Mesure Hors Intervalle !");
        else {
            this.valeur = valeur; System.out.println("- Mesure Cree...");
            NbMesures++;
            SomMesures+=valeur;
        }
    }
    public int getValeur(){
        return valeur;
    }
    public static void AfficherMoyenne(){
        if(NbMesures==0){System.out.println("!! Zero Mesures !!");return;}
            System.out.print("- La moyenne des "+NbMesures+" Mesures : ");
            System.out.println(SomMesures/NbMesures);
    }
}
