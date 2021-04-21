//patron factory/fabrica
//Intancia los objetos a través de una fabrica
//No direcatemente
//package src.creacion.factory;
//es com un auxiliar 
//de esta manera solo añadimos una nueva clase si queremos 
//modificar el codigo

//definimos la interfaz a implementar, después las clases que la implementan
public interface Combate{

    //metodos que implementarán las clases
    //ataca cuerpo a cuerpo xd
    String atacar();

    //cubre el personaje
    String cubrir();

    //lanza su poder jaja
    String lanzar();

}