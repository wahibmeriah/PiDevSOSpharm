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
public class Afficher extends AbstractTableModel {
    List <Test> test;
String [] columTab={""}  ;

    public Afficher() {
         TestDAO pharmacieDAO = new TestDAO();
        test = pharmacieDAO.DisplayAllFharmacies_2();

    }
    

    @Override
    public int getRowCount() {
        return  test.size();
    }

    @Override
    public int getColumnCount() {
        return columTab.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
       {
          case 0 : return test.get(rowIndex).getId_pharm();
        
              
          default: return null;
       }
    }
      @Override
    public String getColumnName(int column) {
       return  columTab[column];
    }
    
}
