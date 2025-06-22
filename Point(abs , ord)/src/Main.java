public class Main {
    public static void main(String[] args) {

// NB. 3 points alignes -> ne represente pas un triangle isocele ( rah bayna )

        // On prend ces points de l'espace
        Point CentreCercle = new Point(0,8);
        Point PointEspace = new Point(0,12);
        Point AutrePointEspace = new Point(0,16);

        System.out.println(CentreCercle);
        System.out.println(CentreCercle.CalculerDistance(PointEspace));
        Point Milieu = CentreCercle.CalculerMilieu(PointEspace);
        System.out.println("Milieur de "+CentreCercle+" et "+PointEspace+" est : "+ Milieu);

        TroisPoints TroixPointsEnEspace = new TroisPoints(CentreCercle,PointEspace,AutrePointEspace);
        System.out.println(" Est Une Droite ? : "+ TroixPointsEnEspace.SontAligne());
        System.out.println(" Est Isocele ? : "+TroixPointsEnEspace.EstIsocele());
    }
}