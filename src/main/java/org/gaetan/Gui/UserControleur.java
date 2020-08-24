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
    @FXML
    Button CompetitionOpen, RefistrerOfficiel, CompetitionList, OpenOustrideRally, OpenRally;
    @FXML
    Tab Index, OpenCompetTab, ListTabCiompet;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

//        NameOfCompetion.setCellValueFactory(new PropertyValueFactory<>("NameOfTheTest"));
//        CompettionType.setCellValueFactory(new PropertyValueFactory<>("CategoryCompetition"));
//        Localisation.setCellValueFactory(new PropertyValueFactory<>("Location_Circuit"));
//        StartDay.setCellValueFactory(new PropertyValueFactory<>("DateDebut"));
       // Modify.setCellValueFactory(new PropertyValueFactory<>("Modify"));
     //   Close.setCellValueFactory(new PropertyValueFactory<>("Close"));
     //   tableLoad();
       // testTableau();
        Alert alStart = new Alert(Alert.AlertType.INFORMATION);
        alStart.setTitle("DOnnée a jours ");
        alStart.setContentText("Bienvenue sur votre service de gestions  des compétitions,  votre tableau est à jours.");
        alStart.showAndWait();
    }
public void testTableau (){
    System.out.println("Test " );

}

   public void tableLoad() {
        OpenCompetition.getItems().clear();
        OpenCompetition.refresh();
        CompetitionDAO ListCompetitionOutsideRally= new CompetitionDAO();
        for (Competition Comp : ListCompetitionOutsideRally.ListCompetitionOustidRally()){
            OpenCompetition.getItems().add(new Competition(Comp.getNameOfTheTest(), Comp.getCategoryCompetition(), Comp.getLocation_Circuit(), Comp.getDateDebut() ));

        }


   }

   public  void OpenCompetition(){
       OpenCompetTab.setDisable(false);
       ListTabCiompet.setDisable(true);

   }
   public void ListOpenedCompetiton(){
       OpenCompetTab.setDisable(true);
       ListTabCiompet.setDisable(false);
       NameOfCompetion.setCellValueFactory(new PropertyValueFactory<>("NameOfTheTest"));
       CompettionType.setCellValueFactory(new PropertyValueFactory<>("CategoryCompetition"));
       Localisation.setCellValueFactory(new PropertyValueFactory<>("Location_Circuit"));
       StartDay.setCellValueFactory(new PropertyValueFactory<>("DateDebut"));
       tableLoad();
   }

}
