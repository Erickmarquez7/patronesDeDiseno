public class FabricaSimpleH{

    //Retorna burger porque no sabemos en concreto cual va a ser

    public Burger creaBurger(String tipo){
        Burger b;
        //igual podria ser con un if
        switch (tipo) {
            case "doble":
                b = new Doble();
                break;

            case "hawaiana":
                b = new Hawaiana();
                break;

            case "krispy":
                b = new Krispy();
                break;
            
            default:
                b = new Clasica();
                break;
        }
        b.setTipo(tipo);
        return b;

    }//fin del metodo creaBurger(String t)


}