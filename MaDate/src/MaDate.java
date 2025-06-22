public class MaDate {
    private int jour;
    private int mois;
    private int annee;

    MaDate(int J,int M,int A){
        jour  = J ;
        mois  = M ;
        annee = A ;
    }
    //# @Override permet de redefinir la methode toString pour personnaliser l'affichage
    // lors de l'utilisation de System.out.print
    // donc la methode toString existe deja mais on cherche a modifer son comportement
    // lors de l'affichage
    @Override
    public String toString(){
        return (jour<10?"0"+jour:jour)+"/"+(mois<10?"0"+mois:mois)+"/"+annee;
    }

    public static boolean EstBissextile(int annee){
        // annee estBissextile si -> est divisible par 4 mais non par 100 sauf si div par 400
        return annee%4==0 && (annee%100 != 0 || annee%400==0);
        }
    public static Integer NombreJoursMois(int mois,int annee){
        switch(mois){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:return 31;
            case 4:
            case 6:
            case 9:
            case 11:return 30;
            case 2: return EstBissextile(annee)?29:28;
            default: return null;
        }
    }

    public void AjouterJour(){
        if( !(++jour <= NombreJoursMois(mois,annee)) ){
               jour=1;
               if(mois == 12){
                   annee+=mois=1;
                    return;
               }
               mois++;
        }
    }
    public void AjouterPlusieursJours(int n){
        while( n-- != 0){ AjouterJour();}
    }
    public void AjouterUnMois(){
        AjouterPlusieursJours(30);
    }
    public void AjouterUneAnnee(){
        ++annee;
    }
}
