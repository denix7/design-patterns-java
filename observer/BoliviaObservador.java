package observer;


/**
 * Write a description of class SolObservador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoliviaObservador extends Observador
{
    private double valorCambio = 3.25;
    
    public BoliviaObservador(Subject sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }
    
    @Override
    public void actualizar(){
        System.out.println("BOL: " + (sujeto.getEstado()*valorCambio));
    }
}
