/* Patron: Decorator
Clase que envuelve más clases
para que tenga más funciones*/

//package src.estructurales.decorator

/*Clase concreta de Carga, la cual vamos a decorar*/
public class Bolsa extends Carga{

    public Bolsa(){
        descripcion="Bolsa: $1.10";
    }

    public double costo(){
        return 1.10; //1 peso
    }
}