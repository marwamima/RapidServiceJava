/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package View_cote_client;

import Servicepackage.GestionCompteClientService;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import Entitepackage.Client;
import BDpackage.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class Espaceclient2Controller implements Initializable {

    @FXML
    private Label idNom;
    @FXML
    private Label idPrenom;
    @FXML
    private TextField textnom;
    @FXML
    private TextField textprenom;
    @FXML
    private Label idVille;
    @FXML
    private TextField textville;
    @FXML
    private Label idTel;
    @FXML
    private TextField texttel;
    @FXML
    private Label idMail;
    @FXML
    private TextField textmail;
    @FXML
    private Label idPassword;
    @FXML
    private TextField textpassword;
    @FXML
    private JFXButton idexecute;
    @FXML
    private JFXButton idoui;
     @FXML
    private Label idlabel;
    @FXML
    private JFXButton idnon;
    @FXML
    private Alert alertmodification= new Alert(Alert.AlertType.INFORMATION);
    
    
    private String nom=null;
    private String prenom=null;
    private String ville=null;
    private String tel=null;
    private String mail=null;
    private String password=null;
    
    private FXMLLoader fxmlLoader = null;
        private Parent root1=null;
        private Stage stage=null;
    
    private String checkQuery=null;
    private String SQLQuery=null;
    private Connection updateConn=null;
    private PreparedStatement updateSt=null;
    private ResultSet updateRs=null;

    int index;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
      private void getUpdateDetails(){ //on recupere les données saisies dans des variables
        nom=textnom.getText();
        prenom=textprenom.getText();
        ville=textville.getText();
        tel=texttel.getText();
        mail=textmail.getText();
        password=textpassword.getText();
    }
      private boolean validateUpdateDetails(){ //on fait le controle de saisie sur les données
        getUpdateDetails();
        if(nom.isEmpty()){
            alertmodification.setTitle("le champ nom est vide");
            alertmodification.setHeaderText(null);
            alertmodification.setContentText("Remplir le champ nom");
            alertmodification.showAndWait();
            return false;
        }
        else if(prenom.isEmpty()){
            alertmodification.setTitle("le champ prenom est vide");
            alertmodification.setHeaderText(null);
            alertmodification.setContentText("Remplir le champ prenom");
            alertmodification.showAndWait();
            return false;
        }
        else if(ville.isEmpty()){
            alertmodification.setTitle("le champ ville est vide");
            alertmodification.setHeaderText(null);
            alertmodification.setContentText("Remplir le champ ville");
            alertmodification.showAndWait();
            return false;
        }
        else if(tel.isEmpty()){
            alertmodification.setTitle("le champ tel est vide");
            alertmodification.setHeaderText(null);
            alertmodification.setContentText("Remplir le champ tel");
            alertmodification.showAndWait();
            return false;
        } 
         
        else if(mail.isEmpty()){
            alertmodification.setTitle("le champ mail est vide");
            alertmodification.setHeaderText(null);
            alertmodification.setContentText("Remplir le champ mail");
            alertmodification.showAndWait();
            return false;
        }
              
        else if(password.isEmpty()){
            alertmodification.setTitle("le champ password est vide");
            alertmodification.setHeaderText(null);
            alertmodification.setContentText("Remplir le champ password");
            alertmodification.showAndWait();
            return false;
        }
        else {
            return true;
        }
    }

      private void modifier_infos() {
           getUpdateDetails();
          // GestionCompteClientService Clientservice= new GestionCompteClientService();
//           ArrayList<Client> listclient = Clientservice.modifier(cl);
         
              checkQuery="SELECT * FROM client WHERE id_client='"+index+"';";
              SQLQuery= "UPDATE client SET nom='"+nom+"',prenom='"+prenom+"',ville='"+ville+"',tel='"+tel+"', mail='"+mail+"', password='"+password+"' WHERE id_client='"+index+"';";
          try {
              updateConn = DataSource.getInstance().getConnection();
              updateRs = updateConn.createStatement().executeQuery(checkQuery);
               if(updateRs.next()){
                updateSt = updateConn.prepareStatement(SQLQuery);
                updateSt.executeUpdate();
                alertmodification.setTitle("Modification a été réussie");
                alertmodification.setHeaderText(null);
                alertmodification.setContentText("Données sont modifiées");
                alertmodification.showAndWait();
            }
            else {
                alertmodification.setTitle("Modification a été echouée");
                alertmodification.setHeaderText(null);
                alertmodification.setContentText("Données ne sont pas modifiées");
                alertmodification.showAndWait();
            }
        }catch (SQLException e){
            e.printStackTrace();}
        /* }finally {
            if(updateSt!=null){
                updateSt.close();
            }
            if (updateRs!=null){
                updateRs.close();
            }
            if (updateConn!=null){
                updateConn.close();
            }
        }*/
    
      
              
          }
      
        @FXML
    public void updateDetails(ActionEvent actionevent) {
        boolean checkStatus=validateUpdateDetails();
        if(checkStatus){
            modifier_infos();
        }
    }
    
           @FXML
    public void Supp_Compte_On_Action(ActionEvent event)  {
     fxmlLoader = new FXMLLoader(getClass().getResource("../View_cote_client/supprimercompte.fxml"));
        try {
            root1 = (Parent) fxmlLoader.load();
        } catch (IOException ex) {
            Logger.getLogger(Espaceclient2Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
                stage = new Stage();
                stage.setTitle("Suppression compte client");
                stage.setScene(new Scene(root1));
                stage.show();
    }  
    @FXML
     public void Close_On_Action(ActionEvent event)  {
    Stage stage =(Stage) idlabel.getScene().getWindow();
       stage.close();
    }



    }
    
    
    
      
    
