//patron factory/fabrica
//Intancia los objetos a través de una fabrica
//No direcatemente
//package src.creacion.factory;

//cada clase implementa la interfaz
public class Guerrero implements Combate{
    //algunas caracteristicas del personaje
    private String nombre;
    private double danio;
    private int vida;

    public Guerrero(){
        nombre = "Peleador";
        danio = 8.5;
        vida = 130;
    }

    //ataca cuerpo a cuerpo xd
    public String atacar(){
        return "Peleador golpea fuerte pero no tanto como el Mago";
    }

    //cubre el personaje
    public String cubrir(){
        return "Usa su escudo";
    }

    //lanza su poder jaja
    public String lanzar(){
        return "Lanza lo que encuentre en el camino";
    }

}