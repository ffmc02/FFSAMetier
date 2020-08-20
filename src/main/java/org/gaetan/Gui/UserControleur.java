package org.gaetan.Gui;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import org.gaetan.DAO.*;
import org.gaetan.Gui.UserControleur;
import org.kordamp.ikonli.fontawesome.FontAwesome;
import org.kordamp.ikonli.javafx.FontIcon;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
public class UserControleur implements Initializable{
@FXML
TableView<Competition>OpenCompetition;
@FXML
TableColumn<Competition, String > NameOfCompetion;
    @FXML
    TableColumn<Competition, String > CompettionType;
    @FXML
    TableColumn<Competition, String > Localisation;
    @FXML
    TableColumn<Competition, Date> StartDay;
    @FXML
    TableColumn<Competition, String> Modify;
    @FXML
    TableColumn<Competition, String> Close;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        NameOfCompetion.setCellValueFactory(new PropertyValueFactory<>("Nom de la compétition"));
        CompettionType.setCellValueFactory(new PropertyValueFactory<>("Type de course"));
        Localisation.setCellValueFactory(new PropertyValueFactory<>("Localisation"));
        StartDay.setCellValueFactory(new PropertyValueFactory<>("Date de début"));
        Modify.setCellValueFactory(new PropertyValueFactory<>("Modifier"));
        Close.setCellValueFactory(new PropertyValueFactory<>("Fermée"));
        tableLoad();
        Alert alStart = new Alert(Alert.AlertType.INFORMATION);
        alStart.setTitle("DOnnée a jours ");
        alStart.setContentText("Bienvenue sur votre service des compétitions,  votre tableau est à jours.");
        alStart.showAndWait();
    }

    public void tableLoad() {
        OpenCompetition.getItems().clear();
        OpenCompetition.refresh();
        CompetitionDAO ListCompetitionOustidRally= new CompetitionDAO();
        for (Competition Comp : ListCompetitionOustidRally.ListCompetitionOustidRally()){
            OpenCompetition.getItems().add(new Competition(Comp.getNameOfTheTest()) );
        }

    }
}
