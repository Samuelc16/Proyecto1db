package com.mycompany.proyecto;

import com.mycompany.proyecto.personas.controlador.Conexion;
import com.mycompany.proyecto.vista.ControladorPantallas;

public class Proyecto {

    public static void main(String[] args) {
        
        Conexion.conectar();
        ControladorPantallas.abrirPantallaExEmpleado();
        
        
    }
}
