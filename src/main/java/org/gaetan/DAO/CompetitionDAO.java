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
        this.createConnection();
        try{
            Statement stm = con.createStatement();
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
                   // "DATE_FORMAT(`0108asap_raceoutsiderally`.`CompetitionStarDay`,'%d/%m/%Y') AS `Start`, " +
                  //  "DATE_FORMAT(`0108asap_raceoutsiderally`.`CompetitionEndDay`,'%d/%m/%Y') AS `End`, " +
                  //  "DATE_FORMAT(`0108asap_raceoutsiderally`.`RequirementDate1`,'%d/%m/%Y') AS `Day1`, " +
                  //  " DATE_FORMAT(`0108asap_raceoutsiderally`.`RequirementDate2`,'%d/%m/%Y') AS `Day2`, " +
                  //  "DATE_FORMAT(`0108asap_raceoutsiderally`.`RequirementDate3`,'%d/%m/%Y') AS `Day3`, " +
                    "`0108asap_raceoutsiderally`.`IdCompetition` ,  `0108asap_sportsevents`.`Location_Circuit`, " +
                  //  "DATE_FORMAT(`0108asap_sportsevents`.`DateOfTeste`,'%d/%m/%Y') AS `DateDebut`, " +
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
              //  int id=res.getInt("id");
              //  System.out.println( id);
            //    int id_0108asap_sportsevents= res.getInt("id_0108asap_sportsevents");
           //     String TypeOfCompetiton= res.getString("TypeOfCompetiton");
           //     int IdRaceType=res.getInt("IdRaceType");
          //      int idTypeCompetition=res.getInt("idTypeCompetition");
          //      String Open=res.getString("Open");
         //       int NumberDays=res.getInt("NumberDays");
         //       int IdSportEvents=res.getInt("IdSportEvents");
         ///       String Observation= res.getString("Observation");
          //      String Close=res.getString("Close");
           //     String NameOfTheTest=res.getString("NameOfTheTest");
           //     int Idraceoutsiderally =res.getInt("Idraceoutsiderally");
          //      Date Start =res.getDate("Start");
           //     Date End=res.getDate("End");
            //    Date Day1= res.getDate("Day1");
            //    Date Day2 =res.getDate("Day2");
            //    Date Day3= res.getDate("Day3");
           //     int IdCompetition=res.getInt("IdCompetition");
          //      Date DateDebut = res.getDate("DateDebut");
           //     String CategoryCompetition =res.getString("CategoryCompetition");
                Competition c =new Competition (res.getString("NameOfTheTest"), res.getString("CategoryCompetition"), res.getString("Location_Circuit"), res.getDate("DateDebut"));
                        ;
                        //(id, id_0108asap_sportsevents, TypeOfCompetiton, IdRaceType, idTypeCompetition, Open, NumberDays, IdSportEvents, Observation, Close,  NameOfTheTest, Idraceoutsiderally, Start, End, Day1, Day2, Day3, IdCompetition, DateDebut, CategoryCompetition);
                ListCompetitionOustidRally.add(c);

                System.out.println( c.toString());
                System.out.println("ça marche List ListCompetitionOustidRally ok ");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        this.closeConnection();
        return ListCompetitionOustidRally;
    }

}

