/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entitepackage;

/**
 *
 * @author Lenovo
 */
public class Client {
     private int id_client;
    private String nom;
    private String prenom;
    private String ville;
    private int tel;
    private String mail;
    private String password;
    
     public Client(){
        
    }
     public Client (String nom, String prenom, String ville, int tel, String mail, String password){
         this.nom=nom;
         this.prenom=prenom;
         this.ville=ville;
         this.tel=tel;
         this.mail=mail;
         this.password=password;
     }
     public Client (int id_client,String nom, String prenom, String ville, int tel, String mail, String password){
         this.id_client=id_client;
         this.nom=nom;
         this.prenom=prenom;
         this.ville=ville;
         this.tel=tel;
         this.mail=mail;
         this.password=password;
     }
      public int getIdClient() {
        return id_client;
    }

    public void setIdClient(int id_client) {
        this.id_client = id_client;
    }
    
     public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
      public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
      public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel= tel;
    }
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
   public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;  
    }
    
     @Override
    public String toString() {
        return "Client{" + "id client:" + id_client + ",le nom:" + nom + ",le prenom:" + prenom+ ",ville:" + ville + "tel:" + tel+",mail:" + mail+",le mot de passe:" + password+"}";
              
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
