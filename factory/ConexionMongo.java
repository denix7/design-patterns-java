package factory;


/**
 * Write a description of class conexionMongo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ConexionMongo implements iConexion
{
    private String host;
    private String puerto;
    private String usuario;
    private String contrasenia;
    
    public ConexionMongo(){
        host = "127.0.0.1";
        puerto = "80";
        usuario = "admin";
        contrasenia = "123";
    }
    
    @Override
    public void conectar(){
        System.out.println("Conexion mongo OK");
    }
    
    @Override
    public void desconectar(){
        System.out.println("Desconectado de Mongo");
    }
}
