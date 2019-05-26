package observer2;


/**
 * Write a description of class Falcon9 here.
 * 
 * 
 * Es una instancia especifica que extiende del modelo Falcon
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Falcon9 extends Falcon
{
    public Falcon9(EstacionEspacial iee, String destino, int distancia){   //cuando se crea un falcon9 este pide a que sujeto (Estacion espacial) escuchara sus cambios
        this.distancia = distancia; //distancia es un atributo que se hereda de Falcon
        this.destino = destino;  //destino es un atributo que se hereda de Falcon
        this.iee = iee; //el atributo iee es heredado del modelo Falcon
        iee.agregarRocket(this);    //el falcon9 se agrega asi mismo a la lista de observers del sujeto (EstacionEspacial)
    }
    
    @Override
    public void actualizarMision(){
        System.out.println("===========================================");
        System.out.println("La mision del Falcon9 es: " + iee.getMision() + " de " + this.destino);
        System.out.println("El costo del combustible es: " + iee.getCostoCombustible());
        System.out.println("El costo total de la mision (costo x km) fue: " + iee.getCostoCombustible() * this.distancia);
    }
    
    /*Cada falcon esta pendiente de la nueva mision y el costo de combustible
     * y sacaran su propio costo de mision particular segun sus distancias recorridas por el costo establecido por el sujeto (EstacionEspacial) 
    */
}
