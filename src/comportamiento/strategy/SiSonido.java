//patrón: strategy
//Tener un conjunto de "algortimos" y seleccionarlos depende el caso

//package src/comportamiento/strategy
//implementa la interfaz del ComportamientoSonido 
public class SiSonido implements ComportamientoSonido{

    public void sonido(){
        System.out.println("Quack!");
    }

}