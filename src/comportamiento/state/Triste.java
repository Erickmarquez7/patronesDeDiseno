public class Triste implements State{
    //Guardamos una referencia al objeto que queremos cambiar
    //para poder cambiarlo desde el estado
    Persona persona;

    //En el constructor ponemos el objeto que queremos cambiar, en este caso una persona
    public Triste(Persona persona){
        this.persona = persona;
    }

    //abrazar lo pone neutro
    @Override
    public void abrazar(){
        System.out.println("Ya estoy mejor, gracias!");
        persona.setEstado(persona.getNeutro());
    }

    //Patear lo pone mas triste, es decir, no cambia
    @Override
    public void patear(){
        System.out.println("Estoy triste como para patear cosas");
    }

    //llorar lo pone triste
    @Override
    public void llorar(){
        System.out.println("Claro que sí quiero llorar");
    }

    //hablar lo calma un poco
    @Override
    public void hablar(){
        System.out.println("Después de hablar con lagrimas en los ojos me siento bien");
        persona.setEstado(persona.getNeutro());
    }

    @Override
    public String toString(){
        return "Estado: Triste";
    }
    
}
