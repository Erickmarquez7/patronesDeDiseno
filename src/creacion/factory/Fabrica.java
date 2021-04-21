//patron factory/fabrica
//Intancia los objetos a través de una fabrica
//No direcatemente
//package src.creacion.factory;

//esta es la fabrica para devolver las instancias
public class Fabrica{

    //metodo para devolver las diferentes implementaciones
    //pero devolvemos la implementación
    //ya que no estamos seguros de qué vaya a querer el usuario

    public Combate getJugador(String personaje){
        //depende de lo que me diga es lo que vo y a devolver
        if (personaje == null){
            return new Desconocido();
        }
        
        if(personaje.equalsIgnoreCase("MAGO"))
            return new Mago();
        else if (personaje.equalsIgnoreCase("VOLADOR"))
            return new Volador();
        else if (personaje.equalsIgnoreCase("GUERRERO"))
            return new Guerrero();
        //si no coincide nada entonces devuelvo el desconocido xd
        else  
            return new Desconocido();

    }


}