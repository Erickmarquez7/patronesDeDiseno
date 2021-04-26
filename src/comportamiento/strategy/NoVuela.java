//patrón: strategy
//Tener un conjunto de "algortimos" y seleccionarlos depende el caso

//package src/comportamiento/strategy
//implementa la interfaz del ComportamientoVolar 
public class NoVuela implements ComportamientoVolar{

    public void volar(){
        System.out.println("No puedo volar!");
    }

}