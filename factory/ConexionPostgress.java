package factory;


/**
 * Write a description of class conexionPostgress here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConexionPostgress implements iConexion
{
    private String host;
    private String puerto;
    private String usuario;
    private String contrasenia;
    
    public ConexionPostgress(){
        host = "127.0.0.2";
        puerto = "80";
        usuario = "admin";
        contrasenia = "123";
    }
    
    @Override
    public void conectar(){
        System.out.println("Conexion Postgress OK");
    }
    
    @Override
    public void desconectar(){
        System.out.println("Desconectado de Postgress");
    }
}
