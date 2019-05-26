package factoryBaseDeDatos;


/**
 * Fabrica de SO
 * Devuelve instancias de una clase en particular por medio de un identificador
 * No se instancia el objeto directamente sino que la fabrica tiene esa tarea
 * Esta fabrica de SO tiene como identificadores Ubuntu o Fedora y devolvera una instancia dependiendo el caso
 */
public class FactoryOS
{
    public IOperativeSystem getOperativeSystem(String tipoSO){
        IOperativeSystem res = null; 
        
        
        if(tipoSO.equals("Ubuntu")){
            res = new Ubuntu();
        }
        else if(tipoSO.equals("Fedora")){
            res = new Fedora();
        }
                 
        return res;
    }
}
