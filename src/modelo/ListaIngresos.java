/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Arjuna
 */
public class ListaIngresos {
    private ArrayList<Ingreso> ListaI;

    public ListaIngresos(ArrayList<Ingreso> ListaI) {
        this.ListaI = ListaI;
    }

    public ListaIngresos() {
        this.ListaI = new ArrayList<>();
    }

    public ArrayList<Ingreso> getListaI() {
        return ListaI;
    }

    public void setListaI(ArrayList<Ingreso> ListaI) {
        this.ListaI = ListaI;
    }

    @Override
    public String toString() {
        String datos="";
        for(int i=0;i<ListaI.size();i++){
            datos+=ListaI.get(i).toString()+"\n";
        }
        return "Lista ingresos: "+datos;
    }
    
    
}
