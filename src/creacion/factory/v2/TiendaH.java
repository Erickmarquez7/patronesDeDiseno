public class TiendaH{

    //Podríamos cambiar de fabrica
    FabricaSimpleH fabrica;

    public TiendaH(FabricaSimpleH fabrica){
        this.fabrica = fabrica;
    }

    //pasamos el tipo de Hamburgesa que queremos
    public Burger ordenH(String tipo){
        //y la fabrica que elegimos va a crear dicho objeto
        Burger b = fabrica.creaBurger(tipo);
        b.prepara();
        b.cocina();
        b.envuelve();
        return b;
    }

    public static void main(String[] args){
        //creamos la tienda y le pasamos la fabrica de donde queremos que haga las intancias
        TiendaH tienda = new TiendaH(new FabricaSimpleH());
        //minuscula toda
        Burger b = tienda.ordenH("hawaiana");
        System.out.println( b.getClass());

    }
}