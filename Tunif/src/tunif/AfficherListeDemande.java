/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunif;

import PackageClass.Test;
import PackageDAO.TestDAO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Meriah
 */
public class AfficherListeDemande extends AbstractTableModel {
    List <Test> listeD;
String [] columTab = {"Nom", "Prénom","Email","Login","Mot de passe "};

    public AfficherListeDemande() {
        
          TestDAO test = new TestDAO();
        listeD = test.DisplayAllTest();
    }
    
    

    @Override
    public int getRowCount() {
        return listeD.size();
    }

    @Override
    public int getColumnCount() {
        return columTab.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
       {
          case 0: return  listeD.get(rowIndex).getNom_pharm();
          case 1: return  listeD.get(rowIndex).getPre_pharm();
          case 2: return  listeD.get(rowIndex).getEmail_pharm();
          case 3: return  listeD.get(rowIndex).getLogin_pharm();
          case 4: return  listeD.get(rowIndex).getMdp_pharm();
    
              
              
          default: return null;
       }
    }
      @Override
    public String getColumnName(int column) {
       return  columTab[column];
    }
    
}
