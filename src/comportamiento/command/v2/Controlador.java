public class Controlador{
    Command[] encendidos; //tenemos arreglos de comandos
    Command[] apagados;

    //guardamos el comando a ejecutar
    public Controlador(){
        encendidos = new Command[7];
        apagados = new Command[7];

        Command sin = new SinComando();
        for (int i = 0; i<7;i++){
            encendidos[i] = sin;
            apagados[i] = sin;
        }

    }

    public void setComando(int pos, Command encendido, Command apagado){
        encendidos[pos] = encendido;
        apagados[pos] = apagado;
    }

    //mandamos a llamar el comando solocitado
    public void enciendeBoton(int pos){
        if(encendidos[pos] != null)
            encendidos[pos].execute();
    }

    public void apagaBoton(int pos){
        if(encendidos[pos] != null)
            apagados[pos].execute();
    }

    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Controlador -------\n");
        for (int i = 0; i < encendidos.length; i++) {
            stringBuff.append("[Botón " + i + "] " + encendidos[i].getClass().getName()
            + "     " + apagados[i].getClass().getName() + "\n");
        }
    return stringBuff.toString();
    }

}