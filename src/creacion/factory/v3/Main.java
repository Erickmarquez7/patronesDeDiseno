
public class Main {
    public static void main(String[] args){
        //Hacemos la Fabrica y después su implementación en concreto
        TiendaH coyoacan = new CoyoacanFabrica(); 
        TiendaH izta = new IztapalapaFabrica();

        //Izta prepara su propia hamburgesa a su estilo
        izta.ordenH("doble");
        //Coyoacan igual
        System.out.println();
        coyoacan.ordenH("krispy");
        System.out.println();
        coyoacan.ordenH("hawaiana");

    }
    
}
