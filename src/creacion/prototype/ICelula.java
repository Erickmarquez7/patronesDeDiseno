//patrón Prototype
//Permite clonar una instancia de clase en diferente dirección de memoria
//como su nombre lo indica, es mas que clonar, es un propotipo, para no 
//tener que crear otra intancia y pasarle los mismo valores, es como un 
//"por defecto"

//package src.creacion.prototype;

//interfaz porque puede que una o mas clases la implementen
//entendemos de Cloneable
public interface ICelula extends Cloneable{

    //devuelvo la interfaz por la misma razón que no estamos seguros la clase
    //que lo va a implementar
    ICelula clonar();
}
