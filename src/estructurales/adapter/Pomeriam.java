/* Patron: adapter
Como su nombre lo dice, adpata una clase a otra
o mas bien su interfaz
De mandera que esperamos la clase adecuada
NO convierte, NO hace cast, adapta
*/
//clase que implementa perro
public class Pomeriam implements Perro{

    public void correr(){
        System.out.println("Estoy corriendo");
    }

    public void descansar(){
        System.out.println("Que cansancio");
    }

    public void jugar(){
        System.out.println("Voy por la pelota");
    }

    public void comer(){
        System.out.println("Croquetas!");
    }
}