package decorador;


/**
 * Write a description of class adgasdg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class CuentaCorriente implements ICuentaBancaria
{
    @Override
    public void abrirCuenta(Cuenta c){
        System.out.println("-------------------------");
        System.out.println("Se abrio una cuenta corriente");
        System.out.println("Cliente: " + c.getCliente());
    }
}
