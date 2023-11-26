package modelo;

import java.util.Calendar;

/**
 * La clase Hora permite crear una instancia a partir de los
 * datos hora hh, minutos mm, segundos ss.
 * @author Juan Pablo Camelo
 * @author Catalina Laiton
 * @version 1.1
 */
public class Hora {
    private int hh,
            mm,
            ss;

    /**
     * Constructor paramétrico permite crear una instancia (objeto)
     * de tipo hora a partir de valores recibidos a través de los 
     * siguientes parámetros
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
     * Constructor básico permite crear una instancia (objeto)
     * de tipo hora a partir de los valores tipo calendar
     * que nos trae el la hora actual en formato estándar
     */
    public Hora() {
        Calendar actual = Calendar.getInstance();
        this.hh = actual.get(Calendar.HOUR);
        
        // Verificar si es AM o PM y ajustar la hora si es PM
        int amPm = actual.get(Calendar.AM_PM);
        if (amPm == Calendar.PM && this.hh != 12) {
            this.hh += 12;
        }
        
        this.mm = actual.get(Calendar.MINUTE);
        this.ss = actual.get(Calendar.SECOND);
    }

    public void incSS() {
        if (ss < 59) {
            ss++;
        } else {
            ss = 0;
            mm++;
        }
    }

    public void incMM() {
        if (mm < 59) {
            mm++;
        } else {
            mm = 0;
            hh++;
        }
    }

    public void incHH() {
        if (hh < 24) {
            hh++;
        } else {
            hh = 0;
        }
    }

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getSs() {
        return ss;
    }

    public void setSs(int ss) {
        this.ss = ss;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hh, mm, ss);
    }
}
