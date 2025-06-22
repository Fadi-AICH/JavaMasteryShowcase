public class ConsommationCafe {
    int semaine;
    int programmeurId;
    int nbTasses;

    public ConsommationCafe(int semaine, int programmeurId, int nbTasses) {
        this.semaine = semaine;
        this.programmeurId = programmeurId;
        this.nbTasses = nbTasses;
    }

    public String toString() {
        return "Semaine " + semaine + " - Programmeur ID " + programmeurId + " : " + nbTasses + " tasses";
    }
}

