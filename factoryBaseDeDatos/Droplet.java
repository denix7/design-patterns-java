package factoryBaseDeDatos;


/**
 * En digital ocean los contenedores tienen como nombre Droplets en los cuales se pueden instalar SO, BD y Lenguajes
 */
import java.util.Scanner;
public class Droplet
{
    String name;
    String os;
    String bd;
    public Droplet(String name){
        this.name = name;
    }
    public void instalarSO(){
        FactoryOS f = new FactoryOS();
        System.out.println("Ingrese el tipo de SO que desea: \n Sistemas operativos disponibles \n *Ubuntu \n *Fedora");
        
        boolean conexionExitosa = false;
        while(!conexionExitosa){
            Scanner sc = new Scanner(System.in);
            String so = sc.nextLine();
            
            IOperativeSystem os = f.getOperativeSystem(so);
            try{
                os.instalar();
                conexionExitosa = true;
                this.os = os.getDatos();
            }catch(Exception e){
                System.out.println("Instalacion SO fallida, Intente otra vez");
            }
            
        }
    }
    
    public void instalarBD(){
        FactoryBD f = new FactoryBD();
        System.out.println("Ingrese el tipo de BD que desea \n Bases de datos disponibles: \n *Mongo \n *Postgres");
      
        boolean conexionExitosa = false;
        while(!conexionExitosa){
            Scanner sc = new Scanner (System.in);
            String db = sc.nextLine();
            
            IConexion bd = f.getConexion(db);
            try{
                bd.conectar();
                conexionExitosa = true;
                this.bd = bd.getDatos();   //iguala el atributo global con los datos de bd que se instalo
            }
            catch(Exception e){
                System.out.println("Conexion fallida, Intente otra vez");
            }
        } 
    }
    
    public void getInfoDroplet(){
        System.out.println(os);
        System.out.println(bd);
    }
}
