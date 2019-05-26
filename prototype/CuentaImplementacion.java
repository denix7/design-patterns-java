package prototype;


/**
 * Write a description of class CuentaImplementacion here.
 * 
 * @author (Dennis) 
 * @version (1.0)
 * 
 * 
 * El patron prototype realiza una cuenta con el mismo contenido y valores pero sus referencias en memoria no son las mismas
 * Es utilizado para realizar copias de objetos grandes y complejos 
 * 
 * Su objetivo es crear una nueva instancia con valores copiados y clonados de otra instancia
 * Para evitar pasar los valores de manera manual 
 */
public class CuentaImplementacion implements ICuenta
{
    private String tipo;
    private double monto;
    
    public CuentaImplementacion(){
        tipo = "Ahorro";
    }
    
    public void setMonto(int monto){
        this.monto = monto;
    }
    
    public double getMonto(){
        return monto;
    }
    
    /*Metodo que realiza la clonacion*/
    @Override
    public ICuenta clonar(){
        ICuenta cuenta=null;
        
        try{
            cuenta = (CuentaImplementacion)clone(); //clone es un metodo propio de java
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return cuenta;
    }
}
