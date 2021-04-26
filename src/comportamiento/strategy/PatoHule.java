//patrón: strategy
//Tener un conjunto de "algortimos" y seleccionarlos depende el caso

//package src/comportamiento/strategy
//Extiende de la clase pato que a su vez tiene comportamientos de volar y sonido
public class PatoHule extends Pato {

    //en el constructor le asignamos los valores a 
    //a las interfaces de case padre
    public PatoHule(){
        cv = new NoVuela(); //pero ya con el comportamiento especifico
        cs = new RaroSonido();
    }

    public void muestra(){
        System.out.println("Soy un pato de hule");
    }
}