/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PackageDAO;

import PackageClass.Service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utill.MyConnection;

/**
 *
 * @author ESPRIT
 */
public class ServiceDAO {
    
      public List<Service> DisplayAllService (){


        List<Service> listeService = new ArrayList<Service>();

        String requete = "select typeservice from service";
        try {
          
           PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
              ResultSet resultat = ps.executeQuery();
            

            while(resultat.next()){
                Service Se =new Service();
                Se.setTypeservice(resultat.getString(1));
              
                listeService.add(Se);
            }
            return listeService;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
      }
}
    
    
    
    
    

