package org.gaetan.Gui;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import org.gaetan.DAO.Registrationforofficials;
import org.gaetan.DAO.RegistrationforofficialsDAO;
import org.gaetan.DAO.Competition;
import org.gaetan.DAO.CompetitionDAO;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;


public class UserControleur implements Initializable{
    //    tableau des competitions
@FXML
TableView<Competition>ListCompetition;
@FXML
TableColumn<Competition, Integer>idCompet;
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
    TableView<Registrationforofficials>OfficlalList;
    @FXML
    TableColumn<Registrationforofficials, String>NameOfTest;
    @FXML
    TableColumn<Registrationforofficials, String>Name;
    @FXML
    TableColumn<Registrationforofficials, String>Firstname;
    @FXML
    TableColumn<Registrationforofficials, String>TypeOfLicence;
    @FXML
    TableColumn<Registrationforofficials, String>Pc1;
    @FXML
    TableColumn<Registrationforofficials, String>Pc2;
    @FXML
    TableColumn<Registrationforofficials, String>Pc3;
    @FXML
    TableColumn<Registrationforofficials, String>Site1;
    @FXML
    TableColumn<Registrationforofficials, String>Site2;
    @FXML
    TableColumn<Registrationforofficials, String>Site3;
    @FXML
    TableColumn<Registrationforofficials, String>Accommodation;
    @FXML
    Button BtnCompetitionList, BtnListOfficial, BtnDisplayOfficiels, BtnModify, BtnClose;
    @FXML
    Tab Index, ListOfficials, ListTabCompet;
    @FXML
    VBox BoxBtnModifyClose;
    int idSelectifCompet = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        BoxBtnModifyClose.setDisable(true);
        BtnClose.setVisible(false);
        BtnModify.setVisible(false);
        BtnDisplayOfficiels.setVisible(false);
        ListOfficials.setDisable(false);
//        message pour annoncé que tout c'est bien passer donc la connexion a la base de donné
        Alert alStart = new Alert(Alert.AlertType.INFORMATION);
        alStart.setTitle("DOnnée a jours ");
        alStart.setContentText("Bienvenue sur votre service de gestions  des compétitions,  votre tableau est à jours.");
        alStart.showAndWait();

    }
//essay liste
public void test(){
    System.out.println("test()");
    ListOpenedCompetition();
}
//Afficage du tableau
   public void TableLoadCompet() {
       System.out.println("TableLoadCompet()");
       ListCompetition.getItems().clear();
       ListCompetition.refresh();
        CompetitionDAO ListCompetitionOutsideRally= new CompetitionDAO();
       ListCompetition.getItems().addAll(ListCompetitionOutsideRally.ListCompetitionOustidRally());
       ListCompetition.refresh();
   }
//   tableau des officiels inscrit au épreuve
   public void TableLoadOfficial(){
       OfficlalList.getItems().clear();
       OfficlalList.refresh();
       RegistrationforofficialsDAO OfficilalList = new RegistrationforofficialsDAO();
       OfficlalList.getItems().addAll(OfficilalList.OfficilalList());
       OfficlalList.refresh();
   }
//Au clique du bouton ouvrire une compétition l'onglét est déverouiiler et l'onglet Liste des compétition se verouille
   public  void ListOfficial(){
       ListTabCompet.setDisable(true);
       ListOfficials.setDisable(false);
       NameOfTest.setCellValueFactory(new PropertyValueFactory<>("NameOfTheTest"));
       Name.setCellValueFactory(new PropertyValueFactory<>("Name"));
       Firstname.setCellValueFactory(new PropertyValueFactory<>("Firstname"));
       TypeOfLicence.setCellValueFactory(new PropertyValueFactory<>("TypeOfLicence"));
       Pc1.setCellValueFactory(new PropertyValueFactory<>("ResponseDatePcNeed1"));
       Pc2.setCellValueFactory(new PropertyValueFactory<>("ResponseDatePcNeed2"));
       Pc3.setCellValueFactory(new PropertyValueFactory<>("ResponseDatePcNeed3"));
       Site1.setCellValueFactory(new PropertyValueFactory<>("AvaibleDateNeedForTheCommissioner1"));
       Site2.setCellValueFactory(new PropertyValueFactory<>("AvaibleDateNeedForTheCommissioner2"));
       Site3.setCellValueFactory(new PropertyValueFactory<>("AvaibleDateNeedForTheCommissioner3"));
       Accommodation.setCellValueFactory(new PropertyValueFactory<>("Accommodation"));

//appel a la fonction pour télécharger le tableau des officiels complet
       TableLoadOfficial();
   }
//   au clique du bouton liste compétition l'onglet liste compétiton est dévérouiller et l'onglet ouvrire une compétion est vérouiller
   public void ListOpenedCompetition(){
       System.out.println("ListOpenedCompetition()");
      ListTabCompet.setDisable(false);
       ListOfficials.setDisable(true);
       idCompet.setCellValueFactory(new PropertyValueFactory<>("id"));
       NameOfCompetion.setCellValueFactory(new PropertyValueFactory<>("NameOfTheTest"));
       CompettionType.setCellValueFactory(new PropertyValueFactory<>("CategoryCompetition"));
       Localisation.setCellValueFactory(new PropertyValueFactory<>("Location_Circuit"));
       StartDay.setCellValueFactory(new PropertyValueFactory<>("DateDebut"));
       //appel a la fonction TableLoadCompet().
       TableLoadCompet();

   }
    public void SetForm(){
//fonction pour récupére l'id

        System.out.println("SetForm()");
 idSelectifCompet=ListCompetition.getSelectionModel().getSelectedItem().getId();
        BoxBtnModifyClose.setDisable(false);
        BtnClose.setVisible(true);
        BtnModify.setVisible(true);
   BtnDisplayOfficiels.setVisible(true);
    ListTabCompet.setDisable(false);
   ListOfficials.setDisable(true);
}
//fonction pour fermé une compétion
    public void CloseCompetition(){
        CompetitionDAO CloseOrOpenCompetition =new CompetitionDAO();
//        SI idSelectifcompet n'est pas vide
        if (idSelectifCompet!= 0){
//            je créer un nouvelle objet de competition que j'incrément de la variable close
            Competition close=new Competition();
//            l'id a modifier
            close.setId(idSelectifCompet);
//            la nouvelle valeur de open et close
            close.setOpen("0");
            close.setClose("1");
//          j'envoie vers la bas de donnée
          CloseOrOpenCompetition.CloseOrOpenCompet(close);
//          je retélécharge le tableau pour mettre a jour l'affichage
            TableLoadCompet();
//          J'affiche un message de succée
            Alert alStart = new Alert(Alert.AlertType.INFORMATION);
            alStart.setTitle("Compétition fermée");
            alStart.setContentText("La compétition a bien étais fermée.");
            alStart.showAndWait();
        }
    }
    public void OfficialForCompetition(){
        ListTabCompet.setDisable(true);
        ListOfficials.setDisable(false);
        NameOfTest.setCellValueFactory(new PropertyValueFactory<>("NameOfTheTest"));
        Name.setCellValueFactory(new PropertyValueFactory<>("Name"));
        Firstname.setCellValueFactory(new PropertyValueFactory<>("Firstname"));
        TypeOfLicence.setCellValueFactory(new PropertyValueFactory<>("TypeOfLicence"));
        Pc1.setCellValueFactory(new PropertyValueFactory<>("ResponseDatePcNeed1"));
        Pc2.setCellValueFactory(new PropertyValueFactory<>("ResponseDatePcNeed2"));
        Pc3.setCellValueFactory(new PropertyValueFactory<>("ResponseDatePcNeed3"));
        Site1.setCellValueFactory(new PropertyValueFactory<>("AvaibleDateNeedForTheCommissioner1"));
        Site2.setCellValueFactory(new PropertyValueFactory<>("AvaibleDateNeedForTheCommissioner2"));
        Site3.setCellValueFactory(new PropertyValueFactory<>("AvaibleDateNeedForTheCommissioner3"));
        Accommodation.setCellValueFactory(new PropertyValueFactory<>("Accommodation"));
    }
//    affichage de la liste des officiels inscrit la compétition seclectionnée dans la liste des compétition
public void DisplayOfficialForCompetition(){
    if(idSelectifCompet!=0){
        Registrationforofficials ListForCompet = new Registrationforofficials();
        ListForCompet.setIdCompetition(idSelectifCompet);
        OfficlalList.getItems().clear();
        OfficlalList.refresh();
        RegistrationforofficialsDAO  OfficilalList= new RegistrationforofficialsDAO();
        OfficlalList.getItems().addAll(OfficilalList.DisplayOfficialRegisteredForCompetition(idSelectifCompet));
        OfficlalList.refresh();
        ListOfficials.setDisable(false);
        OfficialForCompetition();
        }else {
        Alert alStart = new Alert(Alert.AlertType.WARNING);
        alStart.setTitle("Aucun officiels ");
        alStart.setContentText("Aucun officiel est inscrit pour le moment ");
        alStart.showAndWait();
    }
    }
}
