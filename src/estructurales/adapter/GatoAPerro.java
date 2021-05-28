/* Patron: adapter
Como su nombre lo dice, adpata una clase a otra
o mas bien su interfaz
De mandera que esperamos la clase adecuada
NO convierte, NO hace cast, adapta
*/
//clase para adaptar/moldear un gato a perr
    //implementamos la interfaz a adpatar, la que esperamos o espera el cliente
public class GatoAPerro implements Perro{
    Gato gato;
    //mantenemos una referencia de lo que estamos adaptando
    public GatoAPerro(Gato gato){
        this.gato = gato;
    }

    //implementamos los métodos de la interfaz
    public void correr(){
        //pero mandando a llamar a los métodos de la clase que estamos adaptando
        //o con modificaciones
        gato.caminar();
        System.out.println("Deberas que lo intento :'v\n");

    }

    public void descansar(){
        //pero mandando a llamar a los métodos de la clase que estamos adaptando
        gato.dormir();

    }


    public void jugar(){
        //pero mandando a llamar a los métodos de la clase que estamos adaptando
        //o con modificaciones
        gato.jugar();
        System.out.println("Que bonita pelota\n");

    }

    public void comer(){
        //pero mandando a llamar a los métodos de la clase que estamos adaptando
        gato.comer();

    }

}