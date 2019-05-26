package factory;


/**
 * Write a description of class principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class principal
{
    public static void main (String args[]){
        Fabrica f = new Fabrica();
        
        //Quiero una nueva conexion Mongo y le mando por parametro el identificador Mongo
        iConexion mongo = f.getConexion("Mongo");
        mongo.conectar();
        mongo.desconectar();
        
        //Quiero una nueva conexion postgress y le mando por parametro el identificador Postgress
        iConexion postgress = f.getConexion("Postgress");
        postgress.conectar();
        postgress.desconectar();
    }
    
}
