/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicepackage;
import BDpackage.DataSource;
import Entitepackage.Prestataire;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class GestionComptePrestataireService implements InterfacePrestataire<Prestataire>{
    
    private Connection cnx;
    private Statement ste;
    private PreparedStatement pst;
    private ResultSet rs;
    
    
    public GestionComptePrestataireService (){
    
     cnx = BDpackage.DataSource.getInstance().getConnection();
    
    } 

    @Override
    public boolean modifier(Prestataire pr, int index) throws SQLException, ClassNotFoundException {
      try {
            
            PreparedStatement ste;
            
            ste = DataSource.getInstance().getConnection().prepareStatement("UPDATE prestataire SET nom=?,prenom=?,ville=?,tel=?, mail=?, password=?, experience=?, nomService=?, typeService WHERE id_Prestataire='"+index+"';");
            
            ste.setString(1,pr.getnom());
            ste.setString(2, pr.getprenom());
            ste.setString(3, pr.getville());
            ste.setInt(4, pr.gettel());
            ste.setString(5,pr.getmail());
            ste.setString(6,pr.getpassword());
            ste.setString(7,pr.getexperience());
            ste.setString(8,pr.getnomService());
            ste.setString(9,pr.gettypeService());
            
            
            
            ste.executeUpdate();
            
           return (ste.executeUpdate()>0); 
            
            
            

        } catch (SQLException ex) {
            Logger.getLogger(GestionComptePrestataireService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false; 
    }

    @Override
    public boolean supprimer(int index) throws SQLException, ClassNotFoundException {
        try {
            String requete ="DELETE FROM prestataire WHERE id_Prestataire='" + index + "';";
            pst=cnx.prepareStatement(requete);
            pst.executeUpdate();
            return (pst.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(GestionComptePrestataireService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; 
    }
    
}
