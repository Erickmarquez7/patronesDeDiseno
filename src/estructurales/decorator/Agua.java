/* Patron: Decorator
Clase que envuelve más clases
para que tenga más funciones*/

//package src.estructurales.decorator

/*Clase concreta de Accesorios para decorar*/
//De igual manera, es hija de accesorios, que a su vez
//es hija de Carga
public class Agua extends Accesorios{
    //amarramos la clase
    Carga carga;

    public Agua(Carga carga){
        /*así cuando añadamos una nueva decoracion
        se envolverá en ese tipo: decorador1(decorador2(decorador3(Decora)))
        Como usamos herencia, finalmente siguen siendo del mismo tipo Decora
        */
        this.carga = carga;
    }

    public String getDescripcion(){
        return carga.getDescripcion() + 
        "\nBotella de agua: $3.00";
    }

    public double costo(){
    	//carga.costo() es el costo del producto en sí
        return 3.00 + carga.costo();
    }

}
