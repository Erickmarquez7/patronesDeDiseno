
public class CoyoacanFabrica extends TiendaH{
    //Retorna burger porque no sabemos en concreto cual va a ser
    //La fabrica de coyoacan hace hamburgesas al estilo Coyoacan
    @Override public Burger creaBurger(String tipo){
        Burger b;
        //igual podria ser con un if
        switch (tipo) {
            case "doble":
                b = new CoyoacanDoble();
                break;

            case "hawaiana":
                b = new CoyoacanHawaiana();
                break;

            case "krispy":
                b = new CoyoacanKrispy();
                break;
            
            default:
                b = new CoyoacanClasica();
                break;
        }
        b.setTipo(tipo+ ", estilo Coyoacan");
        return b;

    }//fin del metodo creaBurger(String t)

    
}
