/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tunif;

import PackageClass.Service;
import PackageDAO.ServiceDAO;
import java.util.List;

/**
 *
 * @author ESPRIT
 */
public class AfficheService {
    
List <Service> Service;
String [] columTab = {"Code_pharmacie", "Propriétaire","Adresse","Telephone","Type"};
    public AfficheService() {
        ServiceDAO serviceDAO = new ServiceDAO();
        Service = serviceDAO.DisplayAllService();

    }


    public int getRowCount() {
       return  Service.size();
    }
    
}
