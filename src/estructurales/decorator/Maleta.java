/* Patron: Decorator
Clase que envuelve más clases
para que tenga más funciones*/

//package src.estructurales.decorator

/*Clase concreta de Carga, la cual vamos a decorar*/
public class Maleta extends Carga{

    public Maleta(){
        descripcion="Maleta: $9.95";
    }

    public double costo(){
        return 9.95; //10 peso
    }
}