/*patron Command/comando
Trata a peticiones como objetos para pasarlas
a un "controlador", de esta manera separa 
el "qué" del "como"*/
//el comando es tratado como un objeto
public class PuertaComando implements Command{
    Puerta p; 
    public PuertaComando(Puerta p){
        this.p = p;
    }

    public void execute(){
        p.cambia();
    }

}