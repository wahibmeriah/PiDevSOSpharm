/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PackageDAO;
import PackageClass.Pharmacien;
import utill.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESPRIT
 */
public class PharmacienDAO {

    /**
     *
     * @param 
     */
    public void insertPharmacien(Pharmacien d){

        String requete = "insert into pharmacien (id_pharm,nom_pharm,pr_pharm,email_pharm,tel_pharm,login_pharm,mdp_pharm) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
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
    
    
     public void updatePharmacien(Pharmacien d){
        String requete = "update pharmacien set id_pharmacien=?, set login_pharmacien=?, set email_pharmacien=?, set mdp_pharmacien=?,set nom_pharmacien=?,set pre_pharmacien=?, where id_pharmacien=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, d.getId_pharm());
            ps.setString(2, d.getLogin_pharm());
            ps.setString(3, d.getEmail_pharm());
            ps.setString(4, d.getMdp_pharm());
             ps.setString(5, d.getNom_pharm());
             ps.setString(6, d.getPre_pharm());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
          public void deletePharmacien(int id_pharmacien){
        String requete = "delete from pharmacie where code_pharmacie=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_pharmacien);
            ps.executeUpdate();
            System.out.println("Pharmacien supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
           public Pharmacien findPharmacieById(int id_pharmacien){
    Pharmacien pharm = new Pharmacien();
     String requete = "select * from pharmacien where id_pharmacien=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_pharmacien);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                pharm.setId_pharm(resultat.getInt(1));
                pharm.setLogin_pharm(resultat.getString(2));
                pharm.setMdp_pharm(resultat.getString(3));
                pharm.setEmail_pharm(resultat.getString(4));
                pharm.setNom_pharm(resultat.getString(5));
                pharm.setPre_pharm(resultat.getString(6));
                
            }
            return pharm;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
            public List<Pharmacien> DisplayAllpharmaciens (){


        List<Pharmacien> listePharmacien = new ArrayList<Pharmacien>();

        String requete = "select * from pharmacien";
        try {
          
           PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
              ResultSet resultat = ps.executeQuery();
            

            while(resultat.next()){
                Pharmacien pharm =new Pharmacien();
                pharm.setId_pharm(resultat.getInt(1));
                pharm.setLogin_pharm(resultat.getString(2));
                pharm.setMdp_pharm(resultat.getString(3));
                pharm.setEmail_pharm(resultat.getString(4));
                pharm.setNom_pharm(resultat.getString(5));
                 pharm.setPre_pharm(resultat.getString(5));

                listePharmacien.add(pharm);
            }
            return listePharmacien;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }


    
}
    
    
    

