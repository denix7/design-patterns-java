package decorador;


/**
 * Write a description of class Cuenta here.
 * 
 * EJM
 * Cliente quiere abrir una cuenta con extra de seguridad
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuenta
{
    private int id;
    private String cliente;
    
    public Cuenta(int id, String cliente){
        this.id = id;
        this.cliente = cliente;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getCliente(){
        return cliente;
    }
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    
}
