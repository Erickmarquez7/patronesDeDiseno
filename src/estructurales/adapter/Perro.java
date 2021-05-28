/* Patron: adapter
Como su nombre lo dice, adpata una clase a otra
o mas bien su interfaz
De mandera que esperamos la clase adecuada
NO convierte, NO hace cast, adapta
*/
//interfaz de Perros, la que implementan todos los perros
public interface Perro{
    void correr();

    void descansar();

    void jugar();

    void comer();
}