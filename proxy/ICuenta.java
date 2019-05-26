package proxy;

/*
   interfaz con 3 funcionalidades
   */
public interface ICuenta{
    Cuenta retirarDinero(Cuenta cuenta, double monto);
    Cuenta depositarDinero(Cuenta cuenta, double monto);
    void mostrarSaldo(Cuenta cuenta);
}