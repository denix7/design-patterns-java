package proxy;


/**
 * Write a description of class CuentaBancoAlmpl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaBancoAlmpl implements ICuenta
{
    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto){
        double saldoActual = cuenta.getSaldoInicial() - monto;
        cuenta.setSaldoInicial(saldoActual);
        System.out.println("Saldo actual: "+cuenta.getSaldoInicial());
        return cuenta;
    }
    
    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto){
        double saldoActual = cuenta.getSaldoInicial() + monto;
        cuenta.setSaldoInicial(saldoActual);
        System.out.println("Saldo actual: "+cuenta.getSaldoInicial());
        return cuenta;
    }
    
    @Override
    public void mostrarSaldo(Cuenta cuenta){
        System.out.println("Saldo actual: "+cuenta.getSaldoInicial());
    }
}
