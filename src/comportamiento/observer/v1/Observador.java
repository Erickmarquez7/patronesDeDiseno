//patron: observer
//Establece relación una a muchos
//donde si el obervador cambia
//este le notifica a todos los obervadores

//package src.comportamiento.Observer;
//interfaz a implementar para todos los posibles observadores
public interface Observador {
    public void actualizar(int subs, int fecha, int cantidad);
}
