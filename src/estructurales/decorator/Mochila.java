/* Patron: Decorator
Clase que envuelve más clases
para que tenga más funciones*/

//package src.estructurales.decorator

/*Clase concreta de Carga, la cual vamos a decorar*/
public class Mochila extends Carga{

    public Mochila(){
        descripcion = "Mochila: $5.99";
    }

    public double costo(){
        return 5.99; //6 peso;
    }
}
