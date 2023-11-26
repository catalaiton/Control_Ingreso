/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Calendar;

/**
 *La clase Hora permite crear una instancia a partir de los
 *datos hora hh, minutos mm, segundos ss.
 *@author Juan Pablo camelo
 *@author Catalina Laiton
 *@version 1.1
 */
public class Hora {
    /**
     *hh corresponde a la hora de la hora
     * que se almacena en formato entero (int)
     */

    private int hh,
      /**
     *mm corresponde a los minutos de la hora
     * que se almacena en formato entero (int)
     */
            
            mm,
            
     /**
     *ss corresponde a los segundos de la hora
     * que se almacena en formato entero (int)
     */
            
            ss;

    /**
     *Contrsuctor parametrico permite crear una instancia (objeto)
     * de tipo hora aprtir de valores recibidos a travez de los 
     * siguientes parametros
     * @param hh hora
     * @param mm minutos
     * @param ss segundos
     */
    public Hora(int hh, int mm, int ss) {
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }

    /**
     *Contrsuctor basico permite crear una instancia (objeto)
     * de tipo hora aprtir de los valores tipo calendar
     * que nos trae el la hora actual en formato estandar
     */
    public Hora() {
        Calendar actual = Calendar.getInstance();
        this.hh = actual.get(Calendar.HOUR);
        this.mm = actual.get(Calendar.MINUTE);
        this.ss = actual.get(Calendar.SECOND);
    }

    /**
     *incSS() método que valida los segundos en 
     * rango 0-59 y si llega a 60 incremeta los minutos
     */
    public void incSS() { 
        if (ss < 59) {
            ss++;
        } else {
            ss = 0;
            mm ++;
        }
    }

    /**
     *incMM() método que valida los minutos en 
     * rango 0-59 y si llega a 60 incremeta la hora
     */
    public void incMM() { //método que valida los segundos en rango 0-59
        if (mm < 59) {
            mm++;
        } else {
            mm = 0;
            hh ++;
        }
    }
    
    /**
     *incHH() método que valida las horas en 
     * rango 0-24 y si llega lo pasa se 
     * inicializa en 0 nuevamente 
     */
    public void incHH() { //método que valida los segundos en rango 0-59
        if (hh < 24) {
            hh++;
        } else {
            hh = 0;
        }
    }
    
    /**
     *Metodo que retorna el contenido del atributo hh (hora)
     * en formato entero(int)
     * @return int
     */
    public int getHh() {
        return hh;
    }

    /**
     *Metodo que modifica el contenido  del atributo hh (hora)
     * apartir de un parametro tipo entero(int)
     * @param hh hora
     */
    public void setHh(int hh) {
        this.hh = hh;
    }

    /**
     *Metodo que retorna el contenido del atributo mm (minutos)
     * en formato entero(int)
     * @return int
     */
    public int getMm() {
        return mm;
    }

    /**
     *Metodo que modifica el contenido  del atributo mm (minutos)
     * apartir de un parametro tipo entero(int)
     * @param mm minutos
     */
    public void setMm(int mm) {
        this.mm = mm;
    }

   /**
     *Metodo que retorna el contenido del atributo ss (segundos)
     * en formato entero(int)
     * @return int
     */
    public int getSs() {
        return ss;
    }

    /**
     *Metodo que modifica el contenido  del atributo ss (segundos)
     * apartir de un parametro tipo entero(int)
     * @param ss segundos
     */
    public void setSs(int ss) {
        this.ss = ss;
    }

    /**
     *Metodo que retorna el contenido del objeto Hora
     * (hh,mm,ss) en formato String
     * @return String
     */
    @Override
    public String toString() {
        return hh + ":" + mm + ":" + ss;
    }

}
