package decorador;


/**
 * Write a description of class app here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class app
{
    public static void main(String args[]){
        Cuenta c = new Cuenta(1, "Dennis");
        
        ICuentaBancaria cuenta = new CuentaAhorro();
        ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);
        
        //cuenta.abrirCuenta(c);
        cuentaBlindada.abrirCuenta(c);
    }
}
