package org.gaetan.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class CompetitionDAO extends connexion {
    public CompetitionDAO(){

    }
    //methode de lecture des competitions ouverte ( hors rallye)
    public List<Competition> ListCompetitionOustidRally(){
        List<Competition> ListCompetitionOustidRally= new ArrayList();
//        appel a la fonction de connexion
        this.createConnection();
        try{
            Statement stm = con.createStatement();
//            Requette permetant l'affichage de la liste des compétition hors rally'
            ResultSet res = stm.executeQuery("SELECT `0108asap_competiton`.`id`, " +
                    "`NameOfTheTest`," +
                    " `Location_Circuit`," +
                    " `DateOfTeste` AS `DateDebut` ," +
                    " `NumberDays`, " +
                    "`Observation`, " +
                    "`CategoryCompetition` " +
                    "FROM `0108asap_competiton`" +
                    " INNER JOIN `0108asap_sportsevents`" +
                    "  ON `0108asap_sportsevents`.`id`= `0108asap_competiton`.`id_0108asap_sportsevents` " +
                    "INNER JOIN `0108asap_categorycompetition` " +
                    "ON `0108asap_categorycompetition`.`id`= `0108asap_competiton`.`id_0108asap_categorycompetition`" +
                    "");
            while (res.next()){


                Competition c =new Competition (res.getString("NameOfTheTest"), res.getString("CategoryCompetition"), res.getString("Location_Circuit"), res.getDate("DateDebut"));
                ListCompetitionOustidRally.add(c);
//teste de la bonne execution de la méthode
                System.out.println( c.toString());
//                message de susccé
                System.out.println("ça marche List ListCompetitionOustidRally ok ");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        this.closeConnection();
        return ListCompetitionOustidRally;
    }

}

