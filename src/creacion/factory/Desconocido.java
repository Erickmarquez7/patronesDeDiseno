//patron factory/fabrica
//Intancia los objetos a través de una fabrica
//No direcatemente
//package src.creacion.factory;

public class Desconocido implements Combate{

    //ataca cuerpo a cuerpo xd
    public String atacar(){
            return "Algún extraño se unió";
    }
    
    //cubre el personaje
    public String cubrir(){
        return "El extraño está huyendo";
    }
    
    //lanza su poder jaja
    public String lanzar(){
        return "El extraño lanzó una piedra xd";
    }


}