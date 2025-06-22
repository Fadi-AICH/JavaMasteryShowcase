public class TroisPoints {
    private Point premier;
    private Point deuxieme;
    private Point troisieme;

    TroisPoints(Point p1,Point p2,Point p3){
        premier   = p1;
        deuxieme  = p2;
        troisieme = p3;
    }
    public boolean SontAligne(){
    return premier.CalculerDistance(troisieme) == premier.CalculerDistance(deuxieme)+deuxieme.CalculerDistance(troisieme) || deuxieme.CalculerDistance(troisieme) == deuxieme.CalculerDistance(premier)+premier.CalculerDistance(troisieme) || premier.CalculerDistance(deuxieme) == premier.CalculerDistance(troisieme)+troisieme.CalculerDistance(deuxieme);
    }
    public boolean EstIsocele(){
        if(SontAligne()) return false;
     return premier.CalculerDistance(deuxieme) == premier.CalculerDistance(troisieme) || premier.CalculerDistance(deuxieme) == deuxieme.CalculerDistance(troisieme) || deuxieme.CalculerDistance(troisieme) == premier.CalculerDistance(troisieme);
    }

    public Point getPremier() {
        return premier;
    }
    public void setPremier(Point premier) {
        this.premier = premier;
    }
    public Point getDeuxieme() {
        return deuxieme;
    }
    public void setDeuxieme(Point deuxieme) {
        this.deuxieme = deuxieme;
    }
    public Point getTroisieme() {
        return troisieme;
    }
    public void setTroisieme(Point troisieme) {
        this.troisieme = troisieme;
    }
}
