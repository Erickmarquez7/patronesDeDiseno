/* Patron: adapter
Como su nombre lo dice, adpata una clase a otra
o mas bien su interfaz
De mandera que esperamos la clase adecuada
NO convierte, NO hace cast, adapta
*/
public class Main{
    //Metodo que recibe un perro
    //en principio teniamos esto, pero dado que estyo trabajando con gatos me fui obligado a hacer una adaptador
    static void pruebaPerro(Perro p){
        p.jugar();
        p.correr();
        p.comer();
    }

    public static void main(String[] args) {
        //creamos el perro y gato
        Pomeriam cami = new Pomeriam();
        Quimera mr = new Quimera();

        System.out.println("---Perro---");
        cami.jugar();
        cami.correr();
        cami.descansar();

        System.out.println("\n---Gato---");
        mr.jugar();
        mr.caminar();
        mr.comer();

        System.out.println("\n---Adaptando el Gato a un perro---");
        //adaptamos el gato a perro, y le pasamos el gato a adaptar
        Perro gacami = new GatoAPerro(mr);

        //lo ponemos a prueba y vemos que en efecto lo vemos como Perro a pesar de ser un gato "lo adaptda"
        pruebaPerro(gacami);
        //el gato se comporta como un perro 

    }
}