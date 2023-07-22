/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.vista;

/**
 *
 * @author RYZEN
 */
public class ControladorPantallas {
    
    private static VPersona pantallaPersona;
    
    
    public static void abrirPantallaExEmpleado(){
    
        pantallaPersona= new VPersona();
        pantallaPersona.setVisible(true);
        pantallaPersona.setLocationRelativeTo(null);
    }
    public static void cerrarPantallaExEmpleado(){
        
        pantallaPersona.setVisible(false);
        pantallaPersona=null;
    
    }
}
