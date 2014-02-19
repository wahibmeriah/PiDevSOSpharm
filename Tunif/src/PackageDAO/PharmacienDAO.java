/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PackageDAO;

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

        String requete = "insert into pharmacien (id_pharma,nom_pharm,pr_pharm,email_pharm,login_pharm,motp_pharm) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getId_pharma());
            ps.setString(2, d.getNom_pharm());
            ps.setString(3, d.getPr_pharm());
            ps.setString(4, d.getEmail_pharm());
            ps.setString(5, d.getLogin_pharm());
            ps.setString(6, d.getMotp_pharm());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    
    
}
