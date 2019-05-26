package observer2;


/**
 * Write a description of class Falcon1 here.
 * 
 * Es tarea de Falcon1 definir el metodo actualizarMision() que se heredo de una clase abstracta
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Falcon1 extends Falcon
{
    public Falcon1(EstacionEspacial iee, String destino, int distancia){   //al momento de crear el falcon1 se debe mandar a que sujeto sigue, destino y su distancia
        this.destino = destino; //destino es un atributo que se hereda de Falcon
        this.distancia = distancia; //distancia es un atributo que se hereda de Falcon
        this.iee = iee;    //este atributo es heredado del modelo Falcon
        iee.agregarRocket(this);    //el falcon1 se agrega asi mismo a la lista de observers del sujeto (EstacionEspacial)
    }
    
    @Override
    public void actualizarMision(){
        System.out.println("===========================================");
        System.out.println("La mision del Falcon1 es: " + iee.getMision() + " de " + this.destino);
        System.out.println("El costo del combustible es: " + iee.getCostoCombustible());
        System.out.println("El costo total de la mision (costo x km) fue: " + iee.getCostoCombustible() * this.distancia);
    }
    
    /*Cada falcon esta pendiente de la nueva mision y el costo de combustible
     * y sacaran su propio costo de mision particular segun sus distancias recorridas por el costo establecido por el sujeto (EstacionEspacial) 
    */
}
