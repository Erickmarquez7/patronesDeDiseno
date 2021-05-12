public abstract class Burger{
    String tipo;

    void prepara(){
        System.out.println("Preparando Hamburguesa "+tipo+"\nAñadiendo Ingredientes");
    }

    void cocina(){
        System.out.println("Calentando Hamburguesa (tostando el pan, yum)");
    }

    void envuelve(){
        System.out.println("Envolviendo en paquete");
    }

    String getTipo(){
        return tipo;
    }

    void setTipo(String tipo){
        this.tipo = tipo;
    }
}