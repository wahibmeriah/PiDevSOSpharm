/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PackageClass;

/**
 *
 * @author ESPRIT
 */
public class Service {
    
    private String typeservice;

    public String getTypeservice() {
        return typeservice;
    }

    public Service(String typeservice) {
        this.typeservice = typeservice;
    }

    public Service() {
    }

    @Override
    public String toString() {
        return "Service{" + "typeservice=" + typeservice + '}';
    }

    public void setTypeservice(String typeservice) {
        this.typeservice = typeservice;
    }
    
}
