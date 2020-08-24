package org.gaetan.DAO;
import java.sql.Connection;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;
//méthode pour ce connecter à la base de donnée
public class connexion {
    protected Object com;
    //attention a bien ajouté ?serverTimezone=UTC aprés la DDB
    String url = "jdbc:mysql://localhost:3306/ffsa?serverTimezone=UTC";
    Connection con;
    //* methode de connexion
    public void createConnection(){
        try {
            con = getConnection(url,"root","");
            System.out.println("ça marche DB ");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //*methode de deconnexion
    public boolean closeConnection() {
        boolean flag;
        try {
            con.close();
            flag = true;

        } catch (SQLException e) {
            flag = false;
            System.out.println("con n'est pas fermée");
        }
        return flag;
    }

}



