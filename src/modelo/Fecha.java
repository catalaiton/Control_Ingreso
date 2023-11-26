
package modelo;

import java.util.Calendar;

/**
 *La clase Fecha permite crear una instancia a partir de los
 *datos dias dd, mes mm, año aaaa.
 * @author Juan Pablo camelo
 * @author Catalina Laiton
 * @version 1.1
 */
public class Fecha {
    /**
     *dd corresponde al dia del de la fecha
     * que se almacena en formato entero (int)
     */
    private int dd, 
            
      /**
     *mm corresponde al mes del de la fecha
     * que se almacena en formato entero (int)
     */
            
            mm, 
            
     /**
     *aaaa corresponde al año del de la fecha
     * que se almacena en formato entero (int)
     */
            aaaa;

    /**
     *Contrsuctor parametrico permite crear una instancia (objeto)
     * de tipo fecha aprtir de valores recibidos a travez de los 
     * siguientes parametros 
     * @param dd dia(int)
     * @param mm mes(int)
     * @param aaaa año(int)
     */
    public Fecha(int dd, int mm, int aaaa) {
        this.dd = dd;
        this.mm = mm;
        this.aaaa = aaaa;
    }
    
    /**
     *Contrsuctor basico permite crear una instancia (objeto)
     * de tipo fecha aprtir de los valores tipo calendar
     * que nos trae la fecha con el tipo de calendario estandar
     */
    public Fecha() {
          
        Calendar fecha =Calendar.getInstance();
        
        this.dd = fecha.get(Calendar.DAY_OF_MONTH);
        this.mm = fecha.get(Calendar.MONTH+1);
        this.aaaa = fecha.get(Calendar.YEAR);
    }
      
   
      
    /**
     *Metodo que retorna el contenido del atributo dd (dia)
     * en formato entero(int)
     * @return int
     */
    public int getDd() {
        return dd;
    }

    /**
     *Metodo que modifica el contenido  del atributo dd (dia)
     * apartir de un parametro tipo entero(int)
     * @param dd dia
     */
    public void setDd(int dd) {
        this.dd = dd;
    }

    /**
     *Metodo que retorna el contenido del atributo mm (mes)
     * en formato entero(int)
     * @return int
     */
    public int getMm() {
        return mm;
    }

    /**
     *Metodo que modifica el contenido  del atributo mm (mes)
     * apartir de un parametro tipo entero(int)
     * @param mm mes
     */
    public void setMm(int mm) {
        this.mm = mm;
    }

    /**
     *Metodo que retorna el contenido del atributo aaaa (año)
     * en formato entero(int)
     * @return int
     */
    public int getAa() {
        return aaaa;
    }

    /**
     *Metodo que modifica el contenido  del atributo aaaa (año)
     * apartir de un parametro tipo entero(int)
     * @param aa año
     */
    public void setAa(int aa) {
        this.aaaa = aaaa;
    }

    /**
     *Metodo que retorna el contenido del objeto Fecha
     * (dd,mm,aaaa) en formato String
     * @return String
     */
    @Override
    public String toString() {
        return  dd + "/" + mm + "/" + aaaa;
    }   
}
