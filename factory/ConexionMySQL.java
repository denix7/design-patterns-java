package factory;

public class ConexionMySQL implements iConexion
{
    private String host;
    private String puerto;
    private String usuario;
    private String contrasenia;
    
    public ConexionMySQL(){
        this.host = "localhost";
        this.puerto = "80";
        this.usuario = "admin";
        this.contrasenia = "1234";
    }
    
    @Override
    public void conectar(){
        System.out.println("Conexion exitorsa a mySQL");
    }
    
    @Override
    public void desconectar(){
        System.out.println("Desconectado de Mysql");
    }
}
