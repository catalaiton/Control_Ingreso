/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

/**
 * La clase ImagenEscritorio implementa la interface Border
 * y esto permitira poder agregarle ina imagen de fondo al
 * JDesktopPane
 *@author Juan Pablo camelo
 *@author Catalina Laiton
 *@version 1.1
 */
public class ImagenEscritorio implements Border{
     /**
     *imagen corresponde a la imagen que sera agregada 
     * como fondo y  se almacena en formato Image
     */
    private Image imagen;

    /**
     *Contrsuctor parametrico permite crear una instancia (objeto)
     * de tipo ImagenEscritorio aprtir de valores recibidos a travez de los 
     * siguientes parametros 
     * @param imagen imagen
     */
    public ImagenEscritorio(Image imagen) {
        this.imagen = imagen;
    }

    /**
     *Contrsuctor basico permite crear una instancia (objeto)
     * de tipo ImagenEscritorio donde se le inicializa el
     * objeto imagen y se le asigna el archivo
     * fondo_registro.png.png el cual previamente debe estar
     * almacenado en la carpeta img del src
     */
    public ImagenEscritorio() {
        this.imagen = new ImageIcon(getClass().getResource("/img/Fondo_Principal.jpg")).getImage();
    }
     
    /**
     *El metodo paintBorder(Component C,Graphics g,int x, int y,int ancho ,int alto)
     * se están obteniendo los datos del componente, el objeto
     * Graphics, las coordenadas x y y, el ancho y el alto del .contenedor. En este método se
     *grafica la imagen dentro del contenedor mediante el método .drawImage() del objeto
     *Graphics que se recibe.
     * @param C componente
     * @param g Graphics
     * @param x cordenada x
     * @param y  cordenada y
     * @param ancho ancho
     * @param alto  alto
     */
    @Override
     public void paintBorder(Component C,Graphics g,int x, int y,int ancho ,int alto){
         if(imagen.getWidth(null)<ancho || imagen.getHeight(null)<alto){
             g.drawImage(imagen, 0, 0, ancho,alto,null);
         }else{
             g.drawImage(imagen, 0, 0, imagen.getWidth(null)-(imagen.getWidth(null)-ancho)
                     ,imagen.getHeight(null)-(imagen.getHeight(null)-alto),null);
         }
     }

    /**
     *
     * @param cmpnt
     * @return
     */
    @Override
      public Insets getBorderInsets(Component cmpnt){
        return new Insets(0, 0, 0, 0);
    } 
      
    /**
     *El método isBorderOpaque() establece la propiedad opaque
     * para que la imagen sea visible dentro del contenedor.
     * @return boolean
     */
    @Override
      public boolean isBorderOpaque(){
          return true;
      }
      
    /**
     * Metodo que retorna el contenido del atributo imagen
     * en formato Image
     * @return Image
     */
    public Image getImagen() {
        return imagen;
    }

    /**
     * Metodo que modifica el contenido del atributo imagen
     * a partir de un parametro de tipo Image
     * @param imagen imagen
     */
    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
    
     

}
