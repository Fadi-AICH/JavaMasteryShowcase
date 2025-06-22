// Classe représentant le projet de suivi de consommation de café
public class Project {
    private String code;
    private String subject;
    private int duration; // en semaines
    private int maxProgrammers;
    private Programmer[] programmers;
    private int[][] coffeeConsumption; // coffeeConsumption[i][j] : tasses du programmeur i en semaine j
    private int countProg = 0;

    public Project(String code, String subject, int duration, int maxProgrammers) {
        this.code = code;
        this.subject = subject;
        this.duration = duration;
        this.maxProgrammers = maxProgrammers;
        programmers = new Programmer[maxProgrammers];
        coffeeConsumption = new int[maxProgrammers][duration]; // initialisé à 0
    }

    // Ajoute un programmeur dans le tableau
    public boolean addProgrammer(Programmer p) {
        if(countProg < maxProgrammers) {
            programmers[countProg] = p;
            countProg++;
            return true;
        }
        return false;
    }

    // Recherche un programmeur par son identifiant et renvoie son indice
    public int searchProgrammer(String id) {
        for (int i = 0; i < countProg; i++) {
            if (programmers[i].getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }

    // Affiche les informations d’un programmeur dont l’indice est passé en paramètre
    public void displayProgrammer(int index) {
        if(index >= 0 && index < countProg) {
            System.out.println(programmers[index]);
        } else {
            System.out.println("Programmeur non trouvé.");
        }
    }

    // Affiche la liste de tous les programmeurs
    public void displayAllProgrammers() {
        for (int i = 0; i < countProg; i++) {
            System.out.println(programmers[i]);
        }
    }

    // Supprime un programmeur en se basant sur son identifiant
    public boolean deleteProgrammer(String id) {
        int index = searchProgrammer(id);
        if(index == -1) return false;
        // décalage dans le tableau pour supprimer l'élément
        for (int i = index; i < countProg - 1; i++) {
            programmers[i] = programmers[i+1];
            coffeeConsumption[i] = coffeeConsumption[i+1];
        }
        programmers[countProg - 1] = null;
        countProg--;
        return true;
    }

    // Ajoute une consommation de café pour un programmeur pour une semaine donnée (la semaine est numérotée de 1 à duration)
    public boolean addCoffeeConsumption(String programmerId, int week, int cups) {
        int index = searchProgrammer(programmerId);
        if(index == -1) return false;
        if(week < 1 || week > duration) return false;
        coffeeConsumption[index][week - 1] += cups; // incrémentation de la consommation
        return true;
    }

    // Change le bureau d’un programmeur
    public boolean changeOffice(String programmerId, String newOffice) {
        int index = searchProgrammer(programmerId);
        if(index == -1) return false;
        programmers[index].setOffice(newOffice);
        return true;
    }

    // Renvoie le total de tasses de café consommées en une semaine donnée
    public int totalCoffeeInWeek(int week) {
        if(week < 1 || week > duration) return -1;
        int total = 0;
        for (int i = 0; i < countProg; i++) {
            total += coffeeConsumption[i][week - 1];
        }
        return total;
    }

    public int getDuration() {
        return duration;
    }
}
