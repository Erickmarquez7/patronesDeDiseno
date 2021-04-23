//patrón Prototype
//Permite clonar una instancia de clase en diferente dirección de memoria
//como su nombre lo indica, es mas que clonar, es un propotipo, para no 
//tener que crear otra intancia y pasarle los mismo valores, es como un 
//"por defecto"

//package src.creacion.prototype;
public class CelulaAnimal implements ICelula{
    private String nombre;
    private int vida;

    public CelulaAnimal(){
        vida = 100;
    }

    //sobre escribo el método clonar, pues clono la clase que implementa interfaz
    @Override
    public ICelula clonar(){
        //Declaro la variable
        CelulaAnimal clon = null;
        try {
            //llamo el método y hago un cast pa que lo vea como la clase, no como la interfaz
            clon = (CelulaAnimal) clone();
            //pues si no jala lanzo la excepcion
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clon;
    }

    public int getVida(){
        return vida;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public String toString(){
        return "La celula animal tiene "+vida+" de vida";
    }

}