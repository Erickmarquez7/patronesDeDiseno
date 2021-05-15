//patron factory/fabrica
//Intancia los objetos a través de una fabrica
//No direcatemente
//package src.creacion.factory;
public class IztapalapaKrispy extends Burger{
    public IztapalapaKrispy(){
        salsa = "Salsa especial";
        pan = "Pan normal";
        
        ingredientes.add("Pollo Krispy");
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