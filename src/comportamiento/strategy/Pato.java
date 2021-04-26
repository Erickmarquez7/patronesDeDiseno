//patrón: strategy
//Tener un conjunto de "algortimos" y seleccionarlos depende el caso

//package src/comportamiento/strategy

//clase Pato

public abstract class Pato{
    //declaramos las referencias a interfaces a implementar
    //en este caso el volar y sonido
    ComportamientoVolar cv;
    ComportamientoSonido cs;

    public Pato(){}

    public abstract void muestra();

    public void nadar(){
        System.out.println("Todos los patos nadan o flotan!");
    }

    //estos métodos delegan las responsabilidad a las interfaces
    //mandando a llamar a su método de cada uno
    public void actuaVolar(){
        cv.volar();
    }

    public void actuaSonido(){
        cs.sonido();
    }

}
