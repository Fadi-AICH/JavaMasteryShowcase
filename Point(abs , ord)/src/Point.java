import static java.lang.Math.*;

public class Point {
    private double abs;
    private double ord;

    Point(double a , double o){
        abs = a;
        ord = o;
    }
    public double getAbs() {
        return abs;
    }
    public void setAbs(double abs) {
        this.abs = abs;
    }
    public double getOrd() {
        return ord;
    }
    public void setOrd(double ord) {
        this.ord = ord;
    }

    // NB. a ce stade on a redefinie la methode toString.
    // -> C'est comme dire voila comment je veux System.out.print affiche mon
    //   objet de type point.
    @Override
    public String toString(){
        return "( "+abs+" , "+ord+" )";
    }
    public double CalculerDistance(Point P){
        return sqrt((abs-P.abs)*(abs-P.abs)+(ord-P.ord)*(ord-P.ord));
    }
    public Point CalculerMilieu(Point P){
        return new Point((abs+P.abs)/2,(ord+P.ord)/2);
    }
}
