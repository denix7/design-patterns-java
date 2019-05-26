package decorador;


/**
 * Write a description of class CuentaAhorro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaAhorro implements ICuentaBancaria
{
    @Override
    public void abrirCuenta(Cuenta c){
        System.out.println("-------------------------");
        System.out.println("Se abrio una cuenta de ahorros");
        System.out.println("Cliente: " + c.getCliente());
    }
}
