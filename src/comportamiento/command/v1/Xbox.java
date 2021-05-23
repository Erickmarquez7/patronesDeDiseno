/*patron Command/comando
Trata a peticiones como objetos para pasarlas
a un "controlador", de esta manera separa 
el "qué" del "como"*/
public class Xbox{
    boolean encendido;
    boolean disco;
    static final int ALTO = 3;
    static final int BAJO = 1;
    int vol;

    public void prende(){
        encendido = true;
        System.out.println("Xbox ahora está "+encendido);
    }

    public void apaga(){
        encendido = false;
        System.out.println("Xbox ahora está "+encendido);
    }

    public void sacaDisco(){
        disco = false;
        System.out.println("El disco ha sido expulsado");
    }

    public void leeDisco(){
        disco = true;
        System.out.println("El disco ha sido metido xd");
    }

    public void subeVoulmen(){
        vol = ALTO;
    }

    public void bajaVolumen(){
        vol = BAJO;
    }


}