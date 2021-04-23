//patrón Prototype
//Permite clonar una instancia de clase en diferente dirección de memoria
//como su nombre lo indica, es mas que clonar, es un propotipo, para no 
//tener que crear otra intancia y pasarle los mismo valores, es como un 
//"por defecto"

//package src.creacion.prototype;
//App porque no tuve imaginacion y para saber que aquí está el main xd
public class App{

    public static void main(String[] args){
        CelulaAnimal ca = new CelulaAnimal();
        System.out.println("Es de tipo: " + ca.getClass());
        //clonamos clase
        CelulaAnimal clonCa = (CelulaAnimal) ca.clonar();
        System.out.println("Es de tipo: " + clonCa.getClass());
        //Ponemos las dos
        System.out.println(ca + "\n" + clonCa);
        //comprobamos si es la misma, no es porque es un clon, está en otra dirección de memoria
        //false
        System.out.println( ca == clonCa );
        System.out.println( ca == ca);

        CelulaVegetal cv = new CelulaVegetal();
        CelulaVegetal clonCv = (CelulaVegetal)cv.clonar();
        //false
        System.out.println(cv == clonCv);



    }
}