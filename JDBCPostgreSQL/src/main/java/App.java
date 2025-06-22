package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;

public class App extends Application {

    private final String url = "jdbc:postgresql://localhost:5432/fadidb";
    private final String user = "postgres";
    private final String password = "fadidb";

    private ListView<String> listView = new ListView<>();

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        TextField nameField = new TextField();
        nameField.setPromptText("Nom");

        TextField ageField = new TextField();
        ageField.setPromptText("Âge");

        Button addButton = new Button("Ajouter");
        addButton.setOnAction(e -> {
            String nom = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            ajouterUtilisateur(nom, age);
            afficherUtilisateurs();
            nameField.clear();
            ageField.clear();
        });

        VBox root = new VBox(10, nameField, ageField, addButton, listView);
        root.setPadding(new Insets(15));

        stage.setTitle("Utilisateurs PostgreSQL");
        stage.setScene(new Scene(root, 300, 400));
        stage.show();

        afficherUtilisateurs();
    }

    private void afficherUtilisateurs() {
        listView.getItems().clear();
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "SELECT nom, age FROM utilisateurs";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                listView.getItems().add("👤 " + rs.getString("nom") + " (" + rs.getInt("age") + " ans)");
            }
        } catch (SQLException e) {
            listView.getItems().add("❌ Erreur : " + e.getMessage());
        }
    }

    private void ajouterUtilisateur(String nom, int age) {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "INSERT INTO utilisateurs(nom, age) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nom);
            ps.setInt(2, age);
            ps.executeUpdate();
        } catch (SQLException e) {
            listView.getItems().add("❌ Insertion échouée : " + e.getMessage());
        }
    }
}

