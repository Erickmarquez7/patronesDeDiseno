//patrón: strategy
//Tener un conjunto de "algortimos" y seleccionarlos depende el caso

//package src/comportamiento/strategy
//implementa la interfaz del ComportamientoVolar 
public class SiVuela implements ComportamientoVolar{

    public void volar(){
        System.out.println("Sí puedo volar!");
    }

}