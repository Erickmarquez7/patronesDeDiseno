//patron: oberver
//Establece relación una a muchos
//donde si el obervador cambia
//este le notifica a todos los obervadores

//package src.comportamiento.Oberver;
//clase Subs como un observador del sujeto
//la interfaz la implementa cualquier objeto que pueda ser observador
public class Donador implements Observador, Muestra {
    //notemos que tiene casi los mismos atributos que el sujeto
    private int subs;
    private int cantidad;
    private int fecha;
    //el sujeto a observar, ponemos "Sujeto" en general
    //porque bien podría ser un tiktoker xd
    private Sujeto sujeto;

    public Donador(Sujeto sujeto){
        //en el constructor lo "conectamos" con el observador
        this.sujeto=sujeto;
        sujeto.agregarObervador(this);
    }

    public void actualizar(int subs, int fecha, int cantidad){
        System.out.println("Antes: \n");
        muestra();
        //tienen lo mismo de Yutuber, pues los mantenemos informados
        this.subs=subs;
        this.cantidad=cantidad;
        this.fecha=fecha;
        System.out.println("Despues: \n");
        muestra();
    }

    public void muestra(){
        System.out.println("Hola! el Yutuber tiene "+ subs+ " subscriptotes, el ultimo dio " 
        + (cantidad == 1 ? "un DogeCoin": cantidad + " DogeCoins") + " el dia "+fecha+"\n");
        //na mas pa distinguir el singular del plural, lol
    }    
    
}
