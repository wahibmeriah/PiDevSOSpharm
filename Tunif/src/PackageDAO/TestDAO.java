/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PackageDAO;
import PackageClass.Pharmacien;
import PackageClass.Test;
import utill.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ESPRIT
 */
public class TestDAO {

    /**
     *
     * @param 
     */
    public void insertTest(Test d){

        String requete = "insert into test (id_pharm,nom_pharm,pre_pharm,email_pharm,login_pharm,mdp_pharm) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getId_pharm());
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
    
    
    
    
         
    
            public List<Test> DisplayAllTest (){


        List<Test> listePharmacien = new ArrayList<Test>();

        String requete = "select * from test";
        try {
          
           PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
              ResultSet resultat = ps.executeQuery();
            

            while(resultat.next()){
                Test pharm =new Test();
               // pharm.setId_pharm(resultat.getInt(1));
                pharm.setLogin_pharm(resultat.getString(2));
                pharm.setMdp_pharm(resultat.getString(3));
                pharm.setEmail_pharm(resultat.getString(4));
                pharm.setNom_pharm(resultat.getString(5));
                pharm.setPre_pharm(resultat.getString(6));
               

                listePharmacien.add(pharm);
            }
            return listePharmacien;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
             public List<Test> DisplayAllFharmacies_2 (){


        List<Test> listeDemande = new ArrayList<Test>();

        String requete = "select count(id_pharm) from test";
        try {
          
           PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
              ResultSet resultat = ps.executeQuery();
            

            while(resultat.next()){
                Test pharm =new Test();
                pharm.setId_pharm(resultat.getString(1));
               // pharm.setNom_pharmacie(resultat.getString(2));
                //pharm.setAdresse_pharmacie(resultat.getString(3));
                //pharm.setTel_pharmacie(resultat.getInt(4));
               // pharm.setType_pharmacie(resultat.getString(5));
            
                listeDemande.add(pharm); }           
            return listeDemande;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des demandes "+ex.getMessage());
            return null;
        }
    }
               public void deleteTest(String id_pharm){
         String requete = "delete from test where id_pharm=?";
         try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, id_pharm);
            ps.executeUpdate();
            System.out.println("Pharmacien supprimée");
        } catch (SQLException ex) {
            Logger.getLogger(TestDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    
}
    
    
    

