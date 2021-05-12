//patron factory/fabrica
//Intancia los objetos a través de una fabrica
//No direcatemente
//package src.creacion.factory;

public class Prueba{
    
    public static void main(String[] args){
        //intancio la fabrica
        Fabrica fabrica = new Fabrica();

        //ponemos Combate porque no sabemos lo que el jugador va a elegir
        //bien podría ser fabrica.getJugador(str);
        Combate c = fabrica.getJugador("maGo");
        System.out.println(c.atacar());
        System.out.println(c.cubrir());
        System.out.println("");

        Combate c2 = fabrica.getJugador("gUerRero");
        System.out.println(c2.atacar());
        System.out.println(c2.lanzar());
        System.out.println("");

        Combate c3 = fabrica.getJugador("VoLaDoR");
        System.out.println(c3.cubrir());
        System.out.println(c3.lanzar());
        System.out.println("");

        Combate d = fabrica.getJugador("arquero");
        System.out.println(d.atacar());
        System.out.println(d.lanzar());

        /*Salida: 
        Maguito ataca
        El mago se ha cubierto

        Pleador golpea fuerte pero no tanto como el Mago
        Lanza lo que encuentre en el camino

        El que vuela se cubre en una nube
        Lanza una flecha de su arco

        Algún extraño se unió
        El extraño lanzó una piedra xd
        */
        //esto es increible
    }

}