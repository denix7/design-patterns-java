package singleton;


/**
 * Write a description of class Conexion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Conexion
{
    private static Conexion instancia;//es estatic para acceder a la variable de forma directa, sin instanciar un objeto de la clase
    
    private Conexion(){//el constructor es privado para que no se pueda instanciar varias veces
        
    }
    
    //Es estatic para que pueda acceder al medodo de forma directa
    public static Conexion getConexion(){//cumple la funcion de constructor que controla que exista una unica instancia
        if(instancia == null)
            instancia = new Conexion();
        
        return instancia;
    }
    
    public void conectarBD(){
        System.out.println("Conexion Establecida");
    }
}
