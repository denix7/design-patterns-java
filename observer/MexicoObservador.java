package observer;


/**
 * Write a description of class MexicoObservador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MexicoObservador extends Observador
{
    private double valorCambio = 19.07;
    
    public MexicoObservador(Subject sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);  //el sujeto agrega este observador
    }
    
    public void actualizar(){
        System.out.println("MX: " + (sujeto.getEstado()*valorCambio));
    }
}
