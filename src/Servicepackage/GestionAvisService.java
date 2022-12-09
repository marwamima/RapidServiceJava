/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicepackage;
import Entitepackage.Avis;
import BDpackage.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;











/**
 *
 * @author Lenovo
 */
public class GestionAvisService implements InterfaceAvis<Avis>{
    private Connection cnx;
    private Statement ste;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public GestionAvisService (){
    
     cnx = BDpackage.DataSource.getInstance().getConnection();
    
    }
    @Override
    public ArrayList<Avis> readAll(){
      
        ArrayList<Avis> List = new ArrayList<>();
         try
          {
           String requete="SELECT * FROM avis";
        
            ste=cnx.createStatement();
            rs = ste.executeQuery(requete); 
            while (rs.next()){
  
                
                    Avis a =new Avis(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getInt(6)
                    );
                    
                   
          
           List.add(a);
        }
    }   catch (SQLException ex) {
            Logger.getLogger(GestionAvisService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return List;
            
          
    }

    @Override
    public void delete(Avis a){
    
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   
    
}
