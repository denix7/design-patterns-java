package prototype;


/**
 * Write a description of class ICuenta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ICuenta extends Cloneable
{
    //la extencion Cloneable es propia de java
    ICuenta clonar();   //Otra clase debe implementar este metodo 
}
