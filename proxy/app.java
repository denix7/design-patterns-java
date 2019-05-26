package proxy;


/**
 * Write a description of class app here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class app
{
    public static void main(String []args){
        //Se crea una cuenta original
        Cuenta c = new Cuenta(1, "Dennis", 300);
        
        //se crea una cuenta proxy(intermediario)
        ICuenta cuentaProxy = new CuentaProxy();
        cuentaProxy.mostrarSaldo(c);
        c = cuentaProxy.depositarDinero(c, 50); //se esta modificando la Cuenta original mediante la cuentaProxy
        c = cuentaProxy.retirarDinero(c, 20);   //se esta modificando la Cuenta original mediante la cuentaProxy
        cuentaProxy.mostrarSaldo(c);
    }
}
