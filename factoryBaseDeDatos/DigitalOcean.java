package factoryBaseDeDatos;


/**
 * Write a description of class AWS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DigitalOcean
{
    public static void main(String []args){
        Droplet d1 = new Droplet("Conetenedor1");
        d1.instalarSO();
        d1.instalarBD();
        
        /*
        Droplet d2 = new Droplet("Conetenedor2");
        d2.instalarSO();
        d2.instalarBD();
        */
    }
}
