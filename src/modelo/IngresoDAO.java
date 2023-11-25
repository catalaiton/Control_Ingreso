/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arjuna
 */
public class IngresoDAO {
    Ingreso objI;

    public IngresoDAO(Ingreso objI) {
        this.objI = objI;
    }

    public IngresoDAO() {
        this.objI = new Ingreso();
    }
    
    //Consultar registros de la BD
    public DefaultTableModel consultar(){
         DefaultTableModel plantilla= new DefaultTableModel();
         ConexionBD con= new ConexionBD();
        try {
           con.conectar();
           Statement consulta= con.getConexion().createStatement();
            ResultSet datos= consulta.executeQuery("select * from ingreso");
            ResultSetMetaData campos=datos.getMetaData();
            for (int i = 1; i <= campos.getColumnCount(); i++) {
                plantilla.addColumn(campos.getColumnName(i));
            }
            while(datos.next()){
             Object fila[]=new Object[campos.getColumnCount()];
                for (int i = 0; i < campos.getColumnCount(); i++) {
                   fila[i]=datos.getObject(i+1);
                }
                plantilla.addRow(fila);
            }
            datos.close();
            con.getConexion().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return plantilla;
    }
    
    //Filtros para la BD
    
    public DefaultTableModel FiltrarEstudiantes(){
         DefaultTableModel plantilla= new DefaultTableModel();
         ConexionBD con= new ConexionBD();
        try {
           con.conectar();
           Statement consulta= con.getConexion().createStatement();
            ResultSet datos= consulta.executeQuery("select * from ingreso where motivo = 'Estudiante'");
            ResultSetMetaData campos=datos.getMetaData();
            for (int i = 1; i <= campos.getColumnCount(); i++) {
                plantilla.addColumn(campos.getColumnName(i));
            }
            while(datos.next()){
             Object fila[]=new Object[campos.getColumnCount()];
                for (int i = 0; i < campos.getColumnCount(); i++) {
                   fila[i]=datos.getObject(i+1);
                }
                plantilla.addRow(fila);
            }
            datos.close();
            con.getConexion().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return plantilla;
    }
    
    public DefaultTableModel FiltrarDocentes(){
         DefaultTableModel plantilla= new DefaultTableModel();
         ConexionBD con= new ConexionBD();
        try {
           con.conectar();
           Statement consulta= con.getConexion().createStatement();
            ResultSet datos= consulta.executeQuery("select * from ingreso where motivo = 'Docente'");
            ResultSetMetaData campos=datos.getMetaData();
            for (int i = 1; i <= campos.getColumnCount(); i++) {
                plantilla.addColumn(campos.getColumnName(i));
            }
            while(datos.next()){
             Object fila[]=new Object[campos.getColumnCount()];
                for (int i = 0; i < campos.getColumnCount(); i++) {
                   fila[i]=datos.getObject(i+1);
                }
                plantilla.addRow(fila);
            }
            datos.close();
            con.getConexion().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return plantilla;
    }
    
    public DefaultTableModel FiltrarAdministrativos(){
         DefaultTableModel plantilla= new DefaultTableModel();
         ConexionBD con= new ConexionBD();
        try {
           con.conectar();
           Statement consulta= con.getConexion().createStatement();
            ResultSet datos= consulta.executeQuery("select * from ingreso where motivo = 'Administrativo'");
            ResultSetMetaData campos=datos.getMetaData();
            for (int i = 1; i <= campos.getColumnCount(); i++) {
                plantilla.addColumn(campos.getColumnName(i));
            }
            while(datos.next()){
             Object fila[]=new Object[campos.getColumnCount()];
                for (int i = 0; i < campos.getColumnCount(); i++) {
                   fila[i]=datos.getObject(i+1);
                }
                plantilla.addRow(fila);
            }
            datos.close();
            con.getConexion().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return plantilla;
    }
    
    public DefaultTableModel FiltrarTrabajadores(){
         DefaultTableModel plantilla= new DefaultTableModel();
         ConexionBD con= new ConexionBD();
        try {
           con.conectar();
           Statement consulta= con.getConexion().createStatement();
            ResultSet datos= consulta.executeQuery("select * from ingreso where motivo = 'Trabajador'");
            ResultSetMetaData campos=datos.getMetaData();
            for (int i = 1; i <= campos.getColumnCount(); i++) {
                plantilla.addColumn(campos.getColumnName(i));
            }
            while(datos.next()){
             Object fila[]=new Object[campos.getColumnCount()];
                for (int i = 0; i < campos.getColumnCount(); i++) {
                   fila[i]=datos.getObject(i+1);
                }
                plantilla.addRow(fila);
            }
            datos.close();
            con.getConexion().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return plantilla;
    }
    
    public DefaultTableModel FiltrarVisitantes(){
         DefaultTableModel plantilla= new DefaultTableModel();
         ConexionBD con= new ConexionBD();
        try {
           con.conectar();
           Statement consulta= con.getConexion().createStatement();
            ResultSet datos= consulta.executeQuery("select * from ingreso where motivo = 'Visitante'");
            ResultSetMetaData campos=datos.getMetaData();
            for (int i = 1; i <= campos.getColumnCount(); i++) {
                plantilla.addColumn(campos.getColumnName(i));
            }
            while(datos.next()){
             Object fila[]=new Object[campos.getColumnCount()];
                for (int i = 0; i < campos.getColumnCount(); i++) {
                   fila[i]=datos.getObject(i+1);
                }
                plantilla.addRow(fila);
            }
            datos.close();
            con.getConexion().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return plantilla;
    }

    
    //Insertar Ingresos a la BD
    public String insertar2(){
        String mensaje="";
        try{
            ConexionBD conexion = new ConexionBD();
            PreparedStatement consulta = null;
            conexion.conectar();
            String comando = "INSERT INTO ingreso VALUES (?,?,?,?,?,?,?,?)";
            consulta = conexion.getConexion().prepareStatement(comando);
            
            consulta.setString(1, objI.getPuerta());
            consulta.setString(2, objI.getNombre());
            consulta.setString(3, objI.getTipoDocumento());
            consulta.setString(4, objI.getnDocumento());
            consulta.setString(5, objI.getIngreso());
            consulta.setString(6, objI.getMotivo());
            consulta.setString(7, objI.getPlacas());
            consulta.setString(8, "Entrada");
            consulta.execute();
            mensaje="Registro exitoso...";
            consulta.close();
            conexion.getConexion().close();
        }catch(SQLException ex){
            mensaje="Error al intentar insertar...\n"+ex;
        }
       return mensaje;
    }
    
    //Busqueda
    
    public void BuscarIngreso(String nDocumentoI,JTextField PuertaRES, JTextField NombreRES,JTextField TipoDocumentoRES,JTextField NDocumentoRES, JTextField IngresoRES,JTextField MotivoRES,JTextField PlacasRES,JTextField EstadoRES){
        ConexionBD con = new ConexionBD();

        try {
            con.conectar();
            Statement consulta = con.getConexion().createStatement();
            ResultSet datos = consulta.executeQuery("SELECT * FROM ingreso WHERE nDocumento = '" + nDocumentoI +  "'");

            if (datos.next()) {
                JOptionPane.showMessageDialog(null, "Registro Encontrado");
                PuertaRES.setText(datos.getString("Puerta"));
                NombreRES.setText(datos.getString("Nombre"));
                TipoDocumentoRES.setText(datos.getString("TipoDocumento"));
                NDocumentoRES.setText(datos.getString("nDocumento"));
                IngresoRES.setText(datos.getString("Ingreso"));
                MotivoRES.setText(datos.getString("Motivo"));
                PlacasRES.setText(datos.getString("Placas"));
                EstadoRES.setText(datos.getString("Estado"));
                
            } else {
                JOptionPane.showMessageDialog(null, "Registro NO Encontrado");
                PuertaRES.setText("");
                NombreRES.setText("");
                TipoDocumentoRES.setText("");
                NDocumentoRES.setText("");
                IngresoRES.setText("");
                MotivoRES.setText("");
                PlacasRES.setText("");
                EstadoRES.setText("");
            }

            datos.close();
            con.getConexion().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR "+ ex);
            ex.printStackTrace(); // Imprime la excepción para obtener más detalles.
        }
    }
    
    //Modificar estado de ingreso a salida
    public String ActualizarSalida(String Documento) {
        String mensaje = "";
        try {
            ConexionBD conexion = new ConexionBD();
            PreparedStatement consulta = null;
            conexion.conectar();
            String instruccion = "update ingreso "
                    + "set estado=? where nDocumento='" + Documento + "'";
            consulta = conexion.getConexion().prepareStatement(instruccion);
            consulta.setString(1, "Salida");
            consulta.execute();
             mensaje = "Registro de salida exitoso...";
            consulta.close();
            conexion.getConexion().close();

        } catch (SQLException ex) {
            mensaje = "Error al intentar actualizar...\n" + ex;
        }
        return mensaje;
    }
    
    //salida
 
    public String permisoSalida(String Documento, String Placas) {
        String mensaje = "";
        ConexionBD con = new ConexionBD();

        try {
            con.conectar();
            Statement consulta = con.getConexion().createStatement();
            ResultSet datos = consulta.executeQuery("SELECT * FROM ingreso WHERE nDocumento = '" + Documento + "' AND placas = '" + Placas + "'");

            if (datos.next()) {
                mensaje = "Salida autorizada";
            } else {
                mensaje = "Salida denegada";
            }

            datos.close();
            con.getConexion().close();
        } catch (SQLException ex) {
            mensaje = "Error al intentar buscar el permiso de salida...\n" + ex;
            ex.printStackTrace(); // Imprime la excepción para obtener más detalles.
        }

        return mensaje;
    }

    public Ingreso getObjI() {
        return objI;
    }

    public void setObjI(Ingreso objI) {
        this.objI = objI;
    }

    @Override
    public String toString() {
        return objI.toString();
    }
    
    
}