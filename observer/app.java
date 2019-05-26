package observer;


/**
 * Write a description of class app here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class app
{
    public static void main(String []args){
        Subject s = new Subject();
    
        Observador mexico = new MexicoObservador(s);
        Observador bolivia = new BoliviaObservador(s);
        
        System.out.println("Si desea cambiar 10$ obtendra: ");
        s.setEstado(10);
        System.out.println("=================================");
        System.out.println("Si desea cambiar 100$ obtendra: ");
        s.setEstado(100);
    }
}
