public class Enojado implements State{
    //Guardamos una referencia al objeto que queremos cambiar
    //para poder cambiarlo desde el estado
    Persona persona;

    //En el constructor ponemos el objeto que queremos cambiar, en este caso una persona
    public Enojado(Persona persona){
        this.persona = persona;
    }

    //abrazar no cambia el estado del objeto
    @Override
    public void abrazar(){
        System.out.println("Estoy enojado, no quiero abrazar");
    }

    //Patear lo pone mas enojado
   @Override
    public void patear(){
        System.out.println("Estoy aun más enojado");
    }

    //llorar lo pone triste
   @Override
    public void llorar(){
        System.out.println("No quiero estar así, quiero llorar");
        persona.setEstado(persona.getTriste());
    }

    //hablar lo calma un poco
    @Override
    public void hablar(){
        System.out.println("Hablando las cosas uno se siente bien");
        persona.setEstado(persona.getNeutro());
    }    

    @Override
    public String toString(){
        return "Estado: Enojado";
    }
}
