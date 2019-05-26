package singleton;


/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String args[]){
        Conexion c1 = Conexion.getConexion();
        c1.conectarBD();
        
        Conexion c2 = Conexion.getConexion();
        c2.conectarBD();
        
        System.out.println(c1);
        System.out.println(c2);
        
        //Ambos tienen la misma referencia en el espacio de memoria, porque son la misma instancia
        
        
        
        /*
        Conexion c = null; 
        c.getConexion();
        System.out.println(c.getConexion());
        
        Conexion c2 = null;
        c2.getConexion();
        System.out.println(c2.getConexion());   
        */
        
        
    }
}
