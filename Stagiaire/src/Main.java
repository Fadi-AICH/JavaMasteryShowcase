public class Main {
    public static void main(String[] args) {

        float notesfadi[]    = {20,19,16,17};   //18 ->>>> la moyenne hbibi
        float notesAnas[]    = {16,17,17,18};   //17
        float notesOualid[]  = {16,18,19,15};   //17
        float notesIlyasse[] = {18,16,15,15};   //16

        Stagiaire Fadi    = new Stagiaire("Aich Fadi",notesfadi);
        Stagiaire Anas    = new Stagiaire("Anas Elbadre",notesAnas);
        Stagiaire Oualid  = new Stagiaire("Heirouch Oualid",notesOualid);
        Stagiaire Ilyasse = new Stagiaire("Elhamdouchi Ilyasse",notesIlyasse);

        Stagiaire stagiaires[] = {Fadi,Anas,Oualid,Ilyasse};

        Formation FormationAmazon = new Formation("Amazon",30,stagiaires);
        System.out.println("-> Moyenne Formation : "+FormationAmazon.CalculerMoyenneFormation()+"\n");
        int indiceMax = FormationAmazon.getIndexMax();
        System.out.println("Indice du Stagiaire Ayant la meilleure moyenne dans la formation "+FormationAmazon.getIntitule()+" :"+indiceMax+" -> qui represente "+FormationAmazon.getStagiaire()[indiceMax].getNom());

        FormationAmazon.AfficherNomMax();
        FormationAmazon.AfficherMinMax();
        FormationAmazon.TrouverMoyenneParNom("Aich Fadi");

       /*
        System.out.println("- Note max : "+s.TrouverMax());
        System.out.println("- Note min : "+s.TrouverMin());
        System.out.println("Moyenne est : "+ s.CalculerMoyenne());
       */
    }
}