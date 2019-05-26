package observer2;


/**
 * Write a description of class SpaceX here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceX
{
    public static void main (String args[]){
        //Crer Sujeto
        EstacionEspacial estacionFalcon = new EstacionEspacial();
        
        //Crear Oservadores
        Falcon f1 = new Falcon1(estacionFalcon, "marte", 20000);   //creo un falcon1 y le mando el sujeto (estacionFalcon) al cual estara pendiente de sus cambios, el planeta de destino y su distancia 
        Falcon f9 = new Falcon9(estacionFalcon, "mercurio", 50000);
        Falcon fh = new FalconHeavy(estacionFalcon, "jupiter", 80000);

        estacionFalcon.setMision("Recuperar muestras de la temperatura del planeta", 1000); //la estacionFaclon al momento de setear una mision solicita la mision y costo de combustible
    
        /*Cada falcon esta pendiente de la nueva mision y el costo de combustible
         * y sacaran su propio costo de mision particular segun sus distancias recorridas 
        */
    }
}
