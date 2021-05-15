public class CoyoacanClasica extends Burger{
    public CoyoacanClasica(){
        salsa = "Salsa especial";
        pan = "Pan especial xd";
        
        ingredientes.add("Carne");
        ingredientes.add("Queso");
        ingredientes.add("Jitomate");
    }
    
    @Override void envuelve(){
        System.out.println("Envolviendo en paquete");
        System.out.println("Le pone dulces");

    }
}
