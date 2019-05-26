package observer2;


/**
 * Write a description of class SubjectEstacionEspacial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class EstacionEspacial{
    ArrayList<Falcon> rockets = new ArrayList<Falcon>();    //es una lista de observadores del nuevo estado de este objeto 
    String mision;
    int costoCombustible;
    
    public EstacionEspacial(){
        mision = "";
    }
    
    public String getMision(){
        return mision;
    }
    public void setMision(String mision, int costoCombustible){
        this.mision = mision;
        this.costoCombustible = costoCombustible;
        notificarMision();
    }
    
    public int getCostoCombustible(){
        return this.costoCombustible;
    }
    
    public void notificarMision(){  //este metodo se encarga de notificar la nueva mision a los observadores
        for(Falcon falcon:rockets){
            falcon.actualizarMision();
        }
    }
    
    public void agregarRocket(Falcon f){
        rockets.add(f);
    }
}
