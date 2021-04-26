//patrón: strategy
//Tener un conjunto de "algortimos" y seleccionarlos depende el caso

//package src/comportamiento/strategy
//implementa la interfaz del ComportamientoVolar 
public class NoSonido implements ComportamientoSonido{

    public void sonido(){
        System.out.println("*Grillo*");
    }

}