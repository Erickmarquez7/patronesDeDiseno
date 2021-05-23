/*patron Command/comando
Trata a peticiones como objetos para pasarlas
a un "controlador", de esta manera separa 
el "qué" del "como"*/
public class Puerta{
    private boolean cerrada = true;

    public void cambia(){
        if(cerrada)
            cerrada = false;
        else
            cerrada = true;
        System.out.println("La puerta ahora está " + (cerrada? "cerrada": "apagada") );
    }
}