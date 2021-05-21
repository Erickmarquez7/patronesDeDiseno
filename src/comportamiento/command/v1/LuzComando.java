/*patron Command/comando
Trata a peticiones como objetos para pasarlas
a un "controlador", de esta manera separa 
el "qué" del "como"*/
//el comando es tratado como un objeto
public class LuzComando implements Command{
    Luz luz;
    //le pasamos la luz que recibirá el comando
    public LuzComando(Luz luz){
        this.luz = luz;
    }


    public void execute(){
        //implementamos el método de la interfaz
        //lo que hará el objeto cuando se mande a llamar el método
        luz.zuitch();
    }

}