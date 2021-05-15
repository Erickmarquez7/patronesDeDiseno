//patron factory/fabrica
//Intancia los objetos a través de una fabrica
//No direcatemente
//package src.creacion.factory;

public class IztapalapaDoble extends Burger{
    public IztapalapaDoble(){
        salsa = "Salsa especial";
        pan = "Pan normal";
        
        ingredientes.add("Carne");
        ingredientes.add("Carne");
        ingredientes.add("Queso");
        ingredientes.add("Jitomate");
        ingredientes.add("Lechuga");
        ingredientes.add("Pepinillos");
    }

    @Override void cocina(){
        System.out.println("Calentando Hamburguesa (tostando el pan, yum)");
        System.out.println("Le pone BBQ");
    }
}