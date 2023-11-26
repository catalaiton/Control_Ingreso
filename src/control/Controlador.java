/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.ArchPdf;

import modelo.*;
import vista.*;
/**
 *
 * @author Arjuna
 */
public class Controlador implements ActionListener{
    ListaIngresos ListIngreso;
    Fecha fecha;
    Hora hora;
    frmPrincipal frmP;
    frmBaseD frmBD;
    frmRegistrar frmR;
    Conexion con;
    IngresoDAO ingreso;
    frmSalida frmS;
    frmBusqueda frmB;
    
    public Controlador() {

        this.frmP = new frmPrincipal();
        this.frmR = new frmRegistrar();
        this.ingreso = new IngresoDAO();
        this.con = new Conexion();
        this.ListIngreso = new ListaIngresos();
        this.frmBD = new frmBaseD();
        this.frmS = new frmSalida();
        this.frmB = new frmBusqueda();
        this.fecha = new Fecha();
        this.hora = new Hora();
    }
    
    
    public void iniciar(){
        frmP.getMnuIngreso().addActionListener(this);
        frmP.getMnuBD().addActionListener(this);
        frmP.getMnuPDF().addActionListener(this);   
        frmP.getMnuSalida().addActionListener(this);
        frmP.getMnuSalir().addActionListener(this);
        frmP.getMnuBuscar().addActionListener(this);
        frmP.getPnEscritorio().setBorder(new ImagenEscritorio(new ImageIcon(getClass().getResource("/img/Fondo_Principal.jpg")).getImage()));
        frmP.setLocationRelativeTo(null);
        frmP.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        //PDF
        if ((ae.getSource().equals(frmP.getMnuPDF()))) {
            ArchPdf archivo = new ArchPdf();
            archivo.crear_PDF(con);
            archivo.abrirpdf();
        }
        
        //BD
        if(ae.getSource().equals(frmP.getMnuBD())){
            this.frmBD = new frmBaseD();
            this.frmP.getPnEscritorio().add(frmBD);
            frmBD.getBtnEstudiantes().addActionListener(this);
            frmBD.getBtnDocentes().addActionListener(this);
            frmBD.getBtnTrabajadores().addActionListener(this);
            frmBD.getBtnVisitantes().addActionListener(this);
            frmBD.getBtnAdministrativos().addActionListener(this);
            frmBD.getBtnConsultar().addActionListener(this);
            frmBD.setVisible(true);
        }
        
        //Consultar BD
        if(ae.getSource().equals(frmBD.getBtnConsultar())){
            IngresoDAO objIDAO = new IngresoDAO();
            try {
                frmBD.getTblBD().setModel(objIDAO.consultar());
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //Filtrar estudiantes
        
        if(ae.getSource().equals(frmBD.getBtnEstudiantes())){
            IngresoDAO objIDAO = new IngresoDAO();
            frmBD.getTblBD().setModel(objIDAO.FiltrarEstudiantes());
        }
        
        
        //Filtrar docentes
        
        if(ae.getSource().equals(frmBD.getBtnDocentes())){
            IngresoDAO objIDAO = new IngresoDAO();
            frmBD.getTblBD().setModel(objIDAO.FiltrarDocentes());
        }
        
        //Filtrar administrativos
        
        if(ae.getSource().equals(frmBD.getBtnAdministrativos())){
            IngresoDAO objIDAO = new IngresoDAO();
            frmBD.getTblBD().setModel(objIDAO.FiltrarAdministrativos());
        }
        
        //Filtrar trabajadores
        
        if(ae.getSource().equals(frmBD.getBtnTrabajadores())){
            IngresoDAO objIDAO = new IngresoDAO();
            frmBD.getTblBD().setModel(objIDAO.FiltrarTrabajadores());
        }
        
        //Filtrar visitantes
        
        if(ae.getSource().equals(frmBD.getBtnVisitantes())){
            IngresoDAO objIDAO = new IngresoDAO();
            frmBD.getTblBD().setModel(objIDAO.FiltrarVisitantes());
        }
        
        //Busqueda 
        
        if(ae.getSource().equals(frmP.getMnuBuscar())){
            this.frmB = new frmBusqueda();
            this.frmP.getPnEscritorio().add(frmB);
            frmB.getTxtPuerta().setEnabled(false);
            frmB.getTxtNombre().setEnabled(false);
            frmB.getTxtTipoDocumento().setEnabled(false);
            frmB.getTxtNDocumento().setEnabled(false);
            frmB.getTxtIngreso().setEnabled(false);
            frmB.getTxtMotivo().setEnabled(false);
            frmB.getTxtPlacas().setEnabled(false);
            frmB.getTxtEstado().setEnabled(false);
            frmB.getBtnBuscar().addActionListener(this);
            frmB.setVisible(true);
        }
        
        if(ae.getSource().equals(frmB.getBtnBuscar())){
            IngresoDAO objIDAO = new IngresoDAO();
            try {
                objIDAO.BuscarIngreso(frmB.getTxtDocumentoB().getText(), frmB.getTxtPuerta(), frmB.getTxtNombre(), frmB.getTxtTipoDocumento(), frmB.getTxtNDocumento(),
                        frmB.getTxtIngreso(), frmB.getTxtMotivo(), frmB.getTxtPlacas(), frmB.getTxtEstado());
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //Registro
        
        if(ae.getSource().equals(frmP.getMnuIngreso())){
            this.frmR = new frmRegistrar();
            this.frmP.getPnEscritorio().add(frmR);
            frmR.getBtnRegistrar().addActionListener(this);
            frmR.getCmbIngreso().addActionListener(this);
            frmR.getCmbPuerta().addActionListener(this);
            frmR.getCmbTipoDocumento().addActionListener(this);
            frmR.getCmbMotivo().addActionListener(this);
            frmR.setVisible(true);
                    
        }
        if(ae.getSource().equals(frmR.getBtnRegistrar())){
            try{
                Ingreso objI = new Ingreso(frmR.getCmbPuerta().getSelectedItem().toString(), 
                        frmR.getTxtNombre().getText(),
                        frmR.getCmbTipoDocumento().getSelectedItem().toString(),
                        frmR.getTxtNDocumento().getText(),
                        frmR.getCmbIngreso().getSelectedItem().toString(), 
                        frmR.getCmbMotivo().getSelectedItem().toString(),
                        frmR.getTxtPlacas().getText());
                ListIngreso.getListaI().add(objI);
                con.EscribeDatos(fecha.toString()+" "+hora.toString()+"\n"+"Nuevo ingreso\n\n"+objI.datos()+"\n");
                this.ingreso.setObjI(objI);
                JOptionPane.showMessageDialog(frmR, "Datos Registrados...\n"+objI.toString());
                JOptionPane.showMessageDialog(frmR, this.ingreso.insertar2());
                iniciarControles(frmR.getPnRegistrar().getComponents());
            }catch (IOException ex){
                JOptionPane.showMessageDialog(frmR, "Error al intentar acceder al archivo...");
            }
        }
        
        
        //Comprobar y autorizar Salida
        
        if(ae.getSource().equals(frmP.getMnuSalida())){
            this.frmS = new frmSalida();
            this.frmP.getPnEscritorio().add(frmS);
            frmS.getBtnConsultar().addActionListener(this);
            frmS.setVisible(true);
        }
        
        
        if(ae.getSource().equals(frmS.getBtnConsultar())){
            IngresoDAO objIDAO = new IngresoDAO();
            try {
                if("Salida denegada".equals(objIDAO.permisoSalida(frmS.getTxtDocumento().getText(),frmS.getTxtPlacas().getText()))){
                    boolean pinValido = false;
                    int intentos = 3;

                    while (!pinValido && intentos > 0) {
                        
                        String pinIngresado = JOptionPane.showInputDialog(null, "Salida denegada, ingrese el pin para volver a intentar:");
                        
                        if (pinIngresado != null && pinIngresado.equals("UD1234")) {
                            JOptionPane.showMessageDialog(null, "PIN válido. Vuelve a llenar los datos");
                            pinValido = true;
                            con.EscribeDatos(fecha.toString()+" "+hora.toString()+"\n"+"Pin valido, Nuevo intento de solicitud de salida\n");
                        } else {
                            
                            JOptionPane.showMessageDialog(null, "PIN incorrecto. Vuelva a intentarlo" );
                            con.EscribeDatos(fecha.toString()+" "+hora.toString()+"\n"+"Pin incorrecto, se velve a solicitar pin\n");
                            
                        }
                    }
                    
      
                }else{
                    JOptionPane.showMessageDialog(frmR, objIDAO.permisoSalida(frmS.getTxtDocumento().getText(),frmS.getTxtPlacas().getText()));
                    JOptionPane.showMessageDialog(frmR, objIDAO.ActualizarSalida(frmS.getTxtDocumento().getText()));
                }
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        

        
        
       
       //Salir
       if ((ae.getSource().equals(frmP.getMnuSalir()))) {
           IngresoDAO objIDAO = new IngresoDAO();
            try {
                if("Salida denegada".equals(objIDAO.TodosFuera())){
                    
                    JOptionPane.showMessageDialog(null, "Todavia hay personas dentro de la institucion");
                    objIDAO.Dentro();
                    
                    
                }else{
                    int resp = JOptionPane.showConfirmDialog(frmP, "Desea terminar la ejecucion?...", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (resp == JOptionPane.YES_OPTION) {
                        frmP.dispose();
                    }
                    
                }
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
     public void iniciarControles(Component[] controles) {
        for (Object control : controles) {
            if (control instanceof JTextField) {
                ((JTextField) control).setText("");
            }
        }
    }
     
     public void iniciarTabla(JTable tabla) {
        DefaultTableModel plantilla = (DefaultTableModel) tabla.getModel();
        int tam = plantilla.getRowCount();
        for (int i = tam - 1; i >= 0; i++) {
            plantilla.removeRow(i);
        }
    }
     
  
}
