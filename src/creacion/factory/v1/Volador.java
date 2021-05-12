//patron factory/fabrica
//Intancia los objetos a través de una fabrica
//No direcatemente
//package src.creacion.factory;

//cada clase implementa la interfaz
public class Volador implements Combate{
    //algunas caracteristicas del personaje
    private String nombre;
    private double danio;
    private int vida;

    public Volador(){
        nombre = "Volador";
        danio = 11.0;
        //arco
        vida = 100;
    }

    //ataca cuerpo a cuerpo xd
    public String atacar(){
        return "Volador vuela";
    }

    //cubre el personaje
    public String cubrir(){
        return "El que vuela se cubre en una nube";
    }

    //lanza su poder jaja
    public String lanzar(){
        return "Lanza una flecha de su arco";
    }

}