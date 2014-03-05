/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tunif;

import PackageDAO.PharmacieDAO;
import PackageClass.Pharmacie;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USER
 */
public class AfficherPharmacie extends AbstractTableModel{

List <Pharmacie> pharmacie = new ArrayList<Pharmacie>();
Pharmacie phar;
int v1;

String [] columTab = {"Code_pharmacie", "Propriétaire","Adresse","Telephone","Type","Gouvernerat"};
    public AfficherPharmacie() {
        PharmacieDAO pharmacieDAO = new PharmacieDAO();
        pharmacie = pharmacieDAO.DisplayAllFharmacies();

    }
public AfficherPharmacie(int v1 ){
        pharmacie.clear();
        PharmacieDAO pharmacieDAO = new PharmacieDAO();
       
        phar= pharmacieDAO.findPharmacieById(v1);
      
      
        pharmacie.add(phar);
        
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
       return  columTab[column];
    }



}
