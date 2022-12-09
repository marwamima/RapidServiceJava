/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package View_cote_client;

import Entitepackage.Client;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import static javax.swing.UIManager.getInt;
import BDpackage.DataSource;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class EspaceClient1Controller implements Initializable {
    
     public AnchorPane rootPane;
    @FXML
    private Button btn_modifier_infos;
    @FXML
    private Button btn_supprimer_compte;
    
   

  
    /**
     * Initializes the controller class.
     */

   @Override
    public void initialize(URL url, ResourceBundle rb) {
          System.out.println("initialize");
    }
   
    
    
 @FXML
    public void modifier_infos_OnAction(ActionEvent actionEvent) {
        Stage primaryStage= new Stage() ;
        Parent root=null;
         try {
             root = FXMLLoader.load(getClass().getResource("../View_cote_client/espaceclient2.fxml"));
         } catch (IOException ex) {
             Logger.getLogger(EspaceClient1Controller.class.getName()).log(Level.SEVERE, null, ex);
         }
        primaryStage.setTitle("Gestion compte prestataire ");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    
   



}
   

  
