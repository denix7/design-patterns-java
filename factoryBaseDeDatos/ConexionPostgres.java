package factoryBaseDeDatos;


/**
 * Write a description of class ConexionPostgress here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConexionPostgres implements IConexion
{
    private String name;
    private String user;
    private String password;
    private String port;
    
    
    public ConexionPostgres(String name, String user, String password, String port){
        this.name = name;
        this.user = user;
        this.password = password;
        this.port = port;
    }
    
    public ConexionPostgres(){
        name = "Postgres";
        port = "80";
        user = "admin";
        password = "123";
    }
    
    @Override
    public void conectar(){
        System.out.println("Conexion a Postgre exitosa \n Escuchando el puerto 3200");
    }
    
    @Override
    public void desconectar(){
        System.out.println("Desconexion de Postgre exitosa");
    }
    
    @Override
    public String getDatos(){
        String res = "nombreBD: " + this.name + "\n version: " + this.port + "\n lisencia: " + this.user;
        return res;
    }
}
