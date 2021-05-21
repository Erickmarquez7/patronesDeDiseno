public class Controlador{
    Command lote; //tenemos un comando

    //guardamos el comando a ejecutar
    public void setComando(Command lote){
        this.lote = lote;
    }

    //mandamos a llamar el comando solocitado
    public void ejecuta(){
        lote.execute();
    }

}