
package com.mycompany.proyecto.personas.controlador;

import com.mycompany.proyecto.modelo.ExEmpleado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RYZEN
 */
public class CExEmpleado {
    
    public void registarEmpleado(ExEmpleado e){
    
        try {
            Statement st= Conexion.getConect().createStatement();
            st.execute("insert into exempleado values ('"+e.getCodigo()+"', '"+e.getNombre()+"', '"+e.getApellido()+"', '"+e.getEdad()+"', '"+e.getTelefono()+"') ");
            JOptionPane.showMessageDialog(null, "Registrado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CExEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Alerta, usuario no registrado");
        }
        
    }
    public ResultSet consultarEmpleado(){
        ResultSet rs=null;
        
        
        try {
            Statement st= Conexion.getConect().createStatement();
            rs =st.executeQuery("select * from exempleado ");
            
        } catch (SQLException ex) {
            Logger.getLogger(CExEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return rs;
    }
    public ResultSet consultarEmpleadoPorId(int codigo){
                       
        ResultSet rs=null;
        
                try {
            Statement st= Conexion.getConect().createStatement();
            rs =st.executeQuery("select * from exempleado where codigo='"+codigo+"' ");
            
        } catch (SQLException ex) {
            Logger.getLogger(CExEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return rs;
    }
    public void modificarEmpleado(ExEmpleado e){
    
        
        try {
            Statement st= Conexion.getConect().createStatement();
            st.execute("update exempleado set nombre='"+e.getNombre()+"', apellido='"+e.getApellido()+"', edad='"+e.getEdad()+"', telefono='"+e.getTelefono()+"' where codigo='"+e.getCodigo()+"' ");
            JOptionPane.showMessageDialog(null, "Usuario actualizado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CExEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    
    
    
    
    }
    public void eliminarEmpleado(int codigo){
    
         try {
            Statement st= Conexion.getConect().createStatement();
            st.execute("delete from exempleado where codigo= '"+codigo+"'");
            JOptionPane.showMessageDialog(null, "Usuario eliminado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CExEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Alerta, usuario no eliminado");
        }
        
    }
    
    
    public void pintarTabla (JTable tabla, ResultSet rs){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("codigo");
        modelo.addColumn("nombre");
        modelo.addColumn("apellido");
        modelo.addColumn("edad");
        modelo.addColumn("telefono");
    
        
        try {
            while (rs.next()){
                
                String[]fila={rs.getString("codigo"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("edad"),rs.getString("telefono"),};
                        modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(CExEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
