/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageDAO;

import utill.MyConnection;
import PackageClass.Pharmacie;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Meriah
 */
public class PharmacieDAO {

    public void insertPharmacie(Pharmacie d) {

        String requete = "insert into pharmacie (nom_pharmacie,adresse_pharmacie,tel_pharmacie,	type_pharmacie, gouvernerat) values (?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);

            ps.setString(1, d.getNom_pharmacie());
            ps.setString(2, d.getAdresse_pharmacie());
            ps.setInt(3, d.getTel_pharmacie());
            ps.setString(4, d.getType_pharmacie());
            ps.setString(5, d.getGouvernerat());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }

    //
    public void updatePharmacie(Pharmacie d) {
        String requete = "update pharmacie set code_pharmacie=?, set nom_pharmacie=?, set adresse_pharmacie=?, set tel_pharmacie=?,set type_pharmacie=?, set gouvernerat=? where code_pharmacie=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, d.getCode_pharmacie());
            ps.setString(2, d.getNom_pharmacie());
            ps.setString(3, d.getAdresse_pharmacie());
            ps.setInt(4, d.getTel_pharmacie());
            ps.setString(5, d.getType_pharmacie());
            ps.setString(6, d.getGouvernerat());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    public void deletePharmacie(int code_pharmacie) {
        String requete = "delete from pharmacie where code_pharmacie=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, code_pharmacie);
            ps.executeUpdate();
            System.out.println("Pharmacie supprimée");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    public Pharmacie findPharmacieById(int code_pharmacie) {
        Pharmacie pharm = new Pharmacie();
        String requete = "select * from pharmacie where code_pharmacie=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, code_pharmacie);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                pharm.setCode_pharmacie(resultat.getInt(1));
                pharm.setNom_pharmacie(resultat.getString(2));
                pharm.setAdresse_pharmacie(resultat.getString(3));
                pharm.setTel_pharmacie(resultat.getInt(4));
                pharm.setType_pharmacie(resultat.getString(5));
                pharm.setGouvernerat(resultat.getString(6));
            }
            return pharm;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot " + ex.getMessage());
            return null;
        }
    }

    public List<Pharmacie> findPharmacieByGouvernerat(String Gouvernerat) {
        String requete = "select * from pharmacie where gouvernorat=?";
        try {
            List<Pharmacie> lPhar = new ArrayList<Pharmacie>();
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, Gouvernerat);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Pharmacie pharm = new Pharmacie();

                pharm.setCode_pharmacie(resultat.getInt(1));
                pharm.setNom_pharmacie(resultat.getString(2));
                pharm.setAdresse_pharmacie(resultat.getString(3));
                pharm.setTel_pharmacie(resultat.getInt(4));
                pharm.setType_pharmacie(resultat.getString(5));
                pharm.setGouvernerat(resultat.getString(6));
                lPhar.add(pharm);
            }
            return lPhar;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche par Gouvernerat !! " + ex.getMessage());
            return null;
        }
    }

    public List<Pharmacie> findPharmacieByNom(String nom_pharmacie) {

        String requete = "select * from pharmacie where nom_pharmacie=?";
        try {
            List<Pharmacie> lPhar = new ArrayList<Pharmacie>();
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom_pharmacie);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Pharmacie pharm = new Pharmacie();
                pharm.setCode_pharmacie(resultat.getInt(1));
                pharm.setNom_pharmacie(resultat.getString(2));
                pharm.setAdresse_pharmacie(resultat.getString(3));
                pharm.setTel_pharmacie(resultat.getInt(4));
                pharm.setType_pharmacie(resultat.getString(5));
                pharm.setGouvernerat(resultat.getString(6));
                lPhar.add(pharm);
            }
            return lPhar;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche par nom !! " + ex.getMessage());
            return null;
        }
    }

    public List<Pharmacie> findPharmacieByType(String type_pharmacie) {
        String requete = "select * from pharmacie where type_pharmacie=?";
        try {
            List<Pharmacie> lPhar = new ArrayList<Pharmacie>();
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, type_pharmacie);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Pharmacie pharm = new Pharmacie();

                pharm.setCode_pharmacie(resultat.getInt(1));
                pharm.setNom_pharmacie(resultat.getString(2));
                pharm.setAdresse_pharmacie(resultat.getString(3));
                pharm.setTel_pharmacie(resultat.getInt(4));
                pharm.setType_pharmacie(resultat.getString(5));
                pharm.setGouvernerat(resultat.getString(6));
                lPhar.add(pharm);
            }
            return lPhar;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche par type !! " + ex.getMessage());
            return null;
        }
    }

    public List<Pharmacie> findPharmacieByAdresse(String adresse_pharmacie) {
        String requete = "select * from pharmacie where adresse_pharmacie=?";
        try {
            List<Pharmacie> lPhar = new ArrayList<Pharmacie>();
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, adresse_pharmacie);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Pharmacie pharm = new Pharmacie();

                pharm.setCode_pharmacie(resultat.getInt(1));
                pharm.setNom_pharmacie(resultat.getString(2));
                pharm.setAdresse_pharmacie(resultat.getString(3));
                pharm.setTel_pharmacie(resultat.getInt(4));
                pharm.setType_pharmacie(resultat.getString(5));
                pharm.setGouvernerat(resultat.getString(6));
                lPhar.add(pharm);
            }
            return lPhar;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche par adresse !! " + ex.getMessage());
            return null;
        }
    }

    public List<Pharmacie> findPharmacieBytel(String tel_pharmacie) {
        String requete = "select * from pharmacie where tel_pharmacie=?";
        try {
            List<Pharmacie> lPhar = new ArrayList<Pharmacie>();
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, tel_pharmacie);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Pharmacie pharm = new Pharmacie();

                pharm.setCode_pharmacie(resultat.getInt(1));
                pharm.setNom_pharmacie(resultat.getString(2));
                pharm.setAdresse_pharmacie(resultat.getString(3));
                pharm.setTel_pharmacie(resultat.getInt(4));
                pharm.setType_pharmacie(resultat.getString(5));
                pharm.setGouvernerat(resultat.getString(6));
                lPhar.add(pharm);
            }
            return lPhar;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche par telephone !! " + ex.getMessage());
            return null;
        }
    }

    public List<Pharmacie> DisplayAllFharmacies() {

        List<Pharmacie> listePharmacie = new ArrayList<Pharmacie>();

        String requete = "select * from pharmacie";
        try {

            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();

            while (resultat.next()) {
                Pharmacie pharm = new Pharmacie();
                pharm.setCode_pharmacie(resultat.getInt(1));
                pharm.setNom_pharmacie(resultat.getString(2));
                pharm.setAdresse_pharmacie(resultat.getString(3));
                pharm.setTel_pharmacie(resultat.getInt(4));
                pharm.setType_pharmacie(resultat.getString(5));
                pharm.setEtat(resultat.getString(6));
                pharm.setGouvernerat(resultat.getString(7));

                listePharmacie.add(pharm);
            }
            return listePharmacie;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;
        }
    }
    
    
    public int EtatPharmacieNormale() {

        String requete = "select * from pharmacie where etat='normale';";
        try {
            java.sql.PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();

            int nb = 0;
            while (resultat.next()) {
                nb = nb + 1;
            }
            return nb;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des etats des pharmacie " + ex.getMessage());
            return -1;
        }
    }
    public int getEtatPharmacieMoyenne() {

        String requete = "select * from pharmacie where etat='moyenne';";
        try {
            java.sql.PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();

            int nb = 0;
            while (resultat.next()) {
                nb = nb + 1;
            }
            return nb;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des etats de pharmacie " + ex.getMessage());
            return -1;
        }
    }

    public int getEtatPharmacieExecelon() {

        String requete = "select * from pharmacie where etat='excelon';";
        try {
            java.sql.PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();

            int nb = 0;
            while (resultat.next()) {
                nb = nb + 1;
            }
            return nb;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des etats des pharmacie " + ex.getMessage());
            return -1;
        }
    }
}



