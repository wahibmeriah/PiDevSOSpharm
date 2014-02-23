/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageDAO;

import utill.MyConnection;
import PackageClass.Login;
import PackageClass.Pharmacie;
//import PackageClass.Pharmacie;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Med
 */
public class LoginDAO {
     public void insertLogin(Login d){

        String requete = "insert into login(id,login,mdp) values (?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, d.getId());
            ps.setString(2, d.getLogin());
            ps.setString(3, d.getMdp());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
     }
      public Login findPharmacieById(int id){
    Login log = new Login();
     String requete = "select * from admin where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                log.setId(resultat.getInt(1));
                log.setLogin(resultat.getString(2));
                log.setMdp(resultat.getString(3));
                
            }
            return log;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
}
