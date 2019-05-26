package decorador;


/**
 * Write a description of class CuentaDecorador here.
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class CuentaDecorador implements ICuentaBancaria
{
    protected ICuentaBancaria cuentaDecorada;
    
    public CuentaDecorador(ICuentaBancaria cuentaDecorada){
        this.cuentaDecorada = cuentaDecorada;
    }
    
    @Override
    public void abrirCuenta(Cuenta c){
        this.cuentaDecorada.abrirCuenta(c);
    }
}
