package org.gaetan.DAO;
import javafx.scene.control.TextField;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class CompetitionDAO extends connexion {
    public CompetitionDAO(){

    }
    //methode de lecture des competitions ouverte
    public List<Competition> ListCompetitionOustidRally(){
        List<Competition> ListCompetitionOustidRally= new ArrayList<Competition>();
//        appel a la fonction de connexion
        this.createConnection();
        try{
            Statement stm = con.createStatement();
//            Requette permetant l'affichage de la liste des compétition hors rally'
            ResultSet res = stm.executeQuery("SELECT " +
                    "`0108asap_competiton`.`id`, " +
                    "`NameOfTheTest`, " +
                    " `Location_Circuit`, " +
                    " `DateOfTeste` AS `DateDebut` , " +
                    " `NumberDays`, " +
                    "`Observation`, " +
                    "`CategoryCompetition` " +
                    "FROM `0108asap_competiton`" +
                    " INNER JOIN `0108asap_sportsevents`" +
                    "  ON `0108asap_sportsevents`.`id`= `0108asap_competiton`.`id_0108asap_sportsevents` " +
                    "INNER JOIN `0108asap_categorycompetition` " +
                    "ON `0108asap_categorycompetition`.`id`= `0108asap_competiton`.`id_0108asap_categorycompetition`" +
                    "WHERE `0108asap_competiton`.`Open`='1' && `0108asap_competiton`.`Close`='0' " +
                    "");
            // je n'arrive pas a récuperer l'id pour ensuite faire le update
            while (res.next()){
                Competition c =new Competition ( res.getInt("id"),
                        res.getString("NameOfTheTest"),
                        res.getString("CategoryCompetition"),
                        res.getString("Location_Circuit"),
                        res.getDate("DateDebut"));
                ListCompetitionOustidRally.add(c);
//                System.out.println((res.getInt("id")));
                //teste de la bonne execution de la méthode
                System.out.println( c.toString());
//                message de susccé
                System.out.println("Methode ListCompetitionOustidRally ok ");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        this.closeConnection();
        return ListCompetitionOustidRally;
    }
//    methode pour ouvrire ou fermée une compétition
public void CloseOrOpenCompet(Competition Open){
        this.createConnection();
    PreparedStatement pstm;
    try {
        pstm=this.con.prepareStatement("UPDATE `0108asap_competiton` SET `Open`=?, `Close`=? WHERE `id`=?");
        pstm.setString(1,Open.getOpen());
        pstm.setString(2, Open.getClose());
        pstm.setInt(3, Open.getId());
        pstm.execute();
        pstm.close();
        System.out.println("Competition fermée");
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
    this.closeConnection();
}
}

