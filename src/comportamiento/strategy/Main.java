//patrón: strategy
//Tener un conjunto de "algortimos" y seleccionarlos depende el caso

//package src/comportamiento/strategy
//clase principal
public class Main{

    public static void main(String[] args){
        //primero el super tipo y después el concreto
        Pato mallard = new PatoMallard();
        //salida: quack!
        mallard.actuaSonido();
        //salida: Sí puedo volar
        mallard.actuaVolar();
        
        System.out.println();

        Pato hule = new PatoHule();
        //salida: Suena raro...
        hule.actuaSonido();
        //salida: No puedo volar!
        hule.actuaVolar();

        //esto es increible

    }
}