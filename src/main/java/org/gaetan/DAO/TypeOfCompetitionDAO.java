package org.gaetan.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class TypeOfCompetitionDAO extends connexion {
//    méthode pour afficher les listes de type des competition (championat regional ...)
    public List<TypeOfCompetition> ListTypeOfCompetition() {
        List<TypeOfCompetition> ListTypeOfCompetition = new ArrayList<TypeOfCompetition>();
//        appel a la fonction de connexion
        this.createConnection();
        try {
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT `id`, `TypeOfCompetiton` FROM `0108asap_typeofcompetition`");
            while (res.next()) {
                TypeOfCompetition List = new TypeOfCompetition (
                    res.getInt("id"),
                   res.getString("TypeOfCompetiton")
                );
                ListTypeOfCompetition.add(List);
//                test list type de competition
                System.out.println("ListTypeOfCompetition ok ");
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        this.closeConnection();
        return ListTypeOfCompetition;
    }
public void AddTypeOfCompetition (TypeOfCompetition TypeCompet){
        // appel a la fonction de connexion
    this.createConnection();
    PreparedStatement pstm;
    try{
        pstm=this.con.prepareStatement("INSERT INTO `0108asap_typeofcompetition`( `TypeOfCompetiton`) VALUES (?)");
        pstm.setString(1, TypeCompet.getTypeOfCompetiton());
        pstm.execute();
        pstm.close();
        System.out.println("AddTypeOfCompetition OK");
    } catch (Exception e) {
        e.printStackTrace();
    }
    this.closeConnection();
}
public void ModifyTypeOfCompetition(TypeOfCompetition ModifyType){
        this.createConnection();
        PreparedStatement pstm;
        try {
            pstm= this.con.prepareStatement("UPDATE `0108asap_typeofcompetition` SET `TypeOfCompetiton`=? WHERE `id`=?");
            pstm.setInt(2, ModifyType.getId());
            pstm.setString(1, ModifyType.getTypeOfCompetiton());
            pstm.execute();
            pstm.close();
            System.out.println("ModifyTypeOfCompetition OK");
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.closeConnection();
}
public void DeleteTypeOfCOmpetition(TypeOfCompetition DeleteType){
        this.createConnection();
        PreparedStatement pstm;
        try {
            pstm=this.con.prepareStatement("DELETE FROM `0108asap_typeofcompetition` WHERE `id`=?");
            pstm.setInt(1, DeleteType.getId());
            pstm.execute();
            System.out.println("DeleteTypeOfCOmpetition OK");
        } catch (Exception e) {
            e.printStackTrace();
        }
}
}
