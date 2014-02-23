/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageClass;

/**
 *
 * @author Med
 */
public class Pharmacie {
    
        private int code_pharmacie;
        private String nom_pharmacie;
        private String adresse_pharmacie;
        private int tel_pharmacie;
        private String type_pharmacie;
        
        public Pharmacie(int code_pharmacie,String nom_pharmacie,String adresse_pharmacie,int tel_pharmacie,String type_pharmacie){
        this.code_pharmacie=code_pharmacie;
        this.nom_pharmacie=nom_pharmacie;
        this.adresse_pharmacie=adresse_pharmacie;
        this.tel_pharmacie=tel_pharmacie;
        this.type_pharmacie=type_pharmacie;
        }

    public Pharmacie() {
       
    }

    public int getCode_pharmacie() {
        return code_pharmacie;
    }

    public String getNom_pharmacie() {
        return nom_pharmacie;
    }

    public String getAdresse_pharmacie() {
        return adresse_pharmacie;
    }

    public int getTel_pharmacie() {
        return tel_pharmacie;
    }

    public String getType_pharmacie() {
        return type_pharmacie;
    }

    public void setCode_pharmacie(int code_pharmacie) {
        this.code_pharmacie = code_pharmacie;
    }

    public void setNom_pharmacie(String nom_pharmacie) {
        this.nom_pharmacie = nom_pharmacie;
    }

    public void setAdresse_pharmacie(String adresse_pharmacie) {
        this.adresse_pharmacie = adresse_pharmacie;
    }

    public void setTel_pharmacie(int tel_pharmacie) {
        this.tel_pharmacie = tel_pharmacie;
    }

    public void setType_pharmacie(String type_pharmacie) {
        this.type_pharmacie = type_pharmacie;
    }

    @Override
    public String toString() {
        return "Pharmacie{" + "code_pharmacie=" + code_pharmacie + ", nom_pharmacie=" + nom_pharmacie + ", adresse_pharmacie=" + adresse_pharmacie + ", tel_pharmacie=" + tel_pharmacie + ", type_pharmacie=" + type_pharmacie + '}';
    }
        
}
