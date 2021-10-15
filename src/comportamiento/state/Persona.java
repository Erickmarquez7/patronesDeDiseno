public class Persona {
    //Todos los estados posibles
    State feliz;
    State triste;
    State enojado;
    State neutro;

    //El estado del objeto
    State estado;

    //el estado inicial va a ser neutro
    public Persona(){
        //Inicializamos los estados, pasandole el objeto que vamos a cambiar, o sea este
        feliz = new Feliz(this);
        triste = new Triste(this);
        enojado = new Enojado(this);
        neutro = new Neutro(this);
        estado = neutro;
    }

    //Cambia el estado del objeto
    public void setEstado(State estado){
        this.estado = estado;
    }
    
    //métodos para que nos regresen el estado que deseamos
    public State getFeliz(){
        return feliz;
    }

    public State getTriste(){
        return triste;
    }


    public State getEnojado(){
        return enojado;
    }

    public State getNeutro(){
        return neutro;
    }


    /*La persona va a realizar una acción y dependiendo del estado que tenga
    este (el objeto persona) va a ejecutar la accion del estado, así que como tal se manda a 
    llamar la accion del estado
    */
    public void abrazar(){
        estado.abrazar();
    }

    public void patear(){
        estado.patear();
    }

    public void llorar(){
        estado.llorar();
    }

    public void hablar(){
        estado.hablar();
    }

    public void estado(){
        System.out.println(estado);
    }
}
