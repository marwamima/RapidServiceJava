/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entitepackage;

/**
 *
 * @author Lenovo
 */
public class Prestataire {
    
    
     private int id_Prestataire;
    private String nom;
    private String prenom;
    private String ville;
    private int tel;
    private String mail;
    private String password;
    private String experience;
    private String nomService;
    private String typeService;
    
     public Prestataire(){
        
    }
     public Prestataire (String nom, String prenom, String ville, int tel, String mail, String password, String experience, String nomService, String typeService){
         this.nom=nom;
         this.prenom=prenom;
         this.ville=ville;
         this.tel=tel;
         this.mail=mail;
         this.password=password;
         this.experience=experience;
         this.nomService=nomService;
         this.typeService=typeService;
     }
        
     public Prestataire (int id_Prestataire,String nom, String prenom, String ville, int tel, String mail, String password, String experience, String nomService, String typeService){
         this.id_Prestataire=id_Prestataire;
         this.nom=nom;
         this.prenom=prenom;
         this.ville=ville;
         this.tel=tel;
         this.mail=mail;
         this.password=password;
         this.experience=experience;
         this.nomService=nomService;
         this.typeService=typeService;
     }
    public int getIdPrestataire() {
        return id_Prestataire;
    }

    public void setIdPrestataire(int id_Prestataire) {
        this.id_Prestataire =id_Prestataire;
    }
    
     public String getnom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }
    
    public String getprenom() {
        return prenom;
    }

    public void setprenom(String prenom) {
        this.prenom = prenom;
    }
      public String getville() {
        return ville;
    }

    public void setville(String ville) {
        this.ville= ville;
    }
      public int gettel() {
        return tel;
    }

    public void settel(int tel) {
        this.tel= tel;
    }
    public String getmail() {
        return mail;
    }

    public void setmail(String mail) {
        this.mail = mail;
    }
   public String getpassword(){
        return password;
    }

    public void setpassword(String password) {
        this.password = password;  
    }
    
   
    public String getexperience(){
        return experience;
    }

    public void setexperience(String experience) {
        this.experience= experience;  
    }
    public String getnomService(){
        return nomService;
    }

    public void setnomService(String nomService) {
        this.nomService= nomService;  
    }
    
 public String gettypeService(){
        return typeService;
    }

    public void settypeService(String typeService) {
        this.typeService= typeService;  
    }



 @Override
    public String toString() {
        return "Prestataire{" + "id prestataire:" + id_Prestataire + ",le nom:" + nom + ",le prenom:"+prenom+ ",ville: "+ville+"tel:"+tel+",mail:"+mail+",le mot de passe:"+password+ "experience:"+
       experience+",le nom de service:" + nomService + "le type de service:"  + typeService+"}";
              
    }


















    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
