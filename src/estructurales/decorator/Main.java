import java.text.DecimalFormat;
public class Main{

    public static void main(String[] args){
        //na mas pa tener solo dos decimales
        DecimalFormat df = new DecimalFormat("#.00");


        //creamos una carga;
        Carga mochila = new Mochila();
        //vemos la carga, no hemos añadido nada
        System.out.println(mochila.getDescripcion()+"\nCosto: $"+ df.format(mochila.costo())+"\n");
        //añadimos awa y comida
        mochila = new Agua(mochila);
        mochila = new Comida(mochila);
        //vemos
        System.out.println(mochila.getDescripcion()+"\nCosto: $"+ df.format(mochila.costo())+"\n");

        Carga bolsa = new Bolsa();
        System.out.println(bolsa.getClass());
        bolsa = new Ropa(bolsa);
        bolsa = new Ropa(bolsa);
        bolsa = new Agua(bolsa);
        //conviene ver esto con ayuda del heap y stack
        //para ver como cambian las referencias y envuelve los tipos
        System.out.println(bolsa.getDescripcion()+"\nCosto: $"+ df.format(bolsa.costo())+"\n");

        System.out.println(bolsa.getClass());

    }
}
