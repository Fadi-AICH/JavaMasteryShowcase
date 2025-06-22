// Classe représentant un programmeur
public class Programmer {
    private String id;
    private String name;
    private String office;

    public Programmer(String id, String name, String office) {
        this.id = id;
        this.name = name;
        this.office = office;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getOffice() {
        return office;
    }
    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nom: " + name + ", Bureau: " + office;
    }
}

