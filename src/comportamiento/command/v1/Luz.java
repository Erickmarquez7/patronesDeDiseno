/*patron Command/comando
Trata a peticiones como objetos para pasarlas
a un "controlador", de esta manera separa 
el "qué" del "como"*/
public class Luz{
    private boolean prendida;

    public void zuitch(){
        if(prendida)
            prendida = false;
        else
            prendida = true;
        System.out.println("La luz ahora está " + (prendida? "prendida": "apagada") );
    }
}