//patrón Singleton
//Permite la instancia de solo un ejemplar por clase

//package src.creacion.singleton;

public class Usuario{
    

    public static void main(String[] args){
        //Esto no porque estaría creando una/otra instancia
        //y además por que es privado xd
        //Mexico mex = new Mexico();
        Mexico mex = Mexico.getInstance();
        System.out.println(mex.llegada());
        System.out.println(mex.salida());

    }


}