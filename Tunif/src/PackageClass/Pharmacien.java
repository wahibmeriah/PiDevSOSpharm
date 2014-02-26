/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageClass;

/**
 *
 * @author Med
 */
public class Pharmacien {
    private int id_pharm;
    private String nom_pharm;
    private String pre_pharm;
    private String email_pharm;
    private String login_pharm;
    private String mdp_pharm;

    public Pharmacien(int id_pharm, String nom_pharm, String pre_pharm, String email_pharm, String login_pharm, String mdp_pharm) {
        this.id_pharm = id_pharm;
        this.nom_pharm = nom_pharm;
        this.pre_pharm = pre_pharm;
        this.email_pharm = email_pharm;
        this.login_pharm = login_pharm;
        this.mdp_pharm = mdp_pharm;
    }

    public Pharmacien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_pharm() {
        return id_pharm;
    }

    public String getNom_pharm() {
        return nom_pharm;
    }

    public String getPre_pharm() {
        return pre_pharm;
    }

    public String getEmail_pharm() {
        return email_pharm;
    }

    public String getLogin_pharm() {
        return login_pharm;
    }

    public String getMdp_pharm() {
        return mdp_pharm;
    }

    public void setId_pharm(int id_pharm) {
        this.id_pharm = id_pharm;
    }

    public void setNom_pharm(String nom_pharm) {
        this.nom_pharm = nom_pharm;
    }

    public void setPre_pharm(String pre_pharm) {
        this.pre_pharm = pre_pharm;
    }

    public void setEmail_pharm(String email_pharm) {
        this.email_pharm = email_pharm;
    }

    public void setLogin_pharm(String login_pharm) {
        this.login_pharm = login_pharm;
    }

    public void setMdp_pharm(String mdp_pharm) {
        this.mdp_pharm = mdp_pharm;
    }

    @Override
    public String toString() {
        return "Pharmacien{" + "id_pharm=" + id_pharm + ", nom_pharm=" + nom_pharm + ", pre_pharm=" + pre_pharm + ", email_pharm=" + email_pharm + ", login_pharm=" + login_pharm + ", mdp_pharm=" + mdp_pharm + '}';
    }
    
    
    
}
