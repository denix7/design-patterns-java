package observer;


/**
 * Write a description of class Subject here.
 * 
 * El sujeto es el objeto el cual tiene una lista de observadores 
 * y cada vez que se haga un cambio este debe notificarlos
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class Subject
{
    private ArrayList<Observador> observadores = new ArrayList<Observador>();
    private int estado;
    
    public int getEstado(){
        return estado;
    }
    public void setEstado(int estado){
        this.estado = estado;           //Cuando cambia el estado este debe notificar el cambio a sus observers
        notificarTodosLosObservadores();
    }
    
    public void agregar(Observador observador){
        observadores.add(observador);
    }
    
    public void notificarTodosLosObservadores(){
        for (Observador observador: observadores){
            observador.actualizar();
        }
        //observadores.forEach(x -> x.actualizar);
    }
}
