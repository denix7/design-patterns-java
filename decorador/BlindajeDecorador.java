package decorador;


/**
 * Write a description of class BlindajeDecorador here.
 * 
 * 
 * Patron Decorador
 * Agrega funcionalidades extras a una objeto existente sin alterar la estructura base de las clases
 * Cuando tienes un objeto ya definido y quieres agregar propiedades o funciones sin alterar su estructura 
 * entonces se utiliza un decorador para cada objetivo
 * 
 * Ejemplo
 * Un cliente desea abrir una cuenta bancaria y el encargado le pregunta si quiere agregar extra seguridad 
 * opcional, entonces el cliente si quiere agregar funcionalidades extras a su cuenta
 * 
 * @author (Dennis) 
 * @version (a version number or a date)
 */
public class BlindajeDecorador extends CuentaDecorador
{
    public BlindajeDecorador(ICuentaBancaria cuentaDecorada){
        super(cuentaDecorada);
    }
    
    @Override
    public void abrirCuenta(Cuenta c){
        cuentaDecorada.abrirCuenta(c);
        agregarBlindaje(c);
    }
    
    public void agregarBlindaje(Cuenta c){
        System.out.println("Se agrego blindaje a la cuenta del cliente: " + c.getCliente());
    }
}
