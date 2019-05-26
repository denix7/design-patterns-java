package proxy;
/*
   Representa la estructura de la cuenta
   */

public class Cuenta
{
    private int idCuenta;
    private String usuario;
    private double saldoInicial;
    
    public Cuenta(int idCuenta, String usuario, double saldoInicial){
        this.idCuenta = idCuenta;
        this.usuario = usuario;
        this.saldoInicial = saldoInicial;
        
    }
    
    public int getIdCuenta(){
        return this.idCuenta;
    }
    public void setIdCuenta(int idCuenta){
        this.idCuenta = idCuenta;
    }
    
    public void setUsuario(){
        this.usuario = usuario;
    }
    public String getUsuario(){
        return this.usuario;
    }
    
    public void setSaldoInicial(double saldoInicial){
        this.saldoInicial = saldoInicial;
    }
    public double getSaldoInicial(){
        return this.saldoInicial;
    }
}
