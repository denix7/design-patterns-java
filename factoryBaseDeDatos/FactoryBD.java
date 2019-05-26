package factoryBaseDeDatos;


/**
 * Fabrica de DB
 * Devuelve instancias de una clase en particular por medio de un identificador
 * No se instancia el objeto directamente sino que la fabrica tiene esa tarea
 * Esta fabrica de BD tiene como identificadores Mongo o Postgres y devolvera una instancia dependiendo el caso
 */
public class FactoryBD
{
    public IConexion getConexion(String tipoConexion){
        IConexion con = null;   //IConexion es promesa de respuesta es una conexion polimorfica que podria ser Mongo o Postgres
        if(tipoConexion.equals("Mongo")){  
            con = new ConexionMongo();  //devuelve una instancia de lo que pide el usuario
        }
        if(tipoConexion.equals("Postgres")){
            con = new ConexionPostgres();   //devuelve una instancia de lo que pide el usuario
        }
        return con;
    }
}
