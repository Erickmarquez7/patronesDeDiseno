//patron: observer
//Establece relación una a muchos
//donde si el obervador cambia
//este le notifica a todos los obervadores

//package src.comportamiento.Oberver;
//interfaz a implementar para todos los posibles sujetos

public class Main{
    public static void main(String[] args){
        //construyo mi observador
        Yutuber y = new Yutuber();

        //creamos nuestros observadores y los conectamos con el sujeto
        //en este orden se van a mandar a llamar
        Subs s = new Subs(y);
        Donador d = new Donador(y);
        Visitante v = new Visitante(y);
        //4 subs y 100 doges
        y.setSubs(4, 100);
        //7 subs y un dog
        //y.setSubs(7, 1);
        
    }
}