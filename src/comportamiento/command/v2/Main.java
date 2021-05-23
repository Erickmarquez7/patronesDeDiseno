public class Main{

    public static void main(String [] args){
        //el controlador
        Controlador control = new Controlador();

        //creamos los servicios
        Luz sala = new Luz();
        Luz cocina = new Luz();
        Puerta principal = new Puerta();
        Puerta cuarto = new Puerta();
        Xbox xbox = new Xbox();
        Xbox xbox2 = new Xbox();

        //creamos los comandos de luz
        LuzComando ls = new LuzComando(sala);
        LuzComando lc = new LuzComando(cocina);
        //creamos comando de puerta
        PuertaComando pp = new PuertaComando(principal);
        PuertaComando pc = new PuertaComando(cuarto);
        //creamos comandos de xbox
        XboxOn xe = new XboxOn(xbox);
        XboxOff xp = new XboxOff(xbox);

        XboxOn x2e = new XboxOn(xbox2);
        XboxOff x2p = new XboxOff(xbox2);
        //asignamos botones
        control.setComando(0, xe, xp);
        control.setComando(1, x2e, x2p);
        control.setComando(2, ls, lc);
        control.setComando(3, pp, pc);

        System.out.println(control);

        control.enciendeBoton(0);
        control.apagaBoton(1);
        control.enciendeBoton(2);

        control.enciendeBoton(6);

    }
}