package factoryBaseDeDatos;


/**
 * Write a description of class IConexion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IConexion
{
    public void conectar();
    public void desconectar();
    public String getDatos(); 
}
