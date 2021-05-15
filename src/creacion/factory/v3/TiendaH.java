
//patron factory/fabrica
//Intancia los objetos a través de una fabrica
//No direcatemente
//package src.creacion.factory;
public abstract class TiendaH{

    /*En esta versión cambiamos la intancia por Herencia
    FabricaSimpleH fabrica;
    public TiendaH(FabricaSimpleH fabrica){
        this.fabrica = fabrica;
    }*/

    /*La tienda es quien hace el producto, hace el pedido
    Y las clases hijas quienes lo preparan de acuerdo a su estilo
    Padre es quien ordena, hijo quien la prepara jaja
    */
    public Burger ordenH(String tipo){
        //y la fabrica que elegimos va a crear dicho objeto
        /*Este es el método de la clase hija
        Conviene pensar esto con el despacho dinamico
        */
        Burger b;
        b = creaBurger(tipo);
        b.prepara();
        b.cocina();
        b.envuelve();
        return b;
    }

    //lo implementan las clases hijas
    abstract Burger creaBurger(String tipo);

    /*public static void main(String[] args){
        //creamos la tienda y le pasamos la fabrica de donde queremos que haga las intancias
        TiendaH tienda = new TiendaH(new FabricaSimpleH());
        //minuscula toda
        Burger b = tienda.ordenH("hawaiana");
        System.out.println( b.getClass());

    }*/
}