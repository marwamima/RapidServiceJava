/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicepackage;
import Entitepackage.Client;
import BDpackage.DataSource;
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
public class GestionCompteClientService implements InterfaceClient<Client> {
    private Connection cnx;
    private Statement ste;
    private PreparedStatement pst;
    private ResultSet rs;
    
    
    public GestionCompteClientService (){
    
     cnx = BDpackage.DataSource.getInstance().getConnection();
    
    }
    

    @Override
    public boolean modifier(Client cl, int index) throws SQLException, ClassNotFoundException{
        try {
            
            PreparedStatement ste;
            
            ste = DataSource.getInstance().getConnection().prepareStatement("UPDATE client SET nom=?,prenom=?,ville=?,tel=?, mail=?, password=? WHERE id_client='"+index+"';");
            
            ste.setString(1,cl.getNom());
            ste.setString(2, cl.getPrenom());
            ste.setString(3, cl.getVille());
            ste.setInt(4, cl.getTel());
            ste.setString(5,cl.getMail());
            ste.setString(6,cl.getPassword());
            
            
            
            ste.executeUpdate();
            
           return (ste.executeUpdate()>0); 
            
            
            

        } catch (SQLException ex) {
            Logger.getLogger(GestionCompteClientService.class.getName()).log(Level.SEVERE, null, ex);
        }
        //return false;
        return false;
    }

    public boolean supprimer(int index) throws SQLException, ClassNotFoundException{
        try {
            String requete ="DELETE FROM client WHERE id_client='" + index + "';";
            pst=cnx.prepareStatement(requete);
            pst.executeUpdate();
            return (pst.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(GestionCompteClientService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    
    
    
    
}
