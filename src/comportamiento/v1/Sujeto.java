//patron: observer
//Establece relación una a muchos
//donde si el obervador cambia
//este le notifica a todos los obervadores

//package src.comportamiento.Oberver;
//interfaz a implementar para todos los posibles sujetos
public interface Sujeto {
    public void agregarObervador(Observador o);
    public void eliminarObservador(Observador o);
    //public void notificarObervadores();
    
    
} 
