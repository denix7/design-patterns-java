package observer2;


/**
 * Write a description of class Falcon here.
 * 
 * FALCON (Es una clase abstracta para modelamiento)
 * Es la clase OBSERVADOR que esta pendiente de los cambios del sujeto (Estacion Espacial)
 * y tiene como tarea actualizar los datos recibidos
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Falcon
{
    protected String destino = "";
    protected int distancia;
    //private int costoCombustible; //el costo lo establece la estacion espacial (sujeto), y los falcon estaran al pendiente de ese atributo para sacar su propio costo de mision
    
    
    EstacionEspacial iee = new EstacionEspacial(); //es el sujeto al cual se escucha los cambios nuevos que este realice
    abstract void actualizarMision(); //el metodo actualizar se debe definir en todos los falcon
}
