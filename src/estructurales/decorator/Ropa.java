/* Patron: Decorator
Clase que envuelve más clases
para que tenga más funciones*/

//package src.estructurales.decorator

/*Clase concreta de Accesorios para decorar*/
//De igual manera, es hija de accesorios, que a su vez
//es hija de Carga
public class Ropa extends Accesorios{

    Carga carga;

    public Ropa(Carga carga){
        this.carga = carga;
    }

    public String getDescripcion(){
        /*así cuando añadamos una nueva decoracion
        se envolverá en ese tipo: decorador1(decorador2(decorador3(Decora)))
        Como usamos herencia, finalmente siguen siendo del mismo tipo Decora
        */
        return carga.getDescripcion()+
        "\nRopa: $4.99";
    }

    public double costo(){
        return 4.99 + carga.costo();
    }
}