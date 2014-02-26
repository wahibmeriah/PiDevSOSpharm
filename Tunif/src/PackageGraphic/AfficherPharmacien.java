/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PackageGraphic;

import PackageClass.Pharmacien;
import PackageDAO.PharmacienDAO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USER
 */
public class AfficherPharmacien extends AbstractTableModel{

List <Pharmacien> pharmacien;
String [] columTab = {"IDpharmacien","Login","Mot de Passe","Email","Nom","Prenom"};
    public AfficherPharmacien() {
        PharmacienDAO pharmacienDAO = new PharmacienDAO();
        pharmacien = pharmacienDAO.DisplayAllpharmaciens();

    }


@Override
    public int getRowCount() {
       return  pharmacien.size();
    }

@Override
    public int getColumnCount() {
       return columTab.length;
    }

@Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex)
       {
          case 0 : return pharmacien.get(rowIndex).getId_pharm();
          case 1 : return pharmacien.get(rowIndex).getLogin_pharm();
          case 2: return pharmacien.get(rowIndex).getMdp_pharm();
          case 3: return pharmacien.get(rowIndex).getEmail_pharm();
          case 4: return pharmacien.get(rowIndex).getNom_pharm();
          case 5: return pharmacien.get(rowIndex).getPre_pharm();
              
              
          default: return null;
       }
    }

    @Override
    public String getColumnName(int column) {
       return  columTab[column];
    }



}
