public class Main{

    public static void main(String [] args){
        //el controlador
        Controlador control = new Controlador();

        //el objeto que tendrá el comando y el comando
        Luz cocina = new Luz();
        LuzComando lc = new LuzComando(cocina);

        control.setComando(lc);
        control.ejecuta();

        control.setComando(new PuertaComando(new Puerta()));
        control.ejecuta();

    }
}