package Lista;

public class Aplicacion {

	public static void main(String[] args) {
		
		
		 ListaCir lista = new ListaCir ();
			
		   lista.insertarInicio("Juan");
			lista.insertarFinal("Mario");
			lista.insertarInicio("Carla");
		lista.insertarFinal("Tatiana");
			lista.insertarFinal("Rebeca");
		lista.insertarInicio("Jose");
			
			
			lista.imprimir();
			
			
			
			
	      	lista.buscar("Rebeca");
	      	lista.eliminarElemento("Juan");
	      	
	      	lista.buscarPos(3);
	
	      	lista.imprimir();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
