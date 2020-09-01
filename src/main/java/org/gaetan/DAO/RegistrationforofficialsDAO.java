package org.gaetan.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class RegistrationforofficialsDAO extends connexion{
//    methode pour liste des officiels inscrit

    public List<Registrationforofficials> OfficilalList() {
        List<Registrationforofficials> OfficilalList = new ArrayList<Registrationforofficials>();
//        appel a la fonction de connexion
        this.createConnection();
        try{
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT " +
                    "`0108asap_registrationforofficials`.`id` AS `IdRegistrationforofficials`," +
                    "`ResponseDatePcNeed1`, " +
                    "`ResponseDatePcNeed2`, " +
                    "`ResponseDatePcNeed3`, " +
                    "`AvaibleDateNeedForTheCommissioner1`, " +
                    "`AvaibleDateNeedForTheCommissioner2`," +
                    " `AvaibleDateNeedForTheCommissioner3`, " +
                    "`Accommodation`, " +
                    "`0108asap_functions`.`TypeOfLicence`, " +
                    " `0108asap_sportsevents`.`NameOfTheTest`," +
                    " `0108asap_membres`.`Name`, " +
                    "`0108asap_membres`.`Firstname` " +
                    " FROM `0108asap_registrationforofficials` " +
                    "INNER JOIN `0108asap_competiton` " +
                    "ON `0108asap_competiton`.`id` = `0108asap_registrationforofficials`.`id_0108asap_competiton` " +
                    " INNER JOIN `0108asap_functions` " +
                    "ON `0108asap_functions`.`id`= `0108asap_registrationforofficials`.`id_0108asap_functions`  " +
                    "INNER JOIN `0108asap_membres` " +
                    "ON `0108asap_registrationforofficials`.`id_0108asap_membres`= `0108asap_membres`.`id` " +
                    "INNER JOIN `0108asap_categorycompetition`" +
                    " ON `0108asap_categorycompetition`.`id`= `0108asap_competiton`.`id_0108asap_categorycompetition` " +
                    "INNER JOIN `0108asap_sportsevents` " +
                    "ON `0108asap_sportsevents`.`id`=`0108asap_competiton`.`id_0108asap_sportsevents` " +
                    "INNER JOIN `0108asap_typeofcompetition` " +
                    "ON `0108asap_typeofcompetition`.`id`=`0108asap_competiton`.`id_0108asap_typeofcompetition` " +
                    "INNER JOIN `0108asap_rally` " +
                    "ON `0108asap_rally`.`id_0108asap_competiton`= `0108asap_competiton`.`id`" +
                    "");
            while (res.next()) {
                Registrationforofficials L = new Registrationforofficials(
                        res.getInt("IdRegistrationforofficials"),
                        res.getString("ResponseDatePcNeed1"),
                        res.getString("ResponseDatePcNeed2"),
                        res.getString("ResponseDatePcNeed3"),
                        res.getString("AvaibleDateNeedForTheCommissioner1"),
                        res.getString("AvaibleDateNeedForTheCommissioner2"),
                        res.getString("AvaibleDateNeedForTheCommissioner3"),
                        res.getString("Accommodation"),
                        res.getString("TypeOfLicence"),
                        res.getString("NameOfTheTest"),
                        res.getString("Name"),
                        res.getString("Firstname")
                        );
                OfficilalList.add(L);
                System.out.println(res.getString("TypeOfLicence"));
// PBM d 'affichage rien ne s'affiche dans mon tableau
//                message de susccé
                System.out.println("ça marche Liste officiel ");
                System.out.println(L.getFirstname());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        this.closeConnection();
        return OfficilalList;
    }
//    methode d'affichage de la liste des officiels pour tels compétitions

public  List<Registrationforofficials> DisplayOfficialRegisteredForCompetition(int IdCompetition){
    List<Registrationforofficials> DisplayOfficialRegisteredForCompetition = new ArrayList<Registrationforofficials>();
//        appel a la fonction de connexion
    this.createConnection();
    try{
        PreparedStatement pstm;
        pstm=this.con.prepareStatement("SELECT " +
                "`0108asap_competiton`.`id`, " +
                "`0108asap_registrationforofficials`.`id` AS `IdRegistrationforofficials`," +
                "`ResponseDatePcNeed1`, " +
                "`ResponseDatePcNeed2`, " +
                "`ResponseDatePcNeed3`, " +
                "`AvaibleDateNeedForTheCommissioner1`, " +
                "`AvaibleDateNeedForTheCommissioner2`," +
                " `AvaibleDateNeedForTheCommissioner3`, " +
                "`Accommodation`, " +
                "`0108asap_functions`.`TypeOfLicence`, " +
                " `0108asap_sportsevents`.`NameOfTheTest`," +
                " `0108asap_membres`.`Name`, " +
                "`0108asap_membres`.`Firstname` " +
                " FROM `0108asap_registrationforofficials` " +
                "INNER JOIN `0108asap_competiton` " +
                "ON `0108asap_competiton`.`id` = `0108asap_registrationforofficials`.`id_0108asap_competiton` " +
                " INNER JOIN `0108asap_functions` " +
                "ON `0108asap_functions`.`id`= `0108asap_registrationforofficials`.`id_0108asap_functions`  " +
                "INNER JOIN `0108asap_membres` " +
                "ON `0108asap_registrationforofficials`.`id_0108asap_membres`= `0108asap_membres`.`id` " +
                "INNER JOIN `0108asap_categorycompetition`" +
                " ON `0108asap_categorycompetition`.`id`= `0108asap_competiton`.`id_0108asap_categorycompetition` " +
                "INNER JOIN `0108asap_sportsevents` " +
                "ON `0108asap_sportsevents`.`id`=`0108asap_competiton`.`id_0108asap_sportsevents` " +
                "INNER JOIN `0108asap_typeofcompetition` " +
                "ON `0108asap_typeofcompetition`.`id`=`0108asap_competiton`.`id_0108asap_typeofcompetition` " +
                "INNER JOIN `0108asap_rally` " +
                "ON `0108asap_rally`.`id_0108asap_competiton`= `0108asap_competiton`.`id`" +
                "" +
                "WHERE `0108asap_competiton`.`id`=?" +
                "");
        pstm.setInt(1, IdCompetition);
        ResultSet res= pstm.executeQuery();

        while (res.next()) {

            Registrationforofficials OFficiaList = new Registrationforofficials(

                    res.getInt("IdRegistrationforofficials"),
                    res.getString("ResponseDatePcNeed1"),
                    res.getString("ResponseDatePcNeed2"),
                    res.getString("ResponseDatePcNeed3"),
                    res.getString("AvaibleDateNeedForTheCommissioner1"),
                    res.getString("AvaibleDateNeedForTheCommissioner2"),
                    res.getString("AvaibleDateNeedForTheCommissioner3"),
                    res.getString("Accommodation"),
                    res.getString("TypeOfLicence"),
                    res.getString("NameOfTheTest"),
                    res.getString("Name"),
                    res.getString("Firstname")

            );

            DisplayOfficialRegisteredForCompetition.add(OFficiaList);
            System.out.println( res.getString("NameOfTheTest"));
            System.out.println(res.getString("Accommodation"));
//            test d'ffichage du nom des officiels
            System.out.println(  res.getString("Name"));
// PBM d 'affichage rien ne s'affiche dans mon tableau
//                message de susccé
            System.out.println("ça marche Liste officiel pour tel commpétition ");
        }
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
    this.closeConnection();
    return DisplayOfficialRegisteredForCompetition;
}
}

