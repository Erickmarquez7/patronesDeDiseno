//patrón Singleton
//Permite la instancia de solo un ejemplar por clase

//package src.creacion.singleton;
	
//porque hay un solo mexico xd	
public class Mexico{
	//cramos la unica instancia, como es una sola debe ser static
	private static Mexico mexInstance;
	
	//para que no lo puedan crear desde otras clases
	private Mexico() {}
	
	//para obtener la instancia
	public static Mexico getInstance() {
		//verificamos que no se haya insanciado antes
		if(mexInstance == null)
			//como ya vimos que es nulo entonces lo crea
			mexInstance = new Mexico();
			//regresamos la instancia 
		return mexInstance;
	}

	//metodos de prueba
	public String llegada(){
		return "Has llegado a México!";
	}

	public String salida(){
		return "Esperamos verte pronto!";
	}
	


}

