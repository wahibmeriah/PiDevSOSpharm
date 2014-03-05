/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunif;

import PackageClass.Pharmacie;
import PackageDAO.PharmacieDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Med
 */

public class Affiche_Adresse extends AbstractTableModel {
    List <Pharmacie> pharmacie = new ArrayList<Pharmacie>();
Pharmacie phar;
String v1;
String [] columTab = {"Code_pharmacie", "Propriétaire","Adresse","Telephone","Type","Gouvernerat"};
    public Affiche_Adresse() {
         PharmacieDAO pharmacieDAO = new PharmacieDAO();
        pharmacie = pharmacieDAO.DisplayAllFharmacies();

    }
    
    public Affiche_Adresse(String v1 ){
        PharmacieDAO pharmacieDAO = new PharmacieDAO();
        pharmacie= pharmacieDAO.findPharmacieByAdresse(v1);
   
       // pharmacie = pharmacieDAO.DisplayAllFharmacies();

    }

    @Override
    public int getRowCount() {
       return  pharmacie.size();
    }

    @Override
    public int getColumnCount() {
        return columTab.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex)
       {
          case 0 : return pharmacie.get(rowIndex).getCode_pharmacie();
          case 1 : return pharmacie.get(rowIndex).getNom_pharmacie();
          case 2: return pharmacie.get(rowIndex).getAdresse_pharmacie();
          case 3: return pharmacie.get(rowIndex).getTel_pharmacie();
          case 4: return pharmacie.get(rowIndex).getType_pharmacie();  
               case 5: return pharmacie.get(rowIndex).getGouvernerat();   
              
          default: return null;
       }
    }
    
       @Override
    public String getColumnName(int column) {
       return columTab[column];
    }
    
    
}
