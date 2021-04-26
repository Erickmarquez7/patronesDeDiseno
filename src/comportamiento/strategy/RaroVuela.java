//patrón: strategy
//Tener un conjunto de "algortimos" y seleccionarlos depende el caso

//package src/comportamiento/strategy
//implementa la interfaz del ComportamientoVolar 
public class RaroVuela implements ComportamientoVolar{

    public void volar(){
        System.out.println("Vuelo algo raro");
    }

}