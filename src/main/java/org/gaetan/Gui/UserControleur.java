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
//    tableau des competitions
@FXML
TableView<Competition>ListCompetition;
@FXML
TableColumn<Competition, String > NameOfCompetion;
    @FXML
    TableColumn<Competition, String > CompettionType;
    @FXML
    TableColumn<Competition, String > Localisation;
    @FXML
    TableColumn<Competition, Date> StartDay;
//  tableau de la liste des officiels
    @FXML
    TableView<registrationforofficials>OfficlalList;
    @FXML
    TableColumn<registrationforofficials, String>NameOfTest;
    @FXML
    TableColumn<registrationforofficials, String>Name;
    @FXML
    TableColumn<registrationforofficials, String>Firstname;
    @FXML
    TableColumn<registrationforofficials, String>Function;
    @FXML
    TableColumn<registrationforofficials, String>Pc1;
    @FXML
    TableColumn<registrationforofficials, String>Pc2;
    @FXML
    TableColumn<registrationforofficials, String>Pc3;
    @FXML
    TableColumn<registrationforofficials, String>Site1;
    @FXML
    TableColumn<registrationforofficials, String>Site2;
    @FXML
    TableColumn<registrationforofficials, String>Site3;
    @FXML
    TableColumn<registrationforofficials, String>Accommodation;
    @FXML
    Button CompetitionList, ListOfficial, BtnModify, BtnClose;
    @FXML
    Tab Index, OpenCompetTab, ListOfficials, ListTabCoimpet;
    @FXML
    VBox BoxBtnModifyClose;
    int idSelectifCompet = 0;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        BoxBtnModifyClose.setDisable(true);
        BtnClose.setVisible(false);
        BtnModify.setVisible(false);
        ListOfficials.setDisable(true);
//        message pour annoncé que tout c'est bien passer donc la connexion a la base de donné
        Alert alStart = new Alert(Alert.AlertType.INFORMATION);
        alStart.setTitle("DOnnée a jours ");
        alStart.setContentText("Bienvenue sur votre service de gestions  des compétitions,  votre tableau est à jours.");
        alStart.showAndWait();
    }
    //fonction de teste
public void testTableau (){
    System.out.println("Test " );

}
//Afficage du tableau
   public void TableLoadCompet() {
       ListCompetition.getItems().clear();
       ListCompetition.refresh();
        CompetitionDAO ListCompetitionOutsideRally= new CompetitionDAO();
       ListCompetition.getItems().addAll(ListCompetitionOutsideRally.ListCompetitionOustidRally());
       ListCompetition.refresh();
//        }
   }
//   tableau des officiels inscrit au épreuve
   public void TableLoadOfficial(){
       OfficlalList.getItems().clear();
       OfficlalList.refresh();
       registrationforofficialsDAO  OfficilalList= new registrationforofficialsDAO();
//       OfficlalList.getItems().addAll(OfficilalList.OfficilalList());
//       OfficlalList.refresh();
       for (registrationforofficials official: OfficilalList.OfficilalList()){
           OfficlalList.getItems().add(new registrationforofficials(official.getNameOfTheTest(),official.getName(), official.getFirstname(), official.getTypeOfLicence(),official.getResponseDatePcNeed1(),
                   official.getResponseDatePcNeed2(), official.getResponseDatePcNeed3(), official.getAvaibleDateNeedForTheCommissioner1(), official.getAvaibleDateNeedForTheCommissioner2(),
                   official.getAvaibleDateNeedForTheCommissioner3(), official.getAccommodation()));
       }
   }
//Au clique du bouton ouvrire une compétition l'onglét est déverouiiler et l'onglet Liste des compétition se verouille
   public  void ListOffical(){

       ListTabCoimpet.setDisable(true);
       ListOfficials.setDisable(false);
       NameOfTest.setCellValueFactory(new PropertyValueFactory<>("NameOfTheTest"));
       Name.setCellValueFactory(new PropertyValueFactory<>("Name"));
       Firstname.setCellValueFactory(new PropertyValueFactory<>("Firstname"));
       Function.setCellValueFactory(new PropertyValueFactory<>("TypeOfLicence"));
       Pc1.setCellValueFactory(new PropertyValueFactory<>("ResponseDatePcNeed1"));
       Pc2.setCellValueFactory(new PropertyValueFactory<>("ResponseDatePcNeed2"));
       Pc3.setCellValueFactory(new PropertyValueFactory<>("ResponseDatePcNeed3"));
       Site1.setCellValueFactory(new PropertyValueFactory<>("AvaibleDateNeedForTheCommissioner1"));
       Site2.setCellValueFactory(new PropertyValueFactory<>("AvaibleDateNeedForTheCommissioner2"));
       Site3.setCellValueFactory(new PropertyValueFactory<>("AvaibleDateNeedForTheCommissioner3"));
       Accommodation.setCellValueFactory(new PropertyValueFactory<>("Accommodation"));
       TableLoadOfficial();
   }
//   au clique du bouton liste compétition l'onglet liste compétiton est dévérouiller et l'onglet ouvrire une compétion est vérouiller
   public void ListOpenedCompetiton(){
       ListTabCoimpet.setDisable(false);
       ListOfficials.setDisable(true);
       NameOfCompetion.setCellValueFactory(new PropertyValueFactory<>("NameOfTheTest"));
       CompettionType.setCellValueFactory(new PropertyValueFactory<>("CategoryCompetition"));
       Localisation.setCellValueFactory(new PropertyValueFactory<>("Location_Circuit"));
       StartDay.setCellValueFactory(new PropertyValueFactory<>("DateDebut"));
       //appel a la fonction TableLoadCompet().
       TableLoadCompet();
   }
public void SetForm(){

    idSelectifCompet=ListCompetition.getSelectionModel().getSelectedItem().getId();
    BoxBtnModifyClose.setDisable(false);
    BtnClose.setVisible(true);
    BtnModify.setVisible(true);
    ListTabCoimpet.setDisable(false);
    ListOfficials.setDisable(true);

}
//validation des formulaire
}
