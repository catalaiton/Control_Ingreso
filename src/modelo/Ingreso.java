/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Arjuna
 */
public class Ingreso {
    private String puerta,nombre,tipoDocumento,nDocumento,ingreso,motivo,placas;

    public Ingreso(String puerta, String nombre, String tipoDocumento, String nDocumento, String ingreso, String motivo, String placas) {
        this.puerta = puerta;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.nDocumento = nDocumento;
        this.ingreso = ingreso;
        this.motivo = motivo;
        this.placas = placas;
    }

    public Ingreso() {
        this.puerta="";
        this.nombre="";
        this.tipoDocumento="";
        this.nDocumento="";
        this.nDocumento="";
        this.ingreso="";
        this.motivo="";
        this.placas="";
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getnDocumento() {
        return nDocumento;
    }

    public void setnDocumento(String nDocumento) {
        this.nDocumento = nDocumento;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    @Override
    public String toString() {
        return "\nPuerta: " + puerta + "\nNombre: " + nombre + 
                "\nTipo Documento: " + tipoDocumento + "\n#Documento: " + nDocumento +
                "\nIngreso: " + ingreso + "\nMotivo=" + motivo +
                "\nPlacas: " + placas;
    }
    
    public String datos(){
        return puerta+";"+nombre+";"+tipoDocumento+";"+ingreso+";"+motivo+";"+placas;
    }
}
