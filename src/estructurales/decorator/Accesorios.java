/* Patron: Decorator
Clase que envuelve más clases
para que tenga más funciones*/

//package src.estructurales.decorator

/*Accesorios con los cuales vamos a decorar
a nuestra clase Carga*/
//Extendemos a carga para "amarrar" el tipo
//y poder hacerla intercambiable
public abstract class Accesorios extends Carga{

    //volvemos el metodo abstracto
    public abstract String getDescripcion();
    
    //igual podría ser un metodo bastracto costo();
}
