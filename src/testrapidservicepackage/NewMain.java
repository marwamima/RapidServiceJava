/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testrapidservicepackage;
import Servicepackage.GestionAvisService;
import Entitepackage.Avis;
import Entitepackage.Client;
import Servicepackage.GestionCompteClientService;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class NewMain {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
    
   GestionAvisService ps = new GestionAvisService();   
   
   Avis a=new Avis(3,3,"mediocre","electricité","installation de prise electriques",1);
   //System.out.println(a);
    ArrayList<Avis> list =ps.readAll();
    list.add(a);
     for(int i = 0; i< list.size(); i++) {
    		
    			System.out.println(list.get(i));
    	}
   
// GestionCompteClientService gestionclient=new GestionCompteClientService();
// Client cl=new Client(1,"Hdhili","ghofrane","tunis",21321800,"hedhili.ghofrane@hotmail.com","rrr");
//  boolean result1=gestionclient.modifier(cl,1);
//  System.out.println(result1);
  GestionCompteClientService gestionclient=new GestionCompteClientService();
  boolean result2=gestionclient.supprimer(1);
  System.out.println(result2);
  
  
   
   
    
}
}