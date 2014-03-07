/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tunif;

import PackageDAO.PharmacieDAO;
import PackageClass.Pharmacie;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USER
 */
public class AffichePharmacie extends AbstractTableModel{

List <Pharmacie> pharmacie;
String [] columTab = {"Code_pharmacie", "Propriétaire","Adresse","Telephone","Type","Etat","Gouvernerat"};
    public AffichePharmacie() {
        PharmacieDAO pharmacieDAO = new PharmacieDAO();
        pharmacie = pharmacieDAO.DisplayAllFharmacies();

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
          case 5: return pharmacie.get(rowIndex).getEtat();
          case 6: return pharmacie.get(rowIndex).getGouvernerat();    
              
          default: return null;
       }
    }

    @Override
    public String getColumnName(int column) {
       return  columTab[column];
    }



}
