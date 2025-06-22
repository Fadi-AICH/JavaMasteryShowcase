
package src.java.org.example;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Eleve {
    private final StringProperty code;
    private final StringProperty nom;
    private final StringProperty prenom;
    private final StringProperty niveau;
    private final StringProperty filiere;

    public Eleve(String code, String nom, String prenom, String niveau, String filiere) {
        this.code = new SimpleStringProperty(code);
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.niveau = new SimpleStringProperty(niveau);
        this.filiere = new SimpleStringProperty(filiere);
    }

    public StringProperty codeProperty() { return code; }
    public StringProperty nomProperty() { return nom; }
    public StringProperty prenomProperty() { return prenom; }
    public StringProperty niveauProperty() { return niveau; }
    public StringProperty filiereProperty() { return filiere; }
}
