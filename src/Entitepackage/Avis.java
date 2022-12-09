/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entitepackage;

/**
 *
 * @author Lenovo
 */
public class Avis {
    
    
    private int idAvis;
    private int idClient;
    private String typeAvis;
    private String nomService;
    private String nomSousService;
    private int idPrestataire;
   
    public Avis(){
        
    }

    public Avis(int idAvis, int idClient, String typeAvis, String nomService, String nomSousService, int idPrestataire) {
        this.idAvis = idAvis;
        this.idClient = idClient;
        this.typeAvis = typeAvis;
        this.nomService = nomService;
        this.nomSousService = nomSousService;
        this.idPrestataire = idPrestataire;
    }
    
    

    public int getIdAvis() {
        return idAvis;
    }

    public void setIdAvis(int idAvis) {
        this.idAvis = idAvis;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getTypeAvis() {
        return typeAvis;
    }

    public void setTypeAvis(String typeAvis) {
        this.typeAvis = typeAvis;
    }

    public String getNomService() {
        return nomService;
    }

    public void setNomService(String nomService) {
        this.nomService = nomService;
    }

    public String getNomSousService() {
        return nomSousService;
    }

    public void setNomSousService(String nomSousService) {
        this.nomSousService = nomSousService;
    }

    public int getIdPrestataire() {
        return idPrestataire;
    }

    public void setIdPrestataire(int idPrestataire) {
        this.idPrestataire = idPrestataire;
    }

    @Override
    public String toString() {
        return "Avis{" + "idAvis=" + idAvis + ", idClient=" + idClient + ", typeAvis=" + typeAvis + ", nomService=" + nomService + ", nomSousService=" + nomSousService + ", idPrestataire=" + idPrestataire + '}';
    }
    
    
    
    
    
}
