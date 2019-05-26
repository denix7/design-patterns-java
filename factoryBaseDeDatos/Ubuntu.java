package factoryBaseDeDatos;


/**
 * Write a description of class Ubuntu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ubuntu implements IOperativeSystem
{
    private String nombreSO;
    private String version;
    private String licensia;
    
    public Ubuntu(){
        nombreSO = "Ubuntu Server";
        version = "14.0 LTS";
        licensia = "MIT License";
    }
    
    @Override
    public void instalar(){
        System.out.println("Instalando... \n Ubuntu instalado");
    }
    
    @Override
    public void desinstalar(){
        System.out.println("Desinstalando... \n Ubuntu desinstalado");
    }
    
    @Override
    public String getDatos(){
        String res = "nombreSO: " + this.nombreSO + "\n version: " + this.version + "\n lisencia: " + this.licensia;
        return res;
    }
    
}
