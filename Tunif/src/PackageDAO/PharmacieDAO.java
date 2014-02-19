/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageDAO;

import ConnectionBD.Connection;
import PackageClass.Pharmacie;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Meriah
 */
public class PharmacieDAO {
    
     public void insertPharmacie(Pharmacie d){

        String requete = "insert into pharmacie (code_pharmacie,nom_pharmacie,adresse_pharmacie,tel_pharmacie,type_pharmacie) values (?,?,?,?,?)";
        try {
            PreparedStatement ps = Connection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getCode_pharmacie());
            ps.setString(2, d.getNom_pharmacie());
            ps.setString(3, d.get.Adresse_pharmacie());
            ps.setString(4, d.getTel_pharmacie());
            ps.setString(5, d.getType_pharmacie());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }