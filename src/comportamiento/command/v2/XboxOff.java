/*patron Command/comando
Trata a peticiones como objetos para pasarlas
a un "controlador", de esta manera separa 
el "qué" del "como"*/
public class XboxOff implements Command{
    Xbox xbox;

    public XboxOff(Xbox xbox){
        this.xbox = xbox;
    }

    public void execute(){
        xbox.apaga();

    }
}