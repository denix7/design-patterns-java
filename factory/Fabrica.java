package factory;


/**
 * La fabrica se encarga de proveer la implementacion que se necesita (IConexion)
 * nos provee una conexion segun la necesidad, lo cual hace el codigo mas flexible 
 */
public class Fabrica
{
    public Fabrica(){
        
    }
    
    public iConexion getConexion(String tipoConexion){
        iConexion res = null;
        if(tipoConexion.equals("Mongo"))
            res = new ConexionMongo();
        
        if(tipoConexion == "Postgress")
            res = new ConexionPostgress();
     
        if(tipoConexion == "MySQL")    
            res = new ConexionMySQL();  
            
        if(tipoConexion == "")
            res = new NoConexion();
      
        return res;    
    }
}
