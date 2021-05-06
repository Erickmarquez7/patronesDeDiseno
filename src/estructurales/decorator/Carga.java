/* Patron: Decorator
Clase que envuelve más clases
para que tenga más funciones*/

//package src.estructurales.decorator

/*Clase abstracta a decorar
se refiere a como podemos transportar cosas xd*/
public abstract class Carga{

    String descripcion = "Carga desconocida";

    public String getDescripcion(){
        return descripcion;
    }

    public abstract double costo();
}