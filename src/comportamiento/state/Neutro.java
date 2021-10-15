public class Neutro implements State{
    //Guardamos una referencia al objeto que queremos cambiar
    //para poder cambiarlo desde el estado
    Persona persona;

    //En el constructor ponemos el objeto que queremos cambiar, en este caso una persona
    public Neutro(Persona persona){
        this.persona = persona;
    }

    //abrazar lo pone feli
    @Override
    public void abrazar(){
        System.out.println("Abrazar me pone feli");
        persona.setEstado(persona.getFeliz());
    }

    //Patear lo pone enojado
    @Override
    public void patear(){
        System.out.println("Quiero patear cosas");
        persona.setEstado(persona.getEnojado());
    }

    //llorar lo pone triste
    @Override
    public void llorar(){
        System.out.println("Como que me dieron ganas de llorar");
        persona.setEstado(persona.getTriste());
    }

    //hablar es igual
    @Override
    public void hablar(){
        System.out.println("No tengo que decir");
    }

    @Override
    public String toString(){
        return "Estado: Neutro";
    }
}
    
