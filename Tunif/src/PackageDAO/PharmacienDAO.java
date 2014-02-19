/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PackageDAO;
import PackageClass.Pharmacien;
import ConnectionBD.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ESPRIT
 */
public class PharmacienDAO {

    /**
     *
     * @param d
     */
    public void insertPharmacien(Pharmacien d){

        String requete = "insert into pharmacien (id_pharm,nom_pharm,pr_pharm,email_pharm,login_pharm,mdp_pharm) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = Connection.getInstance().prepareStatement(requete);
            ps.setInt(1, d.getId_pharm());
            ps.setString(2, d.getNom_pharm());
            ps.setString(3, d.getPre_pharm());
            ps.setString(4, d.getEmail_pharm());
            ps.setString(5, d.getLogin_pharm());
            ps.setString(6, d.getMdp_pharm());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    
    
}
