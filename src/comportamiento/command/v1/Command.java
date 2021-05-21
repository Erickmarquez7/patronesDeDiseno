/*patron Command/comando
Trata a peticiones como objetos para pasarlas
a un "controlador", de esta manera separa 
el "qué" del "como"*/
//interfaz comando que implementan los comandos
public interface Command{

    public void execute();
}