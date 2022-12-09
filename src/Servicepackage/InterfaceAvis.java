/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicepackage;

import Entitepackage.Avis;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public interface InterfaceAvis <A> {
    
    
    public void delete (Avis a);
    ArrayList<A>readAll();
    
}
