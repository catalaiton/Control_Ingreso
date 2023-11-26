/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
//archivos
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
//librerias ajenas a itext
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

//import sun.tools.jar.Main;
/**
 * Esta clase nos permite generar guardar y abrir un archivo pdf
 * con itextpdf-5.4.0
 * @web http://jc-mouse.blogspot.com/
 * @author Mouse
 */
public class ArchPdf {

    private File ruta_destino;

    /**
     * Constructor basico que crea una instancia
     * del Archivo en valor nulo
     */
    public ArchPdf(){
        ruta_destino=null;
    }


    /**
     * metodo que hace uso de la clase itext para manipular archivos PDF
     * @param ListaF
     */

    public void crear_PDF(Conexion conLeer){
        //abre ventana de dialogo "guardar"
        //Colocar_Destino();
        //si destino es diferente de null
        //if(this.ruta_destino!=null){
            try {
                // se crea instancia del documento
                Document mipdf = new Document();
                // se establece una instancia a un documento pdf
                PdfWriter.getInstance(mipdf, new FileOutputStream("Ingresos.pdf"));
                mipdf.open();// se abre el documento
                mipdf.addTitle("Info pdf"); // se añade el titulo
                /*mipdf.addAuthor(a); // se añade el autor del documento
                mipdf.addSubject(s); //se añade el asunto del documento
                mipdf.addKeywords(k); //Se agregan palabras claves*/
                
                mipdf.add(new Paragraph("Informacion de Ingresos \n"+conLeer.leerDatos()+"\n"));
                //mipdf.add(new Paragraph("subtotal "+objEm.valorPago()+"\n"));
                //mipdf.add(new Paragraph("IVA  "+objEm.IVA()+"\n"));
                // se añade el contendio del PDF
                mipdf.close(); //se cierra el PDF&
                JOptionPane.showMessageDialog(null,"Documento PDF creado");
            } catch (DocumentException | FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Error : "+ex.getMessage());
            } catch (IOException ex) {
            Logger.getLogger(ArchPdf.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
    /**
     *Metodo abrirpdf(), permite abrir automaticamente el pdf
     *luego de ser generado por medio del evento
     */
    public void abrirpdf(){
        try {
     File path = new File ("Ingresos.pdf");
     Desktop.getDesktop().open(path);
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Metodo que retorna el contenido del atributo
     * ruta_destino a partir de un parametro de tipo File
     * @return File
     */
    public File getRuta_destino() {
        return ruta_destino;
    }

    /**
     * Metodo que modifica el contenido del atributo
     * ruta_destino a partir de un parametro tipo File
     * @param ruta_destino 
     */
    public void setRuta_destino(File ruta_destino) {
        this.ruta_destino = ruta_destino;
    }
    
}