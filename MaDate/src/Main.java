public class Main {
    public static void main(String[] args) {
        // TODO: 7abada law -> Date Invalide Or Not
        // TODO: la generation des getters et setters (Blach gha daya3)

        MaDate MaDateNaissance = new MaDate(19,03,2004);

        MaDateNaissance.AjouterJour();                  // +1
        MaDateNaissance.AjouterPlusieursJours(10);   // +10
                                                       // = 11 Jours
        MaDateNaissance.AjouterUnMois();
        MaDateNaissance.AjouterUneAnnee();
        System.out.println(MaDateNaissance);

    }
}