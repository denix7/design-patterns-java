package factoryBaseDeDatos;


/**
 * Write a description of class ConexionMongo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConexionMongo implements IConexion
{
    private String name;
    private String user;
    private String password;
    private String port;
    
    public ConexionMongo(String name, String user, String password, String port){
        this.name = name;
        this.user = user;
        this.password = password;
        this.port = port;
    }
    
    public ConexionMongo(){
        name = "Mongo";
        port = "80";
        user = "admin";
        password = "123";
    }
    
    @Override
    public void conectar(){
        System.out.println("Conexion a mongoDB Exitosa");
    }
    
    @Override
    public void desconectar(){
        System.out.println("Desconexion de mongoDB");
    }
    
    @Override
    public String getDatos(){
        String res = "nombreBD: " + this.name + "\n version: " + this.port + "\n lisencia: " + this.user;
        return res;
    }
}
