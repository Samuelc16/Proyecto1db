/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.personas.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    
   
    private static Connection conect;
    public static void conectar(){
    
        String url = "jdbc:mysql://localhost:3306/proyecto1db?serverTimeZone=UTC";
        String usr = "root";
        String ctr = "1234";
                        
        try {
            conect= DriverManager.getConnection(url, usr, ctr);
            JOptionPane.showMessageDialog(null, "Conexion establecida");
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
                    
    }

    public static Connection getConect() {
        return conect;
    }
    
    
   
   
    
    
}
