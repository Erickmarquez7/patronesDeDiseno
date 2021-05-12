//patron factory/fabrica
//Intancia los objetos a través de una fabrica
//No direcatemente
//package src.creacion.factory;

//cada clase implementa la interfaz
public class Mago implements Combate{
    //algunas caracteristicas del personaje
    private String nombre;
    private double danio;
    private int vida;

    public Mago(){
        nombre = "Maguito";
        danio = 10.0;
        vida = 90;
    }

    //ataca cuerpo a cuerpo xd
    public String atacar(){
        return "Maguito ataca";
    }

    //cubre el personaje
    public String cubrir(){
        return "El mago se ha cubierto";
    }

    //lanza su poder jaja
    public String lanzar(){
        return "Ha lanzdo un poder con la bola mágica";
    }

}