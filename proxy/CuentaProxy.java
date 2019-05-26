package proxy;
import java.util.logging.Logger;
import java.util.*;
/**
 * El cliente debe utilizar el intermediario (proxy) antes que el objeto real
 * 
 * Este patron se puede utilizar cuando por alguna razon no se quiere modificar la clase original "CuentaBancoAlmpl"
 * o tiene una estructura definida y por lo tanto el proxy se utilizaria para agregar lineas de codigo 
 * que se quieran agregar sin alterar el comportamiento ni la estructura base de la clase original
 * 
 * Ejmplo 
 * se quiere sacar los logs de las transacciones (informacion adicional) y por lo cual la clase original
 * Cuenta no debe alterarse ni agregar lineas de codigo que confundan su implementacion, por lo tanto
 * se crea una cuentaProxy para agregar la funcionalidad extra que saque LOGS de las cuentas
 */
public class CuentaProxy implements ICuenta
{
   private CuentaBancoAlmpl cuentaReal;
   private final static Logger LOGGER = Logger.getLogger(CuentaProxy.class.getName());
   
   @Override
   public Cuenta retirarDinero(Cuenta cuenta, double monto){
       LOGGER.info("-----Cuenta Proxy - Retirar Dinero -----");     //funcionalidad nueva agregada
       if(cuentaReal == null){
           cuentaReal = new CuentaBancoAlmpl();
           return cuentaReal.retirarDinero(cuenta, monto);
       }
       else{
           return cuentaReal.retirarDinero(cuenta, monto);
       }
    }
    
   @Override
   public Cuenta depositarDinero(Cuenta cuenta, double monto){
       LOGGER.info("-----Cuenta Proxy - Depositar Dinero -----");   //funcionalidad nueva agregada
       if(cuentaReal == null){
           cuentaReal = new CuentaBancoAlmpl();
           return cuentaReal.depositarDinero(cuenta, monto);
       }else{
           return cuentaReal.depositarDinero(cuenta, monto);
        }
   }
   
   public void mostrarSaldo(Cuenta cuenta){
       //
       if(cuentaReal == null){
           cuentaReal = new CuentaBancoAlmpl();
           cuentaReal.mostrarSaldo(cuenta);
       }else{
           cuentaReal.mostrarSaldo(cuenta);
        }
    }
}
