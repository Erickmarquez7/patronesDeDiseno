public class CoyoacanKrispy extends Burger{
    public CoyoacanKrispy(){
        salsa = "Salsa especial";
        pan = "Masa especial xd";
    
        ingredientes.add("Pollo Krispy");
        ingredientes.add("Queso");
        ingredientes.add("Jitomate");
    }

    @Override void envuelve(){
        System.out.println("Envolviendo en paquete");
        System.out.println("Le pone dulces");

    }
    
}
