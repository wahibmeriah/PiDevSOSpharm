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
public class User {
    
    private String nom;
    private String Prenom;
    private int tel;
    private String email;

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public int getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String nom, String Prenom, int tel, String email) {
        this.nom = nom;
        this.Prenom = Prenom;
        this.tel = tel;
        this.email = email;
    }

    public User() {
    }
    
    
}
