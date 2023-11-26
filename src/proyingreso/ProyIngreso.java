/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyingreso;

import control.Controlador;
import java.io.IOException;
import modelo.Fecha;
import modelo.Hora;
import modelo.Conexion;
public class ProyIngreso {


    public static void main(String[] args) throws IOException {
        Controlador objC = new Controlador();
        Fecha fecha = new Fecha();
        Conexion conArch = new Conexion();
        Hora hora = new Hora();
        objC.iniciar();
        conArch.EscribeDatos(fecha.toString()+" "+hora.toString()+" Arranque de programa \nSISTEMA DE GESTION DE INGRESO Y SALIDA UD SEDE TECNOLOGICA");
    }
    
}
