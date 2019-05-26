package factory;


/**
 * Write a description of class dsfa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoConexion implements iConexion
{
    
    @Override
    public void conectar(){
        System.out.println("Conexion Fail");
    }
    
    @Override
    public void desconectar(){
        System.out.println("Conexion Fail");
    }
}
