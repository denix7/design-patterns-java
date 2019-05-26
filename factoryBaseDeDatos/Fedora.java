package factoryBaseDeDatos;


/**
 * Write a description of class Fedora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fedora implements IOperativeSystem
{
    private String nombreSO;
    private String version;
    private String licensia;
    
    public Fedora(){
        nombreSO = "Fedora Server";
        version = "16.0 LTS";
        licensia = "MIT License";
    }
    
    @Override
    public void instalar(){
        System.out.println("Instalando... \n Fedora instalado");
    }
    
    @Override
    public void desinstalar(){
        System.out.println("Desinstalando... \n Fedora desinstalado");
    }
    
    @Override
    public String getDatos(){
        String res = "nombreSO" + this.nombreSO + "\n version" + this.version + "\n lisencia" + this.licensia;
        return res;
    }
}
