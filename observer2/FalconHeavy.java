package observer2;


/**
 * Write a description of class FalconHeavy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FalconHeavy extends Falcon
{
    public FalconHeavy(EstacionEspacial iee, String destino, int distancia){   //al momento de construir un falconHeavy se debe mandar por parametro el sujeto a cual observar
        this.distancia = distancia;
        this.destino = destino;
        this.iee = iee; 
        iee.agregarRocket(this);    //el falcon9 se agrega asi mismo a la lista de observers del sujeto (EstacionEspacial)
    }
    
    @Override
    public void actualizarMision(){
        System.out.println("===========================================");
        System.out.println("La mision del Falcon Heavy es: " + iee.getMision() + " de " + this.destino);
        System.out.println("El costo del combustible es: " + iee.getCostoCombustible());
        System.out.println("El costo total de la mision (costo x km) fue: " + iee.getCostoCombustible() * this.distancia);
    }
    
    /*Cada falcon esta pendiente de la nueva mision y el costo de combustible
     * y sacaran su propio costo de mision particular segun sus distancias recorridas por el costo establecido por el sujeto (EstacionEspacial) 
    */
}
