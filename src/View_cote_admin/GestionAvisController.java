/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package View_cote_admin;

import java.net.URL;
import Entitepackage.Avis;
import Servicepackage.GestionAvisService;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class GestionAvisController implements Initializable {
    
    @FXML
    private TextField textidavis;
    @FXML
    private TextField textidclient;
    @FXML
    private TextField texttypeavis;
    @FXML
    private TextField textnomservice;
    @FXML
    private TextField textnomsouservice;
    @FXML
    private TextField textidprestataire;
     @FXML
    private TableView<Avis> tableP;
     @FXML
    private TableColumn<Avis, Integer> ColIdAvis;
    @FXML
    private TableColumn<Avis, Integer> ColIdClient;
    @FXML
    private TableColumn<Avis, String> ColTypeAvis;
    @FXML
    private TableColumn<Avis, String> ColNomService;
    @FXML
    private TableColumn<Avis, String> ColNomSousService;
    @FXML
    private TableColumn<Avis, Integer> ColIdPrestataire;
    @FXML
    private Button btnsupprimer;
    @FXML
    private Button btnaficher;
    
    int index = -1;
    Connection cnx = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
  
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      GestionAvisService ps = new GestionAvisService();   
    } 
    
    
    @FXML
    private void getSelected(MouseEvent event) {
         index = tableP.getSelectionModel().getSelectedIndex();
        if (index <= -1){
            return;
        }
        textidavis.setText( ColIdAvis.getCellData(index).toString());
        textidclient.setText(ColIdClient.getCellData(index).toString());
        texttypeavis.setText(ColTypeAvis.getCellData(index).toString());
        textnomservice.setText(ColNomService.getCellData(index).toString());
        textnomsouservice.setText(ColNomSousService.getCellData(index).toString());
        textidprestataire.setText(ColIdPrestataire.getCellData(index).toString());
       
    }
     @FXML
    public void Afficher(ActionEvent event) throws SQLException {
        System.out.println("methode afficher");
        GestionAvisService ps = new GestionAvisService();
        ArrayList<Avis> List;
        List = ps.readAll();
        
        for(Avis a : List) {
            System.out.println(a);
        }

        ObservableList<Avis> obs = FXCollections.observableArrayList(List);

        ColIdAvis.setCellValueFactory(new PropertyValueFactory("idAvis"));
        ColIdClient.setCellValueFactory(new PropertyValueFactory("idClient"));
        ColTypeAvis.setCellValueFactory(new PropertyValueFactory("typeAvis"));
        ColNomService.setCellValueFactory(new PropertyValueFactory("nomService"));
        ColNomSousService.setCellValueFactory(new PropertyValueFactory("nomSousService"));
        ColIdPrestataire.setCellValueFactory(new PropertyValueFactory("idPrestataire"));
       

        
        tableP.setItems(obs);

    }
    public void Supprimer (ActionEvent eventae) throws IOException{
         tableP.getItems().removeAll(tableP.getSelectionModel().getSelectedItem());
    
    }
    
    @FXML
     public void Close_On_Action(ActionEvent event) {
    Stage stage =(Stage) textidavis.getScene().getWindow();
       stage.close();
    }
}
         
    

