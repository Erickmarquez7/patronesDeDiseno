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

        Xbox casa = new Xbox();

        XboxOn enciende = new XboxOn(casa);
        control.setComando(enciende);
        control.ejecuta();

        XboxOff apaga = new XboxOff(casa);
        control.setComando(apaga);
        control.ejecuta();

        XboxLeeDisco lee = new XboxLeeDisco(casa);
        control.setComando(lee);
        control.ejecuta();

        XboxSacaDisco saca = new XboxSacaDisco(casa);
        control.setComando(saca);
        control.ejecuta();

    }
}