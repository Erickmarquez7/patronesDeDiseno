public class Feliz implements State{
    //Guardamos una referencia al objeto que queremos cambiar
    //para poder cambiarlo desde el estado
    Persona persona;

    //En el constructor ponemos el objeto que queremos cambiar, en este caso una persona
    public Feliz(Persona persona){
        this.persona = persona;
    }
    //abrazar no cambia el estado del objeto
    @Override
    public void abrazar(){
        System.out.println("Me siento bien, gracias");
    }

    //cambia el estado a enojado
    @Override
    public void patear(){
        System.out.println("Me enojé");
        persona.setEstado(persona.getEnojado());
    }

    //llorar lo pone triste
    @Override
    public void llorar(){
        System.out.println("Quiero llorar");
        persona.setEstado(persona.getTriste());
    }

    @Override
    public void hablar(){
        System.out.println("Me siento bien hablando");
        
    }

    @Override
    public String toString(){
        return "Estado: Feliz";
    }
    
}
