/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package View_cote_client;

import Servicepackage.GestionCompteClientService;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class SupprimercompteController implements Initializable {
    @FXML
    private Label lb1;
     private Connection cnx;
    private PreparedStatement pst;
    private Alert alertSupp = new Alert(Alert.AlertType.INFORMATION);
   
    int index;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
          System.out.println("initialize..."); // TODO
    }

@FXML
    public void supp_compte_on_action1(ActionEvent event) { //si on clique sur le bouton confirmer
     
        GestionCompteClientService clientservice= new GestionCompteClientService();
        try { 
            clientservice.supprimer(index);
        } catch (SQLException ex) {
            Logger.getLogger(SupprimercompteController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SupprimercompteController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Stage stage =(Stage) lb1.getScene().getWindow();
        stage.close();
        alertSupp.setTitle("Suppression compte client");
            alertSupp.setHeaderText(null);
            alertSupp.setContentText(" Le compte client  a été supprimer avec succees");
            alertSupp.showAndWait();
    }  
    
    public void close_on_action1(ActionEvent event) {
     Stage stage =(Stage) lb1.getScene().getWindow();
       stage.close();
    }
    
}
