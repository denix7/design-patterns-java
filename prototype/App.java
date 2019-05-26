package prototype;


/**
 * Write a description of class App here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class App
{
    public static void main(String args[]){
        CuentaImplementacion cuenta1 = new CuentaImplementacion();  //cuenta original de un usuario, se utiliza su constructor
        cuenta1.setMonto(200);  //ingreso 200 en la cuenta1
        System.out.println(cuenta1.getMonto());
        
        //ya que el metodo clonar devuelve una interfaz se necesita castear a cuentaImplementacion para que sean compatibles
        CuentaImplementacion cuentaClonada = (CuentaImplementacion)cuenta1.clonar();    //Cuenta clon de la cuenta1 no se usa constructor, sino su metodo clonar el cual devuelve una Interface ICUenta y es necesario realizar un casteo a CuentaImplementacion
        System.out.println(cuentaClonada.getMonto());   //esta cuenta se clona con los atributos de la original, tiene el mismo monto de 200
        
    }
}
