/* Patron: adapter
Como su nombre lo dice, adpata una clase a otra
o mas bien su interfaz
De mandera que esperamos la clase adecuada
NO convierte, NO hace cast, adapta
*/
//interfaz de gatos, la que implementan todos los gatos
public interface Gato{
    void caminar();

    void dormir();

    void jugar();

    void comer();
}