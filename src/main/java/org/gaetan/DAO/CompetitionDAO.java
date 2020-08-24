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
            ResultSet res = stm.executeQuery("" +
                    "SELECT `0108asap_competiton`.`id`, `0108asap_competiton`.`id_0108asap_sportsevents`," +
                    "`0108asap_typeofcompetition`.`TypeOfCompetiton`, `0108asap_categorycompetition`.`id` AS `IdRaceType`," +
                    " `0108asap_typeofcompetition`.`id` AS `idTypeCompetition`, `0108asap_competiton`.`Open`, " +
                    "`0108asap_sportsevents`.`NumberDays`," +
                    " `0108asap_sportsevents`.`id` AS `IdSportEvents`, " +
                    "`0108asap_sportsevents`.`Observation`, " +
                    "`0108asap_competiton`.`Close`, " +
                    ".`0108asap_sportsevents`.`NameOfTheTest`, " +
                    "`0108asap_raceoutsiderally`.`id` AS `Idraceoutsiderally`," +
                    " `0108asap_raceoutsiderally`.`CompetitionStarDay` AS `Start`," +
                    "`0108asap_raceoutsiderally`.`CompetitionEndDay` AS `End`, " +
                    "`0108asap_raceoutsiderally`.`RequirementDate1` AS `Day1`, " +
                    "`0108asap_raceoutsiderally`.`RequirementDate2` AS `Day2`, " +
                    "`0108asap_raceoutsiderally`.`RequirementDate3` AS `Day3`, " +
                    "`0108asap_sportsevents`.`DateOfTeste` AS `DateDebut`, " +
                    "`0108asap_raceoutsiderally`.`IdCompetition` ,  `0108asap_sportsevents`.`Location_Circuit`, " +
                    "`0108asap_categorycompetition`.`CategoryCompetition` " +
                    "FROM `0108asap_competiton` " +
                    "INNER JOIN `0108asap_categorycompetition` " +
                    "ON `0108asap_categorycompetition`.`id`=`0108asap_competiton`.`id_0108asap_categorycompetition`" +
                    "INNER JOIN `0108asap_sportsevents` " +
                    " ON `0108asap_sportsevents`.`id`=`0108asap_competiton`.`id_0108asap_sportsevents` " +
                    "INNER JOIN `0108asap_typeofcompetition` " +
                    "ON `0108asap_typeofcompetition`.`id`= `0108asap_competiton`.`id_0108asap_typeofcompetition` " +
                    " INNER JOIN `0108asap_raceoutsiderally` " +
                    "ON `0108asap_raceoutsiderally`.`IdCompetition`=`0108asap_competiton`.`id`" +
                   // "WHERE `0108asap_competiton`.`Open`=1" +
                    "");
            while (res.next()){

                Competition c =new Competition (res.getString("NameOfTheTest"), res.getString("CategoryCompetition"), res.getString("Location_Circuit"), res.getDate("DateDebut"));
                        ;
                        //(id, id_0108asap_sportsevents, TypeOfCompetiton, IdRaceType, idTypeCompetition, Open, NumberDays, IdSportEvents, Observation, Close,  NameOfTheTest, Idraceoutsiderally, Start, End, Day1, Day2, Day3, IdCompetition, DateDebut, CategoryCompetition);
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

