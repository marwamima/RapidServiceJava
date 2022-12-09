/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicepackage;
import Entitepackage.Client;
import java.sql.SQLException;
/**
 *
 * @author Lenovo
 */
public interface InterfaceClient<Client> {
    
    public boolean modifier (Client cl,int i) throws SQLException, ClassNotFoundException;
    public boolean supprimer (int index) throws SQLException, ClassNotFoundException;
    
}
