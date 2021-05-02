//patron: oberver
//Establece relación una a muchos
//donde si el obervador cambia
//este le notifica a todos los obervadores

//package src.comportamiento.Oberver;
//clase yutuber xd el cual va a ser el sujeto
import java.util.ArrayList;

public class Yutuber implements Sujeto{
    private int subs;
    private int cantidad;
    //Lista de observadores a notificar
    private ArrayList observadores;

    //constructor que inicia la lista
    public Yutuber(){
        observadores = new ArrayList();
    }

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

    }

    //para cambiar los valores y a la vez notificar dicho cambio
    public void setSubs(int subs, int cantidad){
        this.subs=subs;
        this.cantidad = cantidad;
        notificarObservadores();
        System.out.println("Los observadores han sido notificados");
    }

}
