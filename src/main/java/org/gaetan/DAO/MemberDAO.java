package org.gaetan.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO extends connexion {
    public MemberDAO() {

    }

    //methode d'insertion
    public void Insertuser(Member Member) {
        //appel a la fonction connexion
        this.createConnection();

        //requette préparer
        PreparedStatement pstm;
        try {
            pstm = this.con.prepareStatement("INSERT INTO `0108asap_membres` (`Name`, `Firstname`, `Email`)VALUE (?, ? ,?)");
            pstm.setString(1, Member.getName());
            pstm.setString(1, Member.getFirstname());
            pstm.setString(2, Member.getEmail());
            pstm.execute();
            pstm.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        this.closeConnection();

    }
    //liste Utilisateur
    public List<Member> List(){
        List<Member> listMember = new ArrayList();
        this.createConnection();
        try {
            Statement stm= con.createStatement();
            ResultSet res =stm.executeQuery("SELECT  `id`, `Name`,  `Email` FROM `0108asap_membres` ");
            while(res.next()){
                int id =res.getInt("id");
                String pseudo =res.getString("Name");
                String email = res.getString("Email");
                Member n= new Member( id, pseudo, email);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        this.closeConnection();
        return listMember;
    }

}
