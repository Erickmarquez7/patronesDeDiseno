
//patron factory/fabrica
//Intancia los objetos a través de una fabrica
//No direcatemente
//package src.creacion.factory;
public class IztapalapaFabrica extends TiendaH{

    //Retorna burger porque no sabemos en concreto cual va a ser
    //La fabrica de coyoacan hace hamburgesas al estilo Coyoacan

    @Override public Burger creaBurger(String tipo){
        Burger b;
        //igual podria ser con un if
        switch (tipo) {
            case "doble":
                b = new IztapalapaDoble();
                break;

            case "hawaiana":
                b = new IztapalapaHawaiana();
                break;

            case "krispy":
                b = new IztapalapaKrispy();
                break;
            
            default:
                b = new IztapalapaClasica();
                break;
        }
        b.setTipo(tipo+", estilo Iztapalapa");
        return b;

    }//fin del metodo creaBurger(String t)


}