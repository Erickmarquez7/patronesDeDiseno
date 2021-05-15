import java.util.ArrayList;

//patron factory/fabrica
//Intancia los objetos a través de una fabrica
//No direcatemente
//package src.creacion.factory;

public abstract class Burger{
    String salsa;
    String pan;
    String tipo;

    ArrayList<String> ingredientes = new ArrayList<String>();

    void prepara(){
        System.out.println("Preparando Hamburguesa "+tipo);
        System.out.println("\nPreparando "+salsa+"\nPreparando "+pan+"\npreparando: "+pan);
        for(int i = 0; i<ingredientes.size(); i++){
            System.out.println("Añadiendo: "+ingredientes.get(i));
        }

    }

    void cocina(){
        System.out.println("Calentando Hamburguesa (tostando el pan, yum)");
    }

    void envuelve(){
        System.out.println("Envolviendo en paquete");
    }

    String getTipo(){
        return tipo;
    }

    void setTipo(String tipo){
        this.tipo = tipo;
    }
}