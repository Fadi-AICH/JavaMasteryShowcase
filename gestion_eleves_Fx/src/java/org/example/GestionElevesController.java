
package src.java.org.example;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class GestionElevesController {

    @FXML private TextField codeField, nomField, prenomField, niveauField, filiereField;
    @FXML private TableView<Eleve> tableView;
    @FXML private TableColumn<Eleve, String> codeCol, nomCol, prenomCol, niveauCol, filiereCol;

    private ObservableList<Eleve> eleves = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        codeCol.setCellValueFactory(data -> data.getValue().codeProperty());
        nomCol.setCellValueFactory(data -> data.getValue().nomProperty());
        prenomCol.setCellValueFactory(data -> data.getValue().prenomProperty());
        niveauCol.setCellValueFactory(data -> data.getValue().niveauProperty());
        filiereCol.setCellValueFactory(data -> data.getValue().filiereProperty());

        tableView.setItems(eleves);
    }

    @FXML
    public void handleAjouter() {
        Eleve e = new Eleve(
            codeField.getText(),
            nomField.getText(),
            prenomField.getText(),
            niveauField.getText(),
            filiereField.getText()
        );
        eleves.add(e);
        codeField.clear();
        nomField.clear();
        prenomField.clear();
        niveauField.clear();
        filiereField.clear();
    }
}
