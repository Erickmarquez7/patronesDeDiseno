//patron: oberver
//Establece relación una a muchos
//donde si el obervador cambia
//este le notifica a todos los obervadores

/*package src.comportamiento.observer;
clase yutuber xd el cual va a ser el sujeto
java nos provee de una clase Observable para extender,
haciendo la clase el sujeto*/
import java.util.Observable;
import java.util.Observer;

public class Yutuber extends Observable{
    private int subs;
    private int cantidad;

    //constructor
    public Yutuber(){}

    /* Estos métodos ya los implementa la superclase
    Al igual que el de noticarObservadores()
    //avisa a los obervadores que hubo un cambio
    public void notificarObservadores(){
        for(int i = 0; i<observadores.size(); i++){
            //recorremos la lista y vemos a los elementos como Obervadores
            Observador obs = (Observador) observadores.get(i);
            //para después mandar a llamar el método y notiticarlos
            obs.actualizar(subs, 01052001, cantidad);
        }
    }

    //agrega a un obervador
    public void agregarObervador(Observador o){
        observadores.add(o);
    }

    //elimina a un obervador
    public void eliminarObservador(Observador o){
        int i = observadores.indexOf(o);
        if (i>=0)
            observadores.remove(i);

    }*/

    //para cambiar los valores y a la vez notificar dicho cambio

    public void setSubs(int subs, int cantidad){
        this.subs=subs;
        this.cantidad = cantidad;
        //Cambia a que los valores han sido modificados
        setChanged();
        //notifica a los observadores
        notifyObservers();
        System.out.println("Los observadores han sido notificados");
    }

    public int getSubs(){
        return subs;
    }

    public int getCantidad(){
        return cantidad;
    }

}
