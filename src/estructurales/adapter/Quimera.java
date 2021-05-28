/* Patron: adapter
Como su nombre lo dice, adpata una clase a otra
o mas bien su interfaz
De mandera que esperamos la clase adecuada
NO convierte, NO hace cast, adapta
*/
//clase que implementa la interfaz gato
public class Quimera implements Gato{

    public void caminar(){
        System.out.println("Que hueva la vida");
    }

    public void dormir(){
        System.out.println("No me despierten");
    }

    public void jugar(){
        System.out.println("Estúpido humano");
    }

    public void comer(){
        System.out.println("Mmmm... whiskas");
    }
}