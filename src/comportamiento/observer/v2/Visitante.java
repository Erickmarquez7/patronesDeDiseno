//patron: oberver
//Establece relación una a muchos
//donde si el obervador cambia
//este le notifica a todos los obervadores

//package src.comportamiento.Oberver;
//clase Subs como un observador del sujeto
//la interfaz la implementa cualquier objeto que pueda ser observador
import java.util.Observable;
import java.util.Observer;

public class Visitante implements Observer, Muestra {
    //notemos que tiene casi los mismos atributos que el sujeto
    private int subs;
    private int cantidad;
    private int fecha;
        //el sujeto a observar, ponemos "Observable" en general
    //porque bien podría ser un tiktoker xd
    private Observable obs;

    public Visitante(Observable obs){
        //en el constructor lo "conectamos" con el observador
        this.obs=obs;
        obs.addObserver(this);
    }

    //debemos implementar el metodo update(), es equivalente a este
    /*public void actualizar(int subs, int fecha, int cantidad){
        System.out.println("Antes: \n");
        muestra();
        //tienen lo mismo de Yutuber, pues los mantenemos informados
        this.subs=subs;
        this.cantidad=cantidad;
        this.fecha=fecha;
        System.out.println("Despues: \n");
        muestra();
    }*/

    public void update(Observable obs, Object o){

        if (obs instanceof Yutuber){
            Yutuber y = (Yutuber) obs;
            //ahora los datos los obtenemos directamente de la clase,
            //no necesitamos pasarlos como parametros
            this.subs=y.getSubs();
            this.cantidad=y.getCantidad();
            fecha=02052021;
            System.out.println("Despues: ");
            muestra();
        }

    }

    public void muestra(){
        System.out.println("Visitante: Tiene "+ subs + " subs, "+ cantidad +" de propina xd y el dia " + fecha+
        " fue la ultima vez\n");
        //na mas pa distinguir el singular del plural, lol
    }    
    
}
